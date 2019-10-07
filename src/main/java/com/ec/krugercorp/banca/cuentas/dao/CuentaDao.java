package com.ec.krugercorp.banca.cuentas.dao;

import com.ec.krugercorp.banca.cuentas.model.Cuenta;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CuentaDao extends CrudRepository<Cuenta, Long> {
    List<Cuenta>  findByNroCta(String nroCta);
}
