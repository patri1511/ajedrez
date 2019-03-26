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
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return "Reina [color=" + color + "]";
	}

	@Override
	public String Mover() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return "La reina se puede mover en cualquier direcci�n (vertical, horizontal y diagonales) avanzando o retrocediendo en el tablero el n�mero de casillas que se desee, hasta topar con otra pieza o el borde del tablero.";
	}

	@Override
	public String Capturar() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return "Se puede capturar en cualquier direcci�n (vertical, horizontal y diagonales).";
	}
}

