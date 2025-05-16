
public class Principal {

	public static void main(String[] args) {
		//main es el punto de entrada principal de un programa
		// TODO Auto-generated method stub

		
		//Instancia de clase, el constructor vacio
		//Como crear objetos en java: NombreClase nombreObjeto = new Constructores;
		Autos auto = new Autos();
		
		//Asignacion de valores
		auto.marca = "Toyota";
		auto.modelo = "Tacoma";
		auto.color = "Rosado";
		auto.anio = 2025;
		auto.precio = 253.000;
		
		//Mostrar ese objetos con sus atributos
		System.out.println("Datos del primer auto");
		System.out.println("Marca " + auto.marca);
		System.out.println("Modelo " + auto.modelo);
		System.out.println("Color " + auto.color);
		System.out.println("Año " + auto.anio);
		System.out.println("Precio " + auto.precio + "$");
		
		//Instancia de clase el constructor vacio
		Autos auto2 = new Autos();
		
		//Encapsulamiento
		//Asignacion de valores ---SET(Enviar)
		auto2.setMarca("Nissan");
		auto2.setModelo("Berza");
		auto2.setColor("Verde");
		auto2.setAnio(2025);
		auto2.setPrecio(400.0);
			
		//Mostrar ---- GET(Obtener)
		System.out.println("Datos del segundo auto");
		System.out.println("Marca " + auto2.getMarca());
		System.out.println("Modelo " + auto2.getModelo());
		System.out.println("Año " + auto2.getAnio());
		System.out.println("Precio " + auto2.getPrecio());
		System.out.println("Color " + auto2.getColor());
		
		// Instancia de clase con el constructor con todos los parametros
		Autos auto3=new Autos("Chevrolet", "TRACKER", "Rojo", 2024, 250000);
		
		//Mostrar 
		System.out.println("Datos del Auto numero 3");
		System.out.println(auto3);
		
		//Realizar nuevo proyecto
		//ProyectoLibreria
		
		//Clase Libros
			//Atributos: Titulo, Autor, Numero de Paginas, Editorial, Precio
			//Constructor Vacio
			//Constructor con parametros(Clave, Titulo, Precio)
			//toString
			//Encapsulamiento
		//Clase con el metodo main
		//Realizar la instancia de clase y asignacion de valores con variables publicas
		//Realizar la instancia de clase con el constructor vacio y asignacion de valores variables publicas 
		//Realizar la instancia de clase con el constructor de parametros
			
		
	}
		
}
