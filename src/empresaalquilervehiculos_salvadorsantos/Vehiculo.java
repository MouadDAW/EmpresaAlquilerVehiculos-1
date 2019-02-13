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
public class Vehiculo {
    
    private String matricula;
    private String marca;
    
    private String color;
    private int tarifa;
    private boolean disponible;

    public Vehiculo(String matricula, String marca, String color, int tarifa, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    public static Vehiculo cocheAleatorio() {
        Random aleatorio = new Random();

        String[] marcas = {"Seat Ibiza", "Ford Fiesta", "Fiat Punto", "Opel Corsa", "Seat Altea", "Kia Ceed", "Kia Picanto", "Ford Focus"};
        String[] abecedario = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] colores = {"Rojo", "Azul", "Verde", "Amarillo", "verde"};
        int[] tarifas={25, 35,40, 22};

        int m1 = aleatorio.nextInt(9);
        int m2 = aleatorio.nextInt(9);
        int m3 = aleatorio.nextInt(9);
        int m4 = aleatorio.nextInt(9);

        String Matricula = m1 + "" + m2 + "" + m3 + "" + m4;

//            int letra1= aleatorio.nextInt(abecedario.length);
//            int letra2= aleatorio.nextInt(abecedario.length);
//            int letra3= aleatorio.nextInt(abecedario.length);
        String letras = abecedario[aleatorio.nextInt(abecedario.length)] + "" + abecedario[aleatorio.nextInt(abecedario.length)] + "" + abecedario[aleatorio.nextInt(abecedario.length)];

        String matricula = Matricula + " " + letras;

        int marcAlea = aleatorio.nextInt(marcas.length);
        int colorAlea = aleatorio.nextInt(colores.length);
        int tarifaAlea=aleatorio.nextInt(tarifas.length);

//        System.out.println("Matricula: "+matricula+"\tMarca: "+marca[marcAlea]+"\tColor: "+color[colorAlea]);
        //String coche = "Matricula: " + matricula + "\tMarca: " + marca[marcAlea] + "\tColor: " + color[colorAlea];
        
        //String matricula, String marca, String color, double tarifa, boolean disponible
        
        
        String marca=marcas[marcAlea];
        String color=colores[colorAlea];
        int tarifa=tarifas[tarifaAlea];
        
        Vehiculo cocheAlea = new Vehiculo(matricula, marca, color, tarifa, true);

        return cocheAlea;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return matricula + "\t" + marca +" "+ "\t" + color + "\t" + tarifa + "\t" + disponible ;
    }
    
    
    
}
