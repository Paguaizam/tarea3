/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3;

/**
 *
 * @author Paul Aguaiza
 */
public class Candidato {
    String nombre;
    String titulo;
    int edad;
    
    public String edadValidaInscripcion(){
    var retorno="No valido";
        if(edad>=30){
        retorno="APROBADO";
        }
    return retorno;
}
}
