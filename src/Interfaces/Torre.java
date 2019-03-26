package Interfaces;

public class Torre implements Figura{
	
	String color;

	public Torre(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Torre [color=" + color + "]";
	}

	@Override
	public String Nombre() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return "Torre [color=" + color + "]";
	}

	@Override
	public String Mover() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return "La torre solo se puede mover en las direcciones verticales y horizontales";
	}

	@Override
	public String Capturar() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return "No se capturar en diagonal.";
	}	
}

