/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ada.semana01;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class ADASEMANA01 {

    public static boolean buscarElemento(int[] lista, int elemento) {
        for (int i : lista) {
            if (i == elemento) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int[] arreglo = {10, 25, 50, 75, 100};

        System.out.println("Ingresa el numero a buscar:");
        int elemento = dato.nextInt();
        boolean encontrado = buscarElemento(arreglo, elemento);
        System.out.println(Arrays.toString(arreglo));
        System.out.println("¿Se encuentra el numero " + elemento + " en el arreglo? " + encontrado);
        if (encontrado) {
            System.out.println("Si se encuentra");
        } else {
            System.out.println("No se encuentra");
        }
    }
}

