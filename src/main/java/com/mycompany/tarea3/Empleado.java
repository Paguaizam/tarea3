/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3;

/**
 *
 * @author Paul Aguaiza
 */
class Empleado {
 String nombre;
 int edad;
 double experienciaLaboral;
 String titulo;
 
 public boolean experienciaValida(){
 var retorno= false;
 if(this.experienciaLaboral>0.5){
     retorno=true;
 }
 return retorno;
 }
}
