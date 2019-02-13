/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresaalquilervehiculos_salvadorsantos;

import java.util.Random;

/**
 *
 * @author salva
 */
public class Cliente {
        
    private String nif;
    private String nombre;
    private String apellido1;
    private String apellido2;

    public Cliente(String nif, String nombre, String apellido1, String apellido2) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2=apellido2;
    }
    public static Cliente clienteAleatorio() {
        Random aleatorio = new Random();

        String[] nombres = {"Pepe", "Manolo ", "Maria ", "Ana", "Carol", "Rocio ", "Jesus ", "Diego"};
        String[] apellidos = {"Gomez", "Perez ", "hernandez ", "Benitez", "Cazorla", "Molina ", "Santos ", "Gonzalez"};
        String[] apellidos2 = {"Gomez", "Perez ", "hernandez ", "Benitez", "Cazorla", "Molina ", "Santos ", "Gonzalez"};

        String[] abecedario = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        int m1 = aleatorio.nextInt(9);
        int m2 = aleatorio.nextInt(9);
        int m3 = aleatorio.nextInt(9);
        int m4 = aleatorio.nextInt(9);
        int m5 = aleatorio.nextInt(9);
        int m6 = aleatorio.nextInt(9);
        int m7 = aleatorio.nextInt(9);
        int m8 = aleatorio.nextInt(9);
        int m9 = aleatorio.nextInt(9);

        String numDni = m1 + "" + m2 + "" + m3 + "" + m4 + "" + m5 + "" + m6 + "" + m7 + "" + m8 + "" + m9;

        int letraAlea = aleatorio.nextInt(abecedario.length);

        String letra1 = abecedario[letraAlea];

        String dni = numDni + " " + letra1;

        int nomAlea = aleatorio.nextInt(nombres.length);
        int apell1Alea = aleatorio.nextInt(apellidos.length);
        int apell2Alea = aleatorio.nextInt(apellidos2.length);
        
        String nombre=nombres[nomAlea];
        String apellido1=apellidos[apell1Alea];
        String apellido2=apellidos[apell2Alea];
        
//        String cliente = "Dni cliente: " + dni + "\tNombre: " + nombre[nomAlea] + "\tApellidos: " + apellidos[apell1Alea] + " " + apellidos2[apell2Alea];

        Cliente clientAlea=new Cliente(dni, nombre, apellido1, apellido2);
        
        return clientAlea;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    @Override
    public String toString() {
        return "DNI "+nif +  "\tNombre "+nombre + "\t Apellidos\t"+apellido1 +  "\t"+apellido2 ;
    }




    
    
    
}

