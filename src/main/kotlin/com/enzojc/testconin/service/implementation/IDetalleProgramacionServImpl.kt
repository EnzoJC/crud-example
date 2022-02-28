package com.enzojc.testconin.service.implementation

import com.enzojc.testconin.entity.DetalleProgramacion
import com.enzojc.testconin.repository.DetalleProgramacionRepository
import com.enzojc.testconin.service.IDetalleProgramacionService
import org.springframework.beans.factory.annotation.Autowired

class IDetalleProgramacionServImpl: IDetalleProgramacionService {
    @Autowired
    lateinit var detalleProgramacionRepository: DetalleProgramacionRepository

    override fun getAll(): List<DetalleProgramacion> = detalleProgramacionRepository.findAll()
}