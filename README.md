# TRABAJO_ENTORNOS 

# ¿En qué consiste este proyecto? 🚀
Se creará un proyecto en conjunto con un propietario del repositorio y tres colaboradores, se tendrá un rotundo control de las versiones.

# Software necesario. 📋
Para la correcta realización del proyecto, será necesario los siguiente requisitos:
* jdk v1.8.0.221
* Eclipse v4.13
* Git v2.25.0
* Gitter vONLINE
* Github

# Proceso Instalación. 🔧
Instalación de Eclipse
* Buscamos la página oficial del software que vamos a utilizar.
* Procedemos a la descarga del archivo del programa.
* Configuramos según las necesidades que conlleva el proyecto (developer).

# Console ⚙️
Realizaremos unas pruebas para verificar que el código funciona.

* CÓDIGO: Es el main a través del cuál el código a conjunto de sus interfaces y otra clase se ejecutará y mostrará los datos de salida del proyecto.

package Vista;

import Interfaz.IPersona;

import Interfaz.IProfesor;

import Interfaz.ITrabajador;

import Modelo.Profesor;


public class Principal {

	public static void main(String[] args) {
		IProfesor p1 = (IProfesor) new Profesor("Carlos", "Garcia Ramos", "28.987.654-Z", 31);
		IPersona p2 = (IPersona) new Profesor("Manuel", "Vazquez Lopez", "16.085.624-A", 29);
		ITrabajador p3 = (ITrabajador) new Profesor("Rosa", "Martos Rodriguez", "75.731.756-R", 27);

		p1.setiSueldo(1500);
		p1.setiAntiguedad(1);
		p1.setsUniversidad("Universidad Pablo de Olavide");
		p1.setiNumeroAlumnos(150);
		p1.setbFuncionario(false);
		((ITrabajador) p2).setiSueldo(1400);
		((ITrabajador) p2).setiAntiguedad(0);
		((IProfesor) p2).setsUniversidad("Universidad Internacional de Andalucía");
		((IProfesor) p2).setiNumeroAlumnos(350);
		((IProfesor) p2).setbFuncionario(false);
		p3.setiSueldo(1800);
		p3.setiAntiguedad(3);
		((IProfesor) p3).setsUniversidad("Universidad de Cadiz");
		((IProfesor) p3).setiNumeroAlumnos(220);
		((IProfesor) p3).setbFuncionario(false);
		p2.cumpleAinos();
		p1.subirSueldo(20);
		((IProfesor) p3).aprobarOposiciones();

		System.out.println(p1);
		System.out.println("  ");
		System.out.println(p2);
		System.out.println("  ");
		System.out.println(p3);
		
	}

}


* EJECUCIÓN DEL CÓDIGO: Muestra el resultado al ejecutar la clase MAIN.

PROFESOR CONTRATADO 
Carlos Garcia Ramos 28.987.654-Z
Edad: 31
DNI: 28.987.654-Z
Sueldo: 1500
Antigüedad: 1
Universidad: Universidad Pablo de Olavide
Numero de Alumnos: 150
  
PROFESOR CONTRATADO 
Manuel Vazquez Lopez 16.085.624-A
Edad: 29
DNI: 16.085.624-A
Sueldo: 1400
Antigüedad: 0
Universidad: Universidad Internacional de Andalucía
Numero de Alumnos: 350
  
PROFESOR CONTRATADO 
Rosa Martos Rodriguez 75.731.756-R
Edad: 27
DNI: 75.731.756-R
Sueldo: 1800
Antigüedad: 3
Universidad: Universidad de Cadiz
Numero de Alumnos: 220


# Integrantes del proyecto. ✒️
Esto es un proyecto grupal para la asignatura de Entornos de desarrollo, el cual está compuesto por:
* Luis Miguel Varela Mariscal
* Fernando Morales Roldán
* Isabel Domínguez Villalón
* María Ángeles Gómez Rodríguez

# Licencia 📄

Este proyecto está bajo licencia de un gran equipo formado por un propietario y cuatro colaboradores del instituto MEDAC ©
