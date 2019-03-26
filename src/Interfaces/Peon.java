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
		return "El peón puede avanzar una o dos casillas en dirección vertical en su primer movimiento, después de adelantado por primera vez solo puede avanzar una casilla, a diferencia del resto de piezas no puede ir hacia atrás y no puede capturar las piezas contrarias que se encuentran en la misma dirección en la que se mueve, el peón podrá capturar las piezas que se encuentran a una casilla en diagonal respecto a él, no a las que estén delante de ellos (excepto en la toma de peón al paso). Un peón tiene la capacidad de transformarse en la pieza que su jugador desee (normalmente en dama) si es capaz de alcanzar la última fila del tablero opuesta a la de su bando, por lo que un peón puede adquirir un enorme poder táctico en determinadas posiciones donde no tiene oposición para 'coronar' (peón pasado).";
	}

	@Override
	public String Capturar() {
		// TODO Auto-generated method stub
		return "no puede capturar las piezas contrarias que se encuentran en la misma dirección en la que se mueve, el peón podrá capturar las piezas que se encuentran a una casilla en diagonal respecto a él, no a las que estén delante de ellos (excepto en la toma de peón al paso).";
	}
	
	
	

}
