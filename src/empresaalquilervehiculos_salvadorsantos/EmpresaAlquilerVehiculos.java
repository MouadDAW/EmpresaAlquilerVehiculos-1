/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresaalquilervehiculos_salvadorsantos;

/**
 *
 * @author salva
 */
public class EmpresaAlquilerVehiculos {
    
    // Atributos de la empresa
    private String cif;
    private String nombre;
    private String paginaWeb;
    
    /* Atributos para controlar el total de clientes que tiene la
    empresa y array de almacenamiento para los objetos Cliente */
    private int totalCliente;
    private Cliente[] clientes;
    
    /* Atributos para controlar el total de vehiculos disponibles en
    alquiler que tiene la empresa y array de almacenamiento para los objetos
    Vehiculo */
    private int totalVehiculos;
    private Vehiculo[] vehiculos;
    
    /* Atributos para controlar el histórico de alquileres: total de
    alquileres realizados y array de almacenamiento para los objetos
    vehiculoAlquilado*/
    private int totalAlquileres;
    private VehiculoAlquilado[] alquileres;
    
    
    
}
