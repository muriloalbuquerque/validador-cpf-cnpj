package com.murilo.validador.dto

data class ValidationResult(
    val tipo: String,
    val valido: Boolean,
    val mensagem: String,
)
