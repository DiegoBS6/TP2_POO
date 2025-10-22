/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

import java.util.ArrayList;
/**
 *
 * @author Informatica
 */
public class VehiculoDAO {
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
     
    public boolean agregar(Vehiculo vehiculo){
        if(buscar(vehiculo.getPatente()) == null ){
           vehiculos.add(vehiculo);
           return true;//agregado
        }else{
           return false;     
        }       
        
    }
   
    public Vehiculo buscar(String patente){
                Vehiculo vehiculo = null;
        for (Vehiculo obj : vehiculos) {
            if (obj.getPatente().equals(patente)){
                //Encontrado
                return obj;
            }
        }

        return vehiculo;
    }
     
    public boolean modificar(Vehiculo vehiculo ){

        for (Vehiculo obj : vehiculos) {
            if (obj.getPatente().equals(vehiculo.getPatente())){
                //Encontrado
                obj.setPatente(vehiculo.getPatente());
                obj.setMarca(vehiculo.getMarca());
                obj.setAnio(vehiculo.getAnio());
                obj.setKilometraje(vehiculo.getKilometraje());
                obj.setValorBaseMantenimiento(vehiculo.getValorBaseMantenimiento());
                return true; //actualizado
            }
        }
        return false;

    }
    
    public boolean eliminar(String patente){

        for (Vehiculo obj : vehiculos) {
            if (obj.getPatente().equals(patente)){
                //Encontrado
                vehiculos.remove(obj);
                return true;
            }
        }
        return false;
    }
    
    public  ArrayList<Vehiculo> obtenerDatos(){
        return vehiculos;
    }
    
    public ArrayList<Vehiculo> buscarPormarca(String marca){
    ArrayList<Vehiculo> resultado = new ArrayList<>();

    for(Vehiculo vehiculo : vehiculos){
        if(vehiculo.getMarca().equals(marca)){
            resultado.add(vehiculo);
        }
    }

    return resultado;
}

    public ArrayList<Vehiculo> listarPorAnioDesc() {
    ArrayList<Vehiculo> copiaOrdenada = new ArrayList<>(vehiculos); // Copiamos para no modificar la lista original

    copiaOrdenada.sort((v1, v2) -> Integer.compare(v2.getAnio(), v1.getAnio())); // Orden descendente por año

    return copiaOrdenada;
}

    
}
