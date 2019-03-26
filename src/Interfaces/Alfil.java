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
		// TODO Apéndice de método generado automáticamente
		return "Alfil [color=" + color + "]";
	}

	@Override
	public String Mover() {
		// TODO Apéndice de método generado automáticamente
		return "El alfil solo se puede mover en dirección diagonal, tantas casillas como se desee";
	}

	@Override
	public String Capturar() {
		// TODO Apéndice de método generado automáticamente
		return "Siempre en diagonal y en el color que de las casillas que pueda.";
	}
}

