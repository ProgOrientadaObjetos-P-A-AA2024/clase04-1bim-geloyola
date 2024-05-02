/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author gabyl
 */
public class Ejecutable2 {
  public static void main(String[] args) {

        Computadora personal = new Computadora();
        personal.establecerTipoProcesador("Intel 3th");

        System.out.printf("%s - @s",
                personal.obtenerTipoProcesador(),
                personal.obtenerMemoria());

    }   
}
