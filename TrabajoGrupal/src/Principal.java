
public class Principal {

	public static void main(String[] args) {
		IProfesor p1 = (IProfesor) new Profesor("Carlos", "García Ramos", "28.987.654-Z", 31);
		IPersona p2 = (IPersona) new Profesor("Manuel", "Vázquez López", "16.085.624-A", 29);
		ITrabajador p3 = (ITrabajador) new Profesor("Rosa", "Martos Rodríguez", "75.731.756-R", 27);

	}

}
