package br.com.api.res_with_spring_boot_and_kotlin_2025.controller

import br.com.api.res_with_spring_boot_and_kotlin_2025.service.MathOperationService
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MathController(val service: MathOperationService) {

    @PostMapping("/math/{numberOne}/{operation}/{numberTwo}")
    fun math(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "operation") operation: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double {
        return service.math(numberOne, operation, numberTwo)
    }

    @PostMapping("/sqrt/{number}")
    fun sqrt(
        @PathVariable(value = "number") number: String?
    ): Double {
        return service.sqrt(number)
    }
}