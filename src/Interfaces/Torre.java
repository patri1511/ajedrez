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
		// TODO Apéndice de método generado automáticamente
		return "Torre [color=" + color + "]";
	}

	@Override
	public String Mover() {
		// TODO Apéndice de método generado automáticamente
		return "La torre solo se puede mover en las direcciones verticales y horizontales";
	}

	@Override
	public String Capturar() {
		// TODO Apéndice de método generado automáticamente
		return "No se capturar en diagonal.";
	}	
}

