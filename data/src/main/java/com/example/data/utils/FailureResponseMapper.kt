package com.example.data.utils

import com.example.domain.model.ApiError
import com.example.domain.model.BadRequestError
import com.example.domain.model.ConflictError
import com.example.domain.model.ForbiddenError
import com.example.domain.model.GoneError
import com.example.domain.model.NotFoundError
import com.example.domain.model.ServerError
import com.example.domain.model.ServiceUnavailableError
import com.example.domain.model.TooManyRequestsError
import com.example.domain.model.UnauthorizedError
import com.example.domain.model.UnsupportedMediaTypeError
import com.example.network.model.FailureResponse

fun FailureResponse.toApiError(): ApiError {
    return when (this.errorCode) {
        404 -> NotFoundError(httpStatus = this.errorCode, message = this.message)
        401 -> UnauthorizedError(httpStatus = this.errorCode, message = this.message)
        403 -> ForbiddenError(httpStatus = this.errorCode, message = this.message)
        400 -> BadRequestError(httpStatus = this.errorCode, message = this.message)
        409 -> ConflictError(httpStatus = this.errorCode, message = this.message)
        410 -> GoneError(httpStatus = this.errorCode, message = this.message)
        415 -> UnsupportedMediaTypeError(httpStatus = this.errorCode, message = this.message)
        429 -> TooManyRequestsError(httpStatus = this.errorCode, message = this.message)
        503 -> ServiceUnavailableError(httpStatus = this.errorCode, message = this.message)
        500 -> ServerError(httpStatus = this.errorCode, message = this.message)
        else -> object : ApiError {
            override val httpStatus: Int = this@toApiError.errorCode
            override val message: String = this@toApiError.message.ifEmpty { "An unknown error occurred." }
        }
    }
}