package paquete1;

/**
 *
 * @author gabyl
 */
public class Ejecutable3 {
    public static void main(String[] args) {

    // Se crea un objeto
    Computadora computadoraPersonal = new Computadora();

    // Se asigna valores particulares al objeto
    // a través de los métodos establecer
    String procesador = "Intel";
    double memoria = 8.2; // se asume que está expresada en GB

    computadoraPersonal.establecerTipoProcesador (procesador);

    computadoraPersonal.establecerMemoria (memoria);

    // Se presenta valores en pantalla, rescatando los valores
    // que se necesita a través de los métodos obtener del
    // objeto 
    System.out.printf("Computadora\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n", 
                computadoraPersonal.obtenerTipoProcesador(),
                computadoraPersonal.obtenerMemoria());
        
    }
}
