/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3;





/**
 *
 * @author Paul Aguaiza
 */
public class Eleccion {
    int votos;
    public boolean eleccionValida(){
        var retorno=false;
     if(votos>10000){
         retorno=true;
     }
     return retorno;
    }
}
