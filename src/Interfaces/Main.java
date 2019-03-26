package Interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Peon a2 = new Peon("blanco");
		Peon a7 = new Peon("negro");
		
		System.out.println(a2.Mover());
		System.out.println(a2.Capturar());
		System.out.println(a2.Nombre());
		
				
		Caballo b1 = new Caballo("blanco");
		Caballo b8 = new Caballo("negro");
		
		System.out.println(b1.Mover());
		System.out.println(b1.Capturar());
		System.out.println(b1.Nombre());
		
		
		Alfil c1 = new Alfil("blanco");
		Alfil c8 = new Alfil("negro");
		
		System.out.println(c1.Mover());
		System.out.println(c1.Capturar());
		System.out.println(c1.Nombre());
		
		Torre a1 = new Torre("blanco");
		Torre a8 = new Torre("negro");
		
		System.out.println(a1.Mover());
		System.out.println(a1.Capturar());
		System.out.println(a1.Nombre());
		
		Reina e1 = new Reina("blanco");
		Reina e8 = new Reina("negro");
		
		System.out.println(e1.Mover());
		System.out.println(e1.Capturar());
		System.out.println(e1.Nombre());
		
		Rey d1 = new Rey("blanco");
		Rey d8 = new Rey("negro");
		
		System.out.println(d1.Mover());
		System.out.println(d1.Capturar());
		System.out.println(d1.Nombre());
		
	}

}
