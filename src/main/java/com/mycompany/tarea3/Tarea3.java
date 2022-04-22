/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea3;

/**
 *
 * @author Paul Aguaiza
 */
public class Tarea3 {

    public static void main(String[] args) {
       
        var participante=new Candidato();
        participante.nombre = "Saul Cordova";
        participante.edad = 44;
        participante.titulo = "Economista";
        var voto = new Eleccion();
        voto.votos=190110;
        voto.eleccionValida();
        var dig = new Dignidad();
        dig.dignidad= "Alcalde";
        dig.persona=participante;
        dig.votos=voto;
        dig.yearEleccion=2022;
        var aprobado=participante.edadValidaInscripcion();
        var year = dig.tiempoAGobernar();
       
        System.out.println("Nombre del candidato: "+participante.nombre+"/ Titulo: "+participante.titulo+"/ Candidato: "
                            + aprobado+"/"+"Dignidad: "+dig.dignidad +"/"+" Año limite a gobernar: "+dig.tiempoAGobernar()+
                            "/"+ "La eleccion es valida: "+voto.eleccionValida());
        ///////////////////////////////////////////////////////////////////////////
        
       var trabajador=new Empleado();
       trabajador.nombre="Luis Lopez";
       trabajador.edad=25;
       trabajador.titulo="Ing. en Sistemas";
       trabajador.experienciaLaboral=0.6;
       var empresa= new Empresa();
       empresa.nombre="Alcatel";
       empresa.yearActual=2022;
       empresa.yearInicio=1990;
       var aprobar= trabajador.experienciaValida();
       var valido= empresa.yearsEmpresa();
       System.out.println("Nombre de la Empresa: "+empresa.nombre+"/ "+"Años funcionando: "+valido+trabajador.nombre+aprobar);
        
    }
}
