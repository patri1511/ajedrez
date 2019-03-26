package Interfaces;

public class Caballo implements Figura{
	
	String color;

	public Caballo(String color) {
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
		return "Caballo [color=" + color + "]";
	}

	@Override
	public String Nombre() {
		// TODO Auto-generated method stub
		return "Caballo [color=" + color + "]";
	}

	@Override
	public String Mover() {
		// TODO Auto-generated method stub
		return "El caballo se puede mover a la casilla más cercana que no se encuentre en su propia fila, columna o diagonal";
	}

	@Override
	public String Capturar() {
		// TODO Auto-generated method stub
		return "Se mueve avanzando 2 casillas en vertical y una en horizontal, o viceversa, realizando un movimiento de ‘L’, siendo la única pieza que puede saltar por encima de las demás piezas.";
	}
}

