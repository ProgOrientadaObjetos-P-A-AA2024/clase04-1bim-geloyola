/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author gabyl
 */
public class Computadora {

    private String tipoProcesador;
    private double memoria;
    
    public Computadora(double m){
        memoria = m;
                
    }
    
    public Computadora(String tipo ){
        tipoProcesador = tipo;
                
    }

    public Computadora(String tipo, double mem ){
        memoria = mem;
        tipoProcesador = tipo;
                
    }
    
    
    // métodos establecer para cada atributo
    public void establecerTipoProcesador(String n){
        tipoProcesador = n;
    }
    
    public void establecerMemoria(double n){
        memoria = n;
    }
    
    public String obtenerTipoProcesador(){
        return tipoProcesador;
    }
    
    public double obtenerMemoria(){
        return memoria;
    }
}
