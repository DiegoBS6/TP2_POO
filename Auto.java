package tp2;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Informatica
 */
public class Auto extends Vehiculo{
    
    private int numeroPuertas;
    private boolean hibrido;

    public Auto(String patente, String marca, int anio, double kilometraje, double valorBaseMantenimiento, int numeroPuertas, boolean hibrido) {
        super(patente, marca, anio, kilometraje, valorBaseMantenimiento);
        this.numeroPuertas = numeroPuertas;
        this.hibrido = hibrido;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public boolean isHibrido() {
        return hibrido;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void setHibrido(boolean hibrido) {
        this.hibrido = hibrido;
    }

    @Override
    public String toString() {
        return "Auto{" + "numeroPuertas=" + numeroPuertas + ", hibrido=" + hibrido + '}';
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
    
    public double aplicarDescuento(double porcentaje, boolean clienteFiel){
        return 0.0;
    }
}
