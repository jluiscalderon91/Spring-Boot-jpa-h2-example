package com.javabydeveloper.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "MONEDA")
public class Moneda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "ID")
    private int id;

    @Column(name = "NOMBRE_MONEDA")
    private String nomMoneda;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "CREATED_TIME")
    private Date creationTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomMoneda() {
        return nomMoneda;
    }

    public void setNomMoneda(String nomMoneda) {
        this.nomMoneda = nomMoneda;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }
}
