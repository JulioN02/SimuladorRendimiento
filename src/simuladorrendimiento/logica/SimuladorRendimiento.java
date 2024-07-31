package simuladorrendimiento.logica;
public class SimuladorRendimiento {
      // Función para calcular el rendimiento mensual
    public static double calcularRendimientoMensual(int capital) {
        double tasaAnual = 0.30; // 30% de rendimiento anual
        double rendimientoAnual = capital * tasaAnual;
        double rendimientoMensual = rendimientoAnual / 12;
        return rendimientoMensual;
    }
}
