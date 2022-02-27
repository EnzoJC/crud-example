package com.enzojc.testconin.dto

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.Instant
import java.time.LocalDate

data class ProgramacionResponse(
    @JsonProperty("CodEmpresa")
    val codEmpresa: Int,
    @JsonProperty("NomRuta")
    val nomRuta: String,
    @JsonProperty("NomEmpresa")
    val nomEmpresa: String,
    @JsonProperty("Fecha")
    val fecha: LocalDate,
    @JsonProperty("HoraInicio")
    val horaInicio: Instant,
    @JsonProperty("HoraFin")
    val horaFin: Instant,
    @JsonProperty("OrigenDestino")
    val origenDestino: String
)
