/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3;

/**
 *
 * @author Paul Aguaiza
 */
class Departamento {
  String area;
  int trabajadores;
  int puestosDeTrabajo;
  
  public String puestoTrabajoDisponible(){
      if(this.puestosDeTrabajo<10){
      }
         var retorno = "Empleo no disponible";
         return retorno;
    }
}
