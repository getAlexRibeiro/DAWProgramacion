package Matriz;

import java.util.Scanner;

public class Matriz {
    Scanner sc = new Scanner(System.in);

    // Atributos
    int[][] matriz;
    int columnas, filas;


    // Constructor con parametros
    public Matriz(int filas, int columnas) {
        this.matriz = new int[filas][columnas];
        this.filas = filas;
        this.columnas = columnas;
    }


    // Metodos:

    // Metodo cargar que compara ambas matrices.
    public void cargar(int[][] otraMatriz) {
        if (this.matriz[0].length == otraMatriz[0].length && this.matriz.length == otraMatriz.length) {
            for (int i = 0; i <= this.matriz.length - 1; i++) {
                for (int j = 0; j <= this.matriz[i].length - 1; j++) {
                    this.matriz[i][j] = otraMatriz[i][j];
                }
            }
            System.out.println("Cargado correctamente");

        } else {
            System.out.println("Error, las matrices son diferentes");
        }
    }


    // Metodo imprimir ultima fila.

    public void impUltFila() {
        String ultimaFila = "";
        for (int i = 0; i < this.matriz[this.matriz.length - 1].length; i++) {
            ultimaFila += this.matriz[this.matriz.length - 1][i];
        }
        System.out.println("La ultima fila es: " + ultimaFila);
    }

// Metodo imprimir primera fila.

    public void impFirstFila() {
        String firstFila = "";
        for (int i = 0; i <= (this.matriz.length - 1); i++) {
            firstFila += this.matriz[i][0];
        }
        System.out.println("La primera cfila es: " + firstFila);
    }

// Metodo imprimir diagonal.

    public void impDiagonal() {
        String diagonal = "";
        int cont = 0;
        for (int i = 0; i <= (this.matriz.length - 1); i++) {
            diagonal += this.matriz[i][cont];
            cont++;
        }
        System.out.println("La Diagonal es: " + diagonal);
    }

// Metodo suma de los elementos.

    public int sumaElementos() {
        int total = 0;
        for (int i = 0; i <= (this.matriz.length - 1); i++) {
            for (int j = 0; j <= (this.matriz[i].length - 1); j++) {
                total += this.matriz[i][j];
            }
        }
        return total;
    }


// Metodo promedio de los elementos
    public int promedio() {
        return (sumaElementos()) / (this.columnas * this.filas);
    }


// Metodo toString.

    public void doString() {
        for (int i = 0; i <= (this.matriz.length - 1); i++) {
            for (int j = 0; j <= (this.matriz[i].length - 1); j++) {
                System.out.println(this.matriz[i][j]);
            }
            System.out.println("\n");
        }
    }

}
