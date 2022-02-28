package com.enzojc.testconin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/Conin/api")
class ProgramacionController {
    @GetMapping("/ProgramacionSoporte")
    fun index(
        @RequestParam(value = "FechaInicio", required = true) fecha: String,
        @RequestParam(value = "CodUsuarioConin", required = true) codUsuarioConin: String
    ): String {
        return "{\n" +
                "    \"Programacion\":{\n" +
                "        \"DetalleProgramacion\":[\n" +
                "            {\n" +
                "                \"CodEmpresa\":25,\n" +
                "                \"NomRuta\":\"301\",\n" +
                "                \"NomEmpresa\":\"PRUEBAS\",\n" +
                "                \"Fecha\":\"25/04/2022\",\n" +
                "                \"HoraInicio\":\"08:00:00\",\n" +
                "                \"HoraFin\":\"17:30:00\",\n" +
                "                \"OrigenDestino\":\"SANTO DOMINGO\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"CodEmpresa\":25,\n" +
                "                \"NomRuta\":\"301\",\n" +
                "                \"NomEmpresa\":\"PRUEBAS\",\n" +
                "                \"Fecha\":\"26/04/2022\",\n" +
                "                \"HoraInicio\":\"08:00:00\",\n" +
                "                \"HoraFin\":\"17:30:00\",\n" +
                "                \"OrigenDestino\":\"SANTO DOMINGO\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"CodEmpresa\":25,\n" +
                "                \"NomRuta\":\"301\",\n" +
                "                \"NomEmpresa\":\"PRUEBAS\",\n" +
                "                \"Fecha\":\"27/04/2022\",\n" +
                "                \"HoraInicio\":\"07:00:00\",\n" +
                "                \"HoraFin\":\"16:00:00\",\n" +
                "                \"OrigenDestino\":\"SANTO DOMINGO\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"CodEmpresa\":25,\n" +
                "                \"NomRuta\":\"301\",\n" +
                "                \"NomEmpresa\":\"PRUEBAS\",\n" +
                "                \"Fecha\":\"28/04/2022\",\n" +
                "                \"HoraInicio\":\"06:00:00\",\n" +
                "                \"HoraFin\":\"14:00:00\",\n" +
                "                \"OrigenDestino\":\"SANTO DOMINGO\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"CodEmpresa\":25,\n" +
                "                \"NomRuta\":\"301\",\n" +
                "                \"NomEmpresa\":\"PRUEBAS\",\n" +
                "                \"Fecha\":\"29/04/2022\",\n" +
                "                \"HoraInicio\":\"05:00:00\",\n" +
                "                \"HoraFin\":\"13:00:00\",\n" +
                "                \"OrigenDestino\":\"SANTO DOMINGO\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"CodEmpresa\":25,\n" +
                "                \"NomRuta\":\"301\",\n" +
                "                \"NomEmpresa\":\"PRUEBAS\",\n" +
                "                \"Fecha\":\"30/04/2022\",\n" +
                "                \"HoraInicio\":\"05:00:00\",\n" +
                "                \"HoraFin\":\"13:00:00\",\n" +
                "                \"OrigenDestino\":\"SANTO DOMINGO\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "}"
    }
}