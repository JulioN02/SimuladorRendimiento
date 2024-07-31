/*
Nombre del estudiante: Julio Manuel Nieto Martinez
Grupo: 213022_8
Programa: Fundamentos de Programacion
Codigo Fuente: autoria propia
*/
package simuladorrendimiento.main;
import java.util.Scanner;
import static simuladorrendimiento.logica.SimuladorRendimiento.calcularRendimientoMensual;

public class main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada por teclado
        Scanner scanner = new Scanner(System.in);
        
        // Captura de la inversión en dinero
        System.out.println("Ingrese la inversion en dinero (entero): ");
        int inversion = scanner.nextInt();
        
        // Cálculo del rendimiento mensual
        double rendimientoMensual = calcularRendimientoMensual(inversion);
        
        // Mostrar el rendimiento mensual
        System.out.println("El rendimiento mensual es: " + rendimientoMensual);
        
    }
}
