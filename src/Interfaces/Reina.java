package Interfaces;

public class Reina implements Figura{
	
	String color;

	public Reina(String color) {
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
		return "Reina [color=" + color + "]";
	}

	@Override
	public String Nombre() {
		// TODO Apéndice de método generado automáticamente
		return "Reina [color=" + color + "]";
	}

	@Override
	public String Mover() {
		// TODO Apéndice de método generado automáticamente
		return "La reina se puede mover en cualquier dirección (vertical, horizontal y diagonales) avanzando o retrocediendo en el tablero el número de casillas que se desee, hasta topar con otra pieza o el borde del tablero.";
	}

	@Override
	public String Capturar() {
		// TODO Apéndice de método generado automáticamente
		return "Se puede capturar en cualquier dirección (vertical, horizontal y diagonales).";
	}
}

