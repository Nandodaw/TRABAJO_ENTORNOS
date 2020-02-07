package Interfaz;
public interface IProfesor extends IPersona, ITrabajador{
	
	public String getsUniversidad();
	
	public void setsUniversidad(String sUniversidad);
	
	public int getiNumeroAlumnos();
	
	public void setiNumeroAlumnos(int iNumeroAlumnos);
	
	public boolean isbFuncionario();
	
	public void setbFuncionario(boolean bFuncionario);
	
	public void aprobarOposiciones();
}
