package br.com.api.res_with_spring_boot_and_kotlin_2025

import br.com.api.res_with_spring_boot_and_kotlin_2025.exceptions.UnsupportedMathOperationException
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MathController {

    @PostMapping("/math/{numberOne}/{operation}/{numberTwo}")
    fun sum(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "operation") operation: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double {
        if (!isNumeric(numberOne) ||
            !isNumeric(numberTwo)
        ) throw UnsupportedMathOperationException("Por favor, insira valores numéricos!")
        return mathOperation(numberOne, operation, numberTwo)
    }

    private fun mathOperation(numberOne: String?, operation: String?, numberTwo: String?): Double {
        val convertedValueOne = convertToDouble(numberOne)
        val convertedValueTwo = convertToDouble(numberTwo)

        return when (operation) {
            "sum" -> convertedValueOne + convertedValueTwo
            "sub" -> convertedValueOne - convertedValueTwo
            "div" -> convertedValueOne / convertedValueTwo
            "multi" -> convertedValueOne * convertedValueTwo
            "medium" -> (convertedValueOne + convertedValueTwo) / 2
            "sqrt" -> (convertedValueOne * convertedValueOne)
            else -> 0.0
        }
    }

    private fun convertToDouble(number: String?): Double {
        if (number.isNullOrBlank()) return 0.0

        val convertedNumber = number.replace(",".toRegex(), ".")

        return if (isNumeric(convertedNumber)) convertedNumber.toDouble() else 0.0

    }

    private fun isNumeric(number: String?): Boolean {
        if (number.isNullOrBlank()) return false
        val convertedNumber = number.replace(",".toRegex(), ".")
        return convertedNumber.matches("""[-+]?[0-9]*\.?[0-9]+""".toRegex())
    }
}