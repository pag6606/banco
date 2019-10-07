package com.ec.krugercorp.banca.cuentas.service;

import com.ec.krugercorp.banca.cuentas.model.Cuenta;

import java.util.List;


public interface CuentaService {

    void guardar( Cuenta cuenta);
    void consultar(Long id);
    void eliminar (Cuenta cuenta);
    List<Cuenta> findAll();
    Cuenta findOne(Long id);
    List<Cuenta> ListarMovimientos(String nroCta);
}
