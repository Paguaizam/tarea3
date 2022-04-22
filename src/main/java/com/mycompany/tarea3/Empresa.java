/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3;

/**
 *
 * @author Paul Aguaiza
 */
public class Empresa {
   String nombre;
   int yearInicio;
   int yearActual;
   Empleado empleados;
   Departamento tipoDepartamento;
   
   public int yearsEmpresa(){
    var retorno=this.yearActual-this.yearInicio;
    return retorno;
   }
   
}
