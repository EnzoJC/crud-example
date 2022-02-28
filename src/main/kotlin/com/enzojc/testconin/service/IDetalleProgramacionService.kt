package com.enzojc.testconin.service

import com.enzojc.testconin.entity.DetalleProgramacion

interface IDetalleProgramacionService {
    fun getAll(): List<DetalleProgramacion>
}