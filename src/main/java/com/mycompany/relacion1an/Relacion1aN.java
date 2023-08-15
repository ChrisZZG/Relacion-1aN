/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.relacion1an;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EQUIPO
 */
public class Relacion1aN {

    public static void main(String[] args) {
        
        Auto autito = new Auto();
        
        autito.setId(2);
        autito.setMarca("Renault");
        autito.setModelo("A03");
        
        List<Propietario> listaProp = new ArrayList<Propietario> ();
        
        listaProp.add(new Propietario(1, "Pepe", "Argento"));
        listaProp.add(new Propietario(2, "Moni", "Argento"));
        listaProp.add(new Propietario(3, "Paola", "Argento"));
        
        autito.setListaProp(listaProp);
        
        System.out.println("Los Propietarios para el Auto: " + autito.getMarca() + " " + autito.getModelo() + " son:");
        for(Propietario propi:listaProp){
            System.out.println("-" + propi.getNombre() + " " + propi.getApellido());
        }
    }
}
