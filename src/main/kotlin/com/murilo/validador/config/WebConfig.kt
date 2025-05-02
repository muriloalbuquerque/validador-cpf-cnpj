package com.murilo.validador.config   // ou "controller" se não quiser criar o pacote "config"

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig : WebMvcConfigurer {
    override fun addCorsMappings(registry: CorsRegistry) {
        registry
            .addMapping("/**")       // todas as rotas
            .allowedOrigins("*")     // permite qualquer origem
            .allowedMethods("GET","POST","PUT","DELETE","OPTIONS")
    }
}
