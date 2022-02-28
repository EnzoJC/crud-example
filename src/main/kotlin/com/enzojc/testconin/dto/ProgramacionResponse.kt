package com.enzojc.testconin.dto

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.Instant
import java.time.LocalDate
import java.time.LocalTime

data class ProgramacionResponse(
    @JsonProperty("CodEmpresa")
    val codEmpresa: Int,
    @JsonProperty("NomRuta")
    val nomRuta: String,
    @JsonProperty("NomEmpresa")
    val nomEmpresa: String,
    @JsonProperty("Fecha")
    @JsonFormat(pattern = "dd/mm/yyyy")
    val fecha: LocalDate,
    @JsonProperty("HoraInicio")
    @JsonFormat(pattern = "HH:mm:ss")
    val horaInicio: LocalTime,
    @JsonProperty("HoraFin")
    @JsonFormat(pattern = "HH:mm:ss")
    val horaFin: LocalTime,
    @JsonProperty("OrigenDestino")
    val origenDestino: String
)
