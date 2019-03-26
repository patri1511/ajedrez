package Interfaces;

public class Alfil implements Figura{
	
	String color;

	public Alfil(String color) {
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
		return "Alfil [color=" + color + "]";
	}

	@Override
	public String Nombre() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return "Alfil [color=" + color + "]";
	}

	@Override
	public String Mover() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return "El alfil solo se puede mover en direcci�n diagonal, tantas casillas como se desee";
	}

	@Override
	public String Capturar() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return "Siempre en diagonal y en el color que de las casillas que pueda.";
	}
}

