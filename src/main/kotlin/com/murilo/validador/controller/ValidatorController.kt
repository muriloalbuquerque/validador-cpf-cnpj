package com.murilo.validador.controller

import com.murilo.validador.service.CpfCnpjService
import com.murilo.validador.dto.ValidationResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.http.ResponseEntity

@RestController
class ValidatorController(
    private val service: CpfCnpjService
) {

    @GetMapping("/validar")
    fun validar(@RequestParam numero: String): ResponseEntity<ValidationResult> {
        if (numero.isEmpty()) {
            return ResponseEntity.badRequest().body(
                ValidationResult("Desconhecido", false, "Número não informado")
            )
        }

        val resultado = service.validar(numero)
        return ResponseEntity.ok(resultado)
    }
}
