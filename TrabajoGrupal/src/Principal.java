
public class Principal {

	public static void main(String[] args) {
		IProfesor p1 = (IProfesor) new Profesor("Carlos", "García Ramos", "28.987.654-Z", 31);
		IPersona p2 = (IPersona) new Profesor("Manuel", "Vázquez López", "16.085.624-A", 29);
		ITrabajador p3 = (ITrabajador) new Profesor("Rosa", "Martos Rodríguez", "75.731.756-R", 27);

		p1.setiSueldo(1500);
		p1.setiAntiguedad(1);
		p1.setsUniversidad("Universidad Pablo de Olavide");
		p1.setiNumeroAlumnos(150);
		p1.setbFuncionario(false);
		((ITrabajador) p2).setiSueldo(1400);
		((ITrabajador) p2).setiAntiguedad(0);
		((IProfesor) p2).setsUniversidad("Universidad Internacional de Andaluc�a");
		((IProfesor) p2).setiNumeroAlumnos(350);
		((IProfesor) p2).setbFuncionario(false);
		p3.setiSueldo(1800);
		p3.setiAntiguedad(3);
		((IProfesor) p3).setsUniversidad("Universidad de C�diz");
		((IProfesor) p3).setiNumeroAlumnos(220);
		((IProfesor) p3).setbFuncionario(false);
		p2.cumpleAnios();
		p1.subirSueldo(20);
		((IProfesor) p3).aprobarOposiciones();

		System.out.println(p1);
		System.out.println("");
		System.out.println(p2);
		System.out.println("");
		System.out.println(p3);
		
	}

}
