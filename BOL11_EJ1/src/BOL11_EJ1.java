
public class BOL11_EJ1 {
	public static void main(String[] args) {
		IReproductorPortatil p = new ReproductorPortatil("Sony", "DINF", 1);
		p.setAncho(50);
		p.setPeso(58);
		p.setCapacidadDeAlmacenamiento(100000);
		p.setAlto(0.75);
		p.setReproduceSonido(true);
		p.setReproduceVideo(false);
		p.setGrosor(33);
		p.setAutonomia(3400);
		p.setPantalla(18);
		p.setTipoBateria(10);
	
		System.out.println(p);
		System.out.println("---------------------------------------------");
		// EJERCICIO 2
		IReproductorAudio a = new ReproductorDeAudio("Sony", "HHHE", 3);
		a.setAncho(50);
		a.setPeso(58);
		a.setCapacidadDeAlmacenamiento(100000);
		a.setAlto(0.75);
		a.setReproduceSonido(true);
		a.setReproduceVideo(false);
		a.setGrosor(33);
		a.setAutonomia(3400);
		a.setPantalla(18);
		a.setTipoBateria(10);
		////-------------AUDIO------------////
		a.setReproduceWMA(true);
		a.setReproduceMP3(true);
		System.out.println(a);


	}

}
