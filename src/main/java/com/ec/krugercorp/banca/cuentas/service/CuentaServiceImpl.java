package com.ec.krugercorp.banca.cuentas.service;

import com.ec.krugercorp.banca.cuentas.dao.CuentaDao;
import com.ec.krugercorp.banca.cuentas.model.Cuenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CuentaServiceImpl implements CuentaService {

    @Autowired
    private CuentaDao cuentaDao;

    @Override
    public void guardar(Cuenta cuenta) {
        cuentaDao.save(cuenta);

    }

    @Override
    public void consultar(Long id) {

    }

    @Override
    public Cuenta findOne(Long id) {
        return cuentaDao.findById(id).orElse(null);
    }

    @Override
    public List<Cuenta> ListarMovimientos(String nroCta) {
        return cuentaDao.findByNroCta(nroCta);
    }


    @Override
    public void eliminar(Cuenta cuenta) {
        cuentaDao.delete(cuenta);
    }

    @Override
    public List<Cuenta> findAll() {
        return (List<Cuenta>) cuentaDao.findAll();
    }
}
