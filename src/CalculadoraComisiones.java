import java.util.HashMap;
import java.util.Scanner;

public class CalculadoraComisiones {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	HashMap<String, Double> comisiones = new HashMap<>();
    	
    	while (true) {
    		System.out.print("Ingrese el tipo de vendedor (A, B, C D) o 'salir' para finalizar: ");
    		String tipoVendedor = scanner.nextLine();
    		
    		
    		if (tipoVendedor.equals("salir")) {
    			break;
    		}
    		System.out.print("Ingrese el monto de ventas: $");
    		double ventas = Double.parseDouble(scanner.nextLine());
    		
    		double porcentajeComision = 0.0;
    		
    		switch(tipoVendedor){
    		     case "A":
    		     porcentajeComision = 0.08;
    		     break;
    		     case "B":
    		    	 porcentajeComision = 0.06;
    		    	 break;
    		     case "C":
    		    	 porcentajeComision = 0.04;
    		    	 break;
    		     case "D":
    		    	 porcentajeComision = 0.02;
    		    	 break;
    		    	 
    		    	 default:
    		    		 System.out.println("Tipo de vendedor no válido. Intente de nuevo.");
    	                    continue;
    		}
    		  double comision = ventas * porcentajeComision;
              comisiones.put(tipoVendedor, comision);
    		System.out.print("Comision para el vendedor de tipo " + tipoVendedor + ": $" + comision);
    		
    	}
    	System.out.println("Comisiones calculadas:");
        for (String tipo : comisiones.keySet()) {
            System.out.println("Tipo de vendedor: " + tipo + ", Comisión: $" + comisiones.get(tipo));
    }
  }
}    
    