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
        int[] arreglo = {10, 25, 50, 75, 100};
        int elemento = 50;
        boolean encontrado = buscarElemento(arreglo, elemento);
        System.out.println(Arrays.toString(arreglo));
        System.out.println("¿Se encuentra el numero " + elemento + " en el arreglo? " + encontrado);
    }
}
