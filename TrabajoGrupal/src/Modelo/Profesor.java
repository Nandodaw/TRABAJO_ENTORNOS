package Modelo;

public class Profesor {

	private String sNombre;
	private String sApellidos;
	private String sDni;
	private int iEdad;
	private int iSueldo;
	private int iAntiguedad;
	private String sUniversidad;
	private int iNumeroAlumnos;
	private boolean bFuncionario;
	////////////////
	 //Constructor//
	////////////////
	public Profesor(String sNombre, String sApellidos, String sDni, int iEdad) {
		setsNombre(sNombre);
		setsApellidos(sApellidos);
		setsDni(sDni);
		setiEdad(iEdad);
		setiSueldo(iSueldo);
		setiAntiguedad(iAntiguedad);
		setsUniversidad(sUniversidad);
		setiNumeroAlumnos(iNumeroAlumnos);
		setbFuncionario(bFuncionario);
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getsApellidos() {
		return sApellidos;
	}

	public void setsApellidos(String sApellidos) {
		this.sApellidos = sApellidos;
	}

	public String getsDni() {
		return sDni;
	}

	public void setsDni(String sDni) {
		this.sDni = sDni;
	}

	public int getiEdad() {
		return iEdad;
	}

	public void setiEdad(int iEdad) {
		this.iEdad = iEdad;
	}

	public int getiSueldo() {
		return iSueldo;
	}

	public void setiSueldo(int iSueldo) {
		this.iSueldo = iSueldo;
	}

	public int getiAntiguedad() {
		return iAntiguedad;
	}

	public void setiAntiguedad(int iAntiguedad) {
		this.iAntiguedad = iAntiguedad;
	}

	public String getsUniversidad() {
		return sUniversidad;
	}

	public void setsUniversidad(String sUniversidad) {
		this.sUniversidad = sUniversidad;
	}

	public int getiNumeroAlumnos() {
		return iNumeroAlumnos;
	}

	public void setiNumeroAlumnos(int iNumeroAlumnos) {
		this.iNumeroAlumnos = iNumeroAlumnos;
	}

	public boolean isbFuncionario() {
		return bFuncionario;
	}

	public void setbFuncionario(boolean bFuncionario) {
		this.bFuncionario = bFuncionario;
	}
	
	public void aprobarOposiciones() {
	}
	public void subirSueldo(int iPorcentaje) {
		
	}
	public void cumpleAinos(){
	}
	
	
	
	
	public String toString() {
		String sResultado = "";
		if (!bFuncionario) {
			sResultado = "PROFESOR CONTRATADO \n" + getsNombre() + " " + getsApellidos() + " " + getsDni() + "\n"
					+ "Edad: " + getiEdad() + "\n" + "DNI: " + getsDni() + "\n" + "Sueldo: " + getiSueldo() + "\n"
					+ "Antigüedad: " + getiAntiguedad() + "\n" + "Universidad: " + getsUniversidad() + "\n"
					+ "Numero de Alumnos: " + getiNumeroAlumnos();
		} else {
			sResultado = "PROFESOR FUNCIONARIO \n" + getsNombre() + " " + getsApellidos() + " " + getsDni() + "\n"
					+ "Edad: " + getiEdad() + "\n" + "DNI: " + getsDni() + "\n" + "Sueldo: " + getiSueldo() + "\n"
					+ "Antigüedad: " + getiAntiguedad() + "\n" + "Universidad: " + getsUniversidad() + "\n"
					+ "Numero de Alumnos: " + getiNumeroAlumnos();
		}
		return sResultado;
	}

}
