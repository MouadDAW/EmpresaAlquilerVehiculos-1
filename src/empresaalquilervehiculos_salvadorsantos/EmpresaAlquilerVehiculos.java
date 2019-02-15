/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresaalquilervehiculos_salvadorsantos;

import java.time.LocalDate;
import java.util.Random;

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
    private int totalClientes;
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

    public EmpresaAlquilerVehiculos(String cif, String nombre, String paginaWeb) {
        this.cif = cif;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
        this.totalClientes = 0;
        
        //no hay clientes creados
        this.clientes = new Cliente[50]; //apunta a null
        this.totalVehiculos = 0;
        this.vehiculos = new Vehiculo[50]; //apunta a null
        this.totalAlquileres = 0;
        this.alquileres = new VehiculoAlquilado[100]; //apunta a null
        
    }
    
    //burbuja ordenar clientes por nif
    public void burbujaClientes() {
        Cliente auxi;

        for (int i = 0; i < clientes.length - 1; i++) {
            for (int j = i + 1; j < clientes.length; j++) {

                int aux = clientes[i].getNif().compareTo(clientes[j].getNif());
                if (aux > 0) {
                    auxi = clientes[i];
                    clientes[i] = clientes[j];
                    clientes[j] = auxi;
                }
            }
        }
    }
 /*Comparacion de cadenas (diccionario). Metodo compareTo()
        Devuelve 0 si las cadenas son iguales, 
        un positivo si s1 esta antes del diccionario (menor) 
        o un positivo si s1 esta despues de s2 (mayor)*/
        //burbuja ordenar vehiculos por matricula

    public void burbujaVehiculos() {
        Vehiculo auxi;
                
        for (int i = 0; i < vehiculos.length-1; i++){
            for (int j = i+1; j < vehiculos.length; j++) {
                
             int aux=vehiculos[i].getMatricula().compareTo(vehiculos[j].getMatricula());
                        if (aux>0) {
                    auxi= vehiculos[i];
                    vehiculos[i]=vehiculos[j];
                    vehiculos[j]=auxi;
                }
            }
        }
    }
     /*Comparacion de cadenas (diccionario). Metodo compareTo()
        Devuelve 0 si las cadenas son iguales, 
        un positivo si s1 esta antes del diccionario (menor) 
        o un positivo si s1 esta despues de s2 (mayor)*/
    public int busquedaBinariaMatricula(String matricula){
                
        int mitad=0; int izquierda = 0; int derecha = vehiculos.length - 1;
        int valor=0;
        int buscado = 10; 
        
        while ((izquierda<=derecha)){
            
            mitad = (izquierda + derecha) / 2;
            
            valor=this.vehiculos[mitad].getMatricula().compareTo(matricula);
            
            if ( valor==0){
                
                return mitad;
                
            } 

            else if (valor<0){ 
                    izquierda = mitad + 1; //buscar en el trozo izquierdo

            }
            else{
                    derecha = mitad -1; // buscar en el trozo derecho
            }
        }
        return -1;
    }
    
     public int busquedaBinariaNif(String nif){
                
        int mitad=0; int izquierda = 0; int derecha = clientes.length - 1;
        int valor=0;
        int buscado = 10; 
        
        while ((izquierda<=derecha)){
            
            mitad = (izquierda + derecha) / 2;
            
            valor=this.clientes[mitad].getNif().compareTo(nif);
            
            if ( valor==0){
                
                return mitad;
                
            } 

            else if (valor<0){ 
                    izquierda = mitad + 1; //buscar en el trozo izquierdo

            }
            else{
                    derecha = mitad -1; // buscar en el trozo derecho
            }
        }
        return -1;
    }

    public void rellenarArrayCoches() {

        for (int i = 0; i < vehiculos.length; i++) {

            vehiculos[i] = Vehiculo.cocheAleatorio();

        }
        totalVehiculos=50;
        
    }
    
    public void rellenarArrayClientes() {
        
        for (int i = 0; i < clientes.length; i++) {
            
            clientes[i]=Cliente.clienteAleatorio();
        }
        
        totalClientes=50;
        
    }
    



    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public int getTotalClientes() {
        return totalClientes;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setTotalVehiculos(int totalVehiculos) {
        this.totalVehiculos = totalVehiculos;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getTotalAlquileres() {
        return totalAlquileres;
    }

    public void setTotalAlquileres(int totalAlquileres) {
        this.totalAlquileres = totalAlquileres;
    }

    public VehiculoAlquilado[] getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(VehiculoAlquilado[] alquileres) {
        this.alquileres = alquileres;
    }
    
//Añade un nuevo cliente a la lista de
//clientes de la empresa. El método registrarCliente(Cliente cliente)
//almacena un objeto de la clase Cliente en la última posición útil del array
//clientes, dada por la variable totalClientes y a continuación incrementa
//la variable totalClientes.
    public void registrarCliente(Cliente nuevo) {
        this.clientes[this.totalClientes] = nuevo;
        this.totalClientes++;
    }
    
//Añade un vehículo al catálogo
//de vehículos de la empresa. El método registrarVehiculo(Vehiculo vehiculo)
//almacena un objeto de la clase Vehiculo en la última posición del array
//vehiculos, dada por la variable totalVehiculos y a continuación incrementa
//la variable totalVehiculos.
    public void registrarVehiculo(Vehiculo nuevo) {
        this.vehiculos[this.totalVehiculos] = nuevo;
        this.totalVehiculos++;
        
    }
 
//Muestra la relación de clientes de la empresa. Este
//método recorre el array clientes y va mostrando los datos de cada
//cliente.
    public void imprimirClientes() {
        System.out.println("NIF cliente\tNombre");
        for (int i = 0; i < this.totalClientes; i++) {
            System.out.println(clientes[i].toString());
        }
    }

//Muestra el catálogo de vehículos de la empresa,
//recorriendo el array vehiculos y llamando al método getAtributos() de cada
//uno .
    
    public void imprimirVehiculos() {
        System.out.println("Matricula\tModelo\t\tColor\tImporte\tDisponible\n");
        for (int i = 0; i < this.totalVehiculos; i++) {
            System.out.println(vehiculos[i].toString());
        }
    }
    
/*alquilarVehiculo(String matricula,String nif,int dias). Modifica
la disponibilidad del vehículo para indicar que está alquilado y añade un objeto
de tipo VehiculoAlquilado al array de vehículos alquilados. Para
registrar el alquiler de un vehículo por un cliente se usa estel método. El
método getCliente(String nif) busca la referencia del cliente con el NIF
dado en el array clientes. De forma similar, el método getVehiculo(String
matricula) busca la referencia del vehículo con la matrícula dada en el
array vehiculos. Una vez encontrado el vehículo con la matrícula indicada,
se verifica si está disponible para alquilar y se modifica su
disponibilidad. A continuación, almacena un objeto de tipo
VehiculoAlquilado en el array alquileres.Este objeto relaciona un
cliente, un vehículo, la fecha actual y los días de alquiler.*/
    private Cliente getCliente(String nif) {
        for (int i = 0; i < this.getTotalClientes(); i++) {
            if (this.clientes[i].getNif().equals(nif)){
                return this.clientes[i];
            }

        }
        return null;
    }
    
    private Vehiculo getVehiculo(String matricula) {
        for (int i = 0; i < this.getTotalVehiculos(); i++) {
            if (this.vehiculos[i].getMatricula().equals(matricula)) {
                return this.vehiculos[i];
            }
        }
        return null;
    }
    
    public void alquilarVehiculo(String matricula, String nif, int dias) {
        Cliente cliente = getCliente(nif);
        Vehiculo vehiculo = getVehiculo(matricula);
        // busca el cliente con el NIF dado en el array
        // clientes y el vehículo con la matrícula dada en el
        // array vehiculos, si el vehículo está disponible se
        // alquila con la fecha actual, que se obtiene
        // ejecutando los métodos diaHoy(), mesHoy() y
        // añoHoy(), cuya declaración no se incluye
        
        if (vehiculo.getDisponible()) {
            vehiculo.setDisponible(false);
            this.alquileres[this.totalAlquileres] = new VehiculoAlquilado(cliente, vehiculo, LocalDate.now(), totalAlquileres);

            this.totalAlquileres++;
        }
    }

    public void recibirVehiculo(String matricula) {
        // busca el vehículo con la matrícula dada en el
        // array vehiculos y modifica su disponibilidad
        // para que se pueda alquilar de nuevo
        Vehiculo vehiculo = getVehiculo(matricula);
        if (vehiculo != null) {
            vehiculo.setDisponible(true);
        }
    }
}
