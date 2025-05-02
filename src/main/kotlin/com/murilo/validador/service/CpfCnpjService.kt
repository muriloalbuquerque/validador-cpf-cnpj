package com.murilo.validador.service

import com.murilo.validador.dto.ValidationResult
import org.springframework.stereotype.Service

@Service
class CpfCnpjService {

    fun validar(numero: String): ValidationResult {

        val somenteDigitos = numero.filter { it.isDigit() }

        val (tipo, valido) = when (somenteDigitos.length) {
            11 -> "CPF" to validarCpf(somenteDigitos)
            14 -> "CNPJ" to validarCnpj(somenteDigitos)
            else -> "Desconhecido" to false
        }

        val mensagem = if (valido) "$tipo válido" else "$tipo inválido"

        return ValidationResult(tipo, valido, mensagem)
    }

    private fun validarCpf(cpf: String): Boolean {
        if (cpf.length != 11 || cpf.all { it == cpf[0] }) return false

        val digitos = cpf.map { it.toString().toInt() }

        val soma1 = (0 until 9).sumOf { (10 - it) * digitos[it] }
        val dv1 = ((soma1 * 10) % 11).let { if (it == 10) 0 else it }

        val soma2 = (0 until 10).sumOf { (11 - it) * digitos[it] }
        val dv2 = ((soma2 * 10) % 11).let { if (it == 10) 0 else it }

        return digitos[9] == dv1 && digitos[10] == dv2
    }

    private fun validarCnpj(cnpj: String): Boolean {
        if (cnpj.length != 14 || cnpj.all { it == cnpj[0] }) return false

        val digitos = cnpj.map { it.toString().toInt() }

        val pesos1 = listOf(5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2)
        val soma1 = pesos1.mapIndexed { i, peso -> digitos[i] * peso }.sum()
        val dv1 = (soma1 % 11).let { if (it < 2) 0 else 11 - it }

        val pesos2 = listOf(6) + pesos1
        val soma2 = pesos2.mapIndexed { i, peso -> digitos[i] * peso }.sum()
        val dv2 = (soma2 % 11).let { if (it < 2) 0 else 11 - it }

        return digitos[12] == dv1 && digitos[13] == dv2
    }
}
