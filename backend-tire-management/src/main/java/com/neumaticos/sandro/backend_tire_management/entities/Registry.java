package com.neumaticos.sandro.backend_tire_management.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="registry")
public class Registry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tire_size;
    private String tire_model;
    private String target;
    private String client_name;
    private Integer client_number;
    private String note;
    private String provider;
    private Float deposit;
    private Date date;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTire_size() {
        return tire_size;
    }
    public void setTire_size(String tire_size) {
        this.tire_size = tire_size;
    }
    public String getTire_model() {
        return tire_model;
    }
    public void setTire_model(String tire_model) {
        this.tire_model = tire_model;
    }
    public String getTarget() {
        return target;
    }
    public void setTarget(String target) {
        this.target = target;
    }
    public String getClient_name() {
        return client_name;
    }
    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }
    public Integer getClient_number() {
        return client_number;
    }
    public void setClient_number(Integer client_number) {
        this.client_number = client_number;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public String getProvider() {
        return provider;
    }
    public void setProvider(String provider) {
        this.provider = provider;
    }
    public Float getDeposit() {
        return deposit;
    }
    public void setDeposit(Float deposit) {
        this.deposit = deposit;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    


}
