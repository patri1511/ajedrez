package Interfaces;

public class Peon implements Figura {
	
	String color;

	public Peon(String color) {
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
		return "Peon [color=" + color + "]";
	}

	@Override
	public String Nombre() {
		// TODO Auto-generated method stub
		return "Peon [color=" + color + "]";
	}

	@Override
	public String Mover() {
		// TODO Auto-generated method stub
		return "El pe�n puede avanzar una o dos casillas en direcci�n vertical en su primer movimiento, despu�s de adelantado por primera vez solo puede avanzar una casilla, a diferencia del resto de piezas no puede ir hacia atr�s y no puede capturar las piezas contrarias que se encuentran en la misma direcci�n en la que se mueve, el pe�n podr� capturar las piezas que se encuentran a una casilla en diagonal respecto a �l, no a las que est�n delante de ellos (excepto en la toma de pe�n al paso). Un pe�n tiene la capacidad de transformarse en la pieza que su jugador desee (normalmente en dama) si es capaz de alcanzar la �ltima fila del tablero opuesta a la de su bando, por lo que un pe�n puede adquirir un enorme poder t�ctico en determinadas posiciones donde no tiene oposici�n para 'coronar' (pe�n pasado).";
	}

	@Override
	public String Capturar() {
		// TODO Auto-generated method stub
		return "no puede capturar las piezas contrarias que se encuentran en la misma direcci�n en la que se mueve, el pe�n podr� capturar las piezas que se encuentran a una casilla en diagonal respecto a �l, no a las que est�n delante de ellos (excepto en la toma de pe�n al paso).";
	}
	
	
	

}
