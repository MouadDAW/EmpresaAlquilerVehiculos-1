/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresaalquilervehiculos_salvadorsantos;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author salva
 */
public class VehiculoAlquilado {
        
    private Cliente cliente;
    private Vehiculo vehiculo;
    LocalDate fechaAlquilado;
//    private int diaAlquiler;
//    private int mesAlquiler;
//    private int añoAlquiler;
    private int totalDiasAlquiler;

    public VehiculoAlquilado(Cliente cliente, Vehiculo vehiculo, LocalDate fechaAlquilado, int totalDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaAlquilado = fechaAlquilado;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }




    
    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }



    public int getTotalDiasAlquiler() {
        return totalDiasAlquiler;
    }

    public void setTotalDiasAlquiler(int totalDiasAlquiler) {
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

    @Override
    public String toString() {
        return "VehiculoAlquilado{" + "cliente=" + cliente + ", vehiculo=" + vehiculo + ", totalDiasAlquiler=" + totalDiasAlquiler + '}';
    }



   

    
    
    
}
