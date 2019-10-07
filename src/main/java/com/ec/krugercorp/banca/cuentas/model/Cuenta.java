package com.ec.krugercorp.banca.cuentas.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
public class Cuenta implements Serializable {

    private static  final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;


    @Column(name="nro_cta")
    private String nroCta;

    @Column(name="tipo_cta")
    private String tipoCta;

    @Column(name="saldo_inicial")
    private Double saldoInicial;


    @Column(name="create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Cuenta(long id, String nroCta, String tipoCta, Double saldoInicial) {
        this.id = id;
        this.nroCta = nroCta;
        this.tipoCta = tipoCta;
        this.saldoInicial = saldoInicial;
    }

    public Cuenta(){

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNroCta() {
        return nroCta;
    }

    public void setNroCta(String nroCta) {
        this.nroCta = nroCta;
    }

    public String getTipoCta() {
        return tipoCta;
    }

    public void setTipoCta(String tipoCta) {
        this.tipoCta = tipoCta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }


}
