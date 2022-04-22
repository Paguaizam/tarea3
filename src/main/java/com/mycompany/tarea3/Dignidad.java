/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3;

/**
 *
 * @author Paul Aguaiza
 */
public class Dignidad {
 String dignidad;
 Candidato persona;
 int yearEleccion; 
 Eleccion votos;
 public int tiempoAGobernar(){
     var retorno= this.yearEleccion+4;
     return retorno;
 }
}
