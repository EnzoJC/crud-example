package com.enzojc.testconin.repository;

import com.enzojc.testconin.entity.DetalleProgramacion
import org.springframework.data.jpa.repository.JpaRepository

interface DetalleProgramacionRepository : JpaRepository<DetalleProgramacion, Int> {
}