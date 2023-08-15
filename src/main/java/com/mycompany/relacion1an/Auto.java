/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relacion1an;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EQUIPO
 */
public class Auto {
    
    int id;
    String marca;
    String modelo;
    
    List<Propietario> listaProp;

    public Auto() {
    }

    public Auto(int id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Propietario> getListaProp() {
        return listaProp;
    }

    public void setListaProp(List<Propietario> listaProp) {
        this.listaProp = listaProp;
    }
    
    
    
}
