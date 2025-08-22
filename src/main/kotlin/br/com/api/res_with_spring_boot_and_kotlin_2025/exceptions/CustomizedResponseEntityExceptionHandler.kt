package br.com.api.res_with_spring_boot_and_kotlin_2025.exceptions

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.lang.Exception
import java.util.Date

@ControllerAdvice
@RestController
class CustomizedResponseEntityExceptionHandler : ResponseEntityExceptionHandler() {

    @ExceptionHandler(Exception::class)
    fun handleAllExceptions(ex: Exception, request: WebRequest): ResponseEntity<ResponseException> {
        val response = ResponseException(
            Date(),
            ex.message,
            request.getDescription(false)
        )
        return ResponseEntity<ResponseException>(response, HttpStatus.INTERNAL_SERVER_ERROR)
    }

    @ExceptionHandler(UnsupportedMathOperationException::class)
    fun handleAllBadRequestExceptions(ex: Exception, request: WebRequest): ResponseEntity<ResponseException> {
        val response = ResponseException(
            Date(),
            ex.message,
            request.getDescription(false)
        )
        return ResponseEntity<ResponseException>(response, HttpStatus.BAD_REQUEST)
    }
}