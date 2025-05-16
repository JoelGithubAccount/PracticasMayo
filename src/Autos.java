

public class Autos {
	//Atributos del Objeto
	//Declarar nuestras variables
	//Sintaxis para declarar las variables
	//ModificadorDeAcceso tipoDeDato nombreVariable
	
	String marca;
	String modelo;
	String color;
	int anio;
	double precio;
	
	//Constructor Vacio --- Para realizar la instacia de clase --- Objeto Vacio
	public Autos() {
	}

	//Constructor con todos los parametros
	//Sobrecarga de metodos
	public Autos(String marca, String modelo, String color, int anio, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.anio = anio;
		this.precio = precio;
	}
	
	//toString --- te convierte un objeto a cadena
	@Override
	public String toString() {
		return "Autos [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", anio=" + anio + ", precio="
				+ precio + "]";
	}
	
	
	//Encapsulamiento
	//Metodos: Funciones(retorno) y procedimientos(no tienen retorno)
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
	
}
