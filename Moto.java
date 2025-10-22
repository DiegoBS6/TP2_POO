/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author Informatica
 */
public class Moto extends Vehiculo{
    
    private int cilindradaCC;
    private boolean usoDeportivo;
    
    public Moto(String patente, String marca, int anio, double kilometraje, double valorBaseMantenimiento, int cilindradaCC, boolean usoDeportivo){
        super(patente, marca, anio, kilometraje, valorBaseMantenimiento);
        this.cilindradaCC = cilindradaCC;
        this.usoDeportivo = usoDeportivo;
    }

    public int getCilindradaCC() {
        return cilindradaCC;
    }

    public boolean isUsoDeportivo() {
        return usoDeportivo;
    }

    public void setCilindradaCC(int cilindradaCC) {
        this.cilindradaCC = cilindradaCC;
    }

    public void setUsoDeportivo(boolean usoDeportivo) {
        this.usoDeportivo = usoDeportivo;
    }

    @Override
    public String toString() {
        return "Moto{" + "cilindradaCC=" + cilindradaCC + ", usoDeportivo=" + usoDeportivo + '}';
    }
    
    @Override
    public double calcularCostoMantenimiento(){
        return 0.0;
    }
    
    @Override
    public String descripcionBreve(){
        return "a";
    }
    
    public double calcularImpuesto(){
        return 0.0;
    }
    
    public double calcularPrimaSeguro(){
        return 0.0;
    }
    
    public double aplicarDescuento(double porcentaje){
        return 0.0;
    }
    
    public double aplicarDescuento(double porcentaje, boolean clubmoteros){
        return 0.0;
    }
}
