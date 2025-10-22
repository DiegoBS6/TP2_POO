/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author Informatica
 */
public abstract class Vehiculo implements InterfaceTributable{
    
    private String patente;
    private String marca;
    private int anio;
    private double kilometraje;
    private double valorBaseMantenimiento;

    public Vehiculo(String patente, String marca, int anio, double kilometraje, double valorBaseMantenimiento) {
        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.valorBaseMantenimiento = valorBaseMantenimiento;
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public double getValorBaseMantenimiento() {
        return valorBaseMantenimiento;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setValorBaseMantenimiento(double valorBaseMantenimiento) {
        this.valorBaseMantenimiento = valorBaseMantenimiento;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + ", anio=" + anio + ", kilometraje=" + kilometraje + ", valorBaseMantenimiento=" + valorBaseMantenimiento + '}';
    }
    
    public abstract double calcularCostoMantenimiento();
    
    public abstract String descripcionBreve();            
    
}
