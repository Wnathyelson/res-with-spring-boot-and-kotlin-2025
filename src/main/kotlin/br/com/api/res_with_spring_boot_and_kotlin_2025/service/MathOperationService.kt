package br.com.api.res_with_spring_boot_and_kotlin_2025.service

interface MathOperationService {

    fun math(numberOne: String?, operation: String?, numberTwo: String?): Double

    fun sqrt(number: String?): Double
}