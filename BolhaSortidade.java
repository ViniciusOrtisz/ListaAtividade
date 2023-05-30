/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bolhasortidade;

/**
 *
 * @author aluno
 */
public class BolhaSortidade implements Ordenavel {

    public void ordenar(int[] array) {
        int tamanhaVetor = array.length;
        for (int i = 0; i < tamanhaVetor - 1; i++) {
            for (int j = 0; j < tamanhaVetor - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Troca os elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
    }
}
