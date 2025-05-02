package com.murilo.validador.service

import com.murilo.validador.service.CpfCnpjService
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CpfCnpjServiceTest {

    private lateinit var service: CpfCnpjService

    @BeforeEach
    fun setUp() {
        service = CpfCnpjService()
    }

    @Test
    fun `CPF válido deve retornar valido true`() {
        val result = service.validar("52998224725") // CPF válido
        assertTrue(result.valido)
        assertEquals("CPF", result.tipo)
    }

    @Test
    fun `CPF inválido deve retornar valido false`() {
        val result = service.validar("12345678900")
        assertFalse(result.valido)
        assertEquals("CPF", result.tipo)
    }

    @Test
    fun `CNPJ válido deve retornar valido true`() {
        val result = service.validar("11444777000161") // CNPJ válido
        assertTrue(result.valido)
        assertEquals("CNPJ", result.tipo)
    }

    @Test
    fun `CNPJ inválido deve retornar valido false`() {
        val result = service.validar("00000000000000")
        assertFalse(result.valido)
        assertEquals("CNPJ", result.tipo)
    }

    @Test
    fun `Formato inválido deve retornar tipo desconhecido`() {
        val result = service.validar("abc")
        assertFalse(result.valido)
        assertEquals("Desconhecido", result.tipo)
    }
}
