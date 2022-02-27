package com.enzojc.testconin.service

import com.enzojc.testconin.entity.DetalleProgramacion

interface DetalleProgramacionService {
    fun getAll(): List<DetalleProgramacion>
}