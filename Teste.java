/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teste;

/**
 *
 * @author aluno
 */
public class Teste {

    public static void main(String[] args) {
        Desenhavel circulo = new Circulo();
        Desenhavel retangulo = new Retangulo();
        Desenhavel triangulo = new Triangulo();

        circulo.desenhar();
        retangulo.desenhar();
        triangulo.desenhar();
    }

}
