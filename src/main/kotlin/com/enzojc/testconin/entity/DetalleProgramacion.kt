package com.enzojc.testconin.entity

import java.time.Instant
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "detalleProgramacion")
open class DetalleProgramacion(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Int,

    @Column(name = "CodEmpresa")
    var codEmpresa: Int,

    @Column(name = "NomRuta", length = 50)
    var nomRuta: String,

    @Column(name = "NomEmpresa", length = 50)
    var nomEmpresa: String,

    @Column(name = "Fecha")
    var fecha: LocalDate,

    @Column(name = "HoraInicio")
    var horaInicio: Instant,

    @Column(name = "HoraFin")
    var horaFin: Instant,

    @Column(name = "OrigenDestino", length = 50)
    var origenDestino: String
)