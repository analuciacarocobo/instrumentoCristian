import java.util.Scanner;

public class CalculadoraVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de meses a calcular: ");
        int numMeses = scanner.nextInt();

        double[] ventasMensuales = new double[numMeses];

        for (int i = 0; i < numMeses; i++) {
            System.out.print("Ingrese las ventas del mes " + (i + 1) + ": $");
            ventasMensuales[i] = scanner.nextDouble();
        }

        double totalVentas = 0;
        for (double venta : ventasMensuales) {
            totalVentas += venta;
        }
        double promedioMensual = totalVentas / numMeses;

        int mesMasAlto = 0;
        int mesMasBajo = 0;

        for (int i = 1; i < numMeses; i++) {
            if (ventasMensuales[i] > ventasMensuales[mesMasAlto]) {
                mesMasAlto = i;
            }
            if (ventasMensuales[i] < ventasMensuales[mesMasBajo]) {
                mesMasBajo = i;
            }
        }

        System.out.println("Promedio Mensual de Ventas: $" + promedioMensual);
        System.out.println("Mes con las Ventas Más Altas: Mes " + (mesMasAlto + 1) + " con $" + ventasMensuales[mesMasAlto]);
        System.out.println("Mes con las Ventas Más Bajas: Mes " + (mesMasBajo + 1) + " con $" + ventasMensuales[mesMasBajo]);
    }
}

