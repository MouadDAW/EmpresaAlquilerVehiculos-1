package empresaalquilervehiculos_salvadorsantos;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salva
 */
public class MisVehiculos {
    
    public static void main(String[] args) {
        EmpresaAlquilerVehiculos easydrive = new EmpresaAlquilerVehiculos("A-28-187189", "easy drive", "www.easydrive.com");
        Scanner entrada=new Scanner(System.in);
//        
//        //Registro los clientes de la empresa
//        easydrive.registrarCliente(new Cliente("X5618927C", "Juan", "González López"));
//
//        easydrive.registrarCliente(new Cliente("Z7568991Y", "Luis", "Fernández Gómez"));
//
//        // registro de los vehículos de la empresa
//        easydrive.registrarVehiculo(new Vehiculo("4060 TUR", "Skoda", "Fabia", "Blanco", 90.0, false));
//
//        easydrive.registrarVehiculo(new Vehiculo("4070 DEP", "Ford", "Mustang", "Rojo", 150.0, true));
//
//        easydrive.registrarVehiculo(new Vehiculo("4080 TUR", "VW", "GTI", "Azul", 110.0, false));
//
//        easydrive.registrarVehiculo(new Vehiculo("4090 TUR", "SEAT", "Ibiza", "Blanco", 90.0, false));
//
//        easydrive.registrarVehiculo(new Vehiculo("4100 FUR", "Fiat", "Ducato", "Azul", 80.0, true));
//        
//        
        // imprime la relación de clientes de easydrive
        easydrive.imprimirClientes();

        System.out.println("----------------------------------------------------------------------");

        // imprime el catálogo de vehículos de easydrive
        easydrive.imprimirVehiculos();
        
        System.out.println("----------------------------------------------------------------------");
//        System.out.println("Aleatorios "+Cliente.clienteAleatorio());
//        System.out.println("Aleatorios "+Vehiculo.cocheAleatorio());
        
        easydrive.rellenarArrayCoches();

        easydrive.burbujaVehiculos();

        easydrive.imprimirVehiculos();
        
        //---------------------------------------------------

        easydrive.rellenarArrayClientes();

        easydrive.burbujaClientes();

        easydrive.imprimirClientes();

        //------------------------------------------------------------
//        System.out.println("Introduce matricula");
//        String matricula=entrada.nextLine();
//        
//        easydrive.busquedaBinariaMatricula(matricula);
//
//            if (easydrive.busquedaBinariaMatricula(matricula)==-1) {
//                System.out.println("No se ha encontrado");
//        }else{
//                System.out.println("La matricula buscada esta en la posicion : "+easydrive.busquedaBinariaMatricula(matricula));
//            }
            
        //-------------------------------------------------------------------------
        //DNI
            
        System.out.println("Introduce DNI");
        
        String nif=entrada.nextLine();
        
        easydrive.busquedaBinariaNif(nif);

            if (easydrive.busquedaBinariaNif(nif)==-1) {
                System.out.println("No se ha encontrado");
        }else{
                System.out.println("El DNI buscado esta en la posicion : "+easydrive.busquedaBinariaNif(nif));
            }    
    }
}
