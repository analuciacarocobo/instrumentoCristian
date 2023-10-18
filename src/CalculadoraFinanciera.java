import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraFinanciera {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    
    while (true) {
    	System.out.print("Ingrese el número de documento (o 'salir'  para finalizar): ");
    	String documento = scanner.nextLine();
    	
    	if (documento.equals("salir")) {
    		break;
    	}
    	System.out.print("Ingrese el nombre: ");
    	String nombre = scanner.nextLine();
    	
    	System.out.print("Ingrese el salario anual: ");
    	double salario = Double.parseDouble(scanner.nextLine());
    	
    	Usuario usuario = new Usuario(documento,nombre,salario);
    	listaUsuarios.add(usuario);
    }
    System.out.println("Lista completa de usuarios y resultados ");
    for (Usuario usuario: listaUsuarios) {
    	usuario.calcularPorcentajes();
    	usuario.mostrarInformacion();
    	System.out.println();
    	
    }
  }
}

class Usuario{
  private String documento;
  private String nombre;
  private double salario;
  private double porcentajeVivienda;
  private double porcentajeTransporte;
  private double porcentajeAhorros;
  
  public Usuario(String documento, String nombre, double salario) {
	  this.documento = documento;
	  this.nombre = nombre;
	  this.salario = salario;
  
}
 public void calcularPorcentajes() {
	 if (salario > 50000) {
		 porcentajeVivienda = 30;
		 porcentajeTransporte = 15;
		 porcentajeAhorros = 20;
		 
	 }else 
		 porcentajeVivienda = 25;
	     porcentajeTransporte = 12;
	     porcentajeAhorros = 15;
	 
	 
 }


public void mostrarInformacion() {
    System.out.println("Documento: " + documento);
    System.out.println("Nombre: " + nombre);
    System.out.println("Salario: $" + salario);
    System.out.println("Porcentaje de ingresos destinados a vivienda: " + porcentajeVivienda + "%");
    System.out.println("Porcentaje de ingresos destinados a transporte: " + porcentajeTransporte + "%");
    System.out.println("Porcentaje de ingresos destinados a ahorros: " + porcentajeAhorros + "%");
}
}
