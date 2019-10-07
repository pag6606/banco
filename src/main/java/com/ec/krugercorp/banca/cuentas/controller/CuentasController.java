package com.ec.krugercorp.banca.cuentas.controller;

import com.ec.krugercorp.banca.cuentas.model.Cuenta;
import com.ec.krugercorp.banca.cuentas.service.CuentaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cuenta")
@CrossOrigin(origins = "{*}")
@Api(value = "Creación de cuentas", description = "Servicio para crear cuentas")
public class CuentasController {

    @Autowired
    private CuentaService cuentaService;
    @ApiOperation(value = "Crear la cuenta del cliente")
    @PostMapping(value = "/crear")
    public String createAccount(@RequestBody Cuenta cuenta) {
       cuentaService.guardar(cuenta);
       return "Cuenta creada exitosamente";
    }

}
