/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.armazenar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author aluno
 */
public class Armazenar implements Armazenavel {
    private String nomeArquivo;

    public Armazenar(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void salvar(String dados) {
        try {
            FileWriter writer = new FileWriter(nomeArquivo);
            writer.write(dados);
            writer.close();
            System.out.println("Dados salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }

    @Override
    public String carregar() {
        try {
            FileReader reader = new FileReader(nomeArquivo);
            BufferedReader bufferedReader = new BufferedReader(reader);
            StringBuilder dados = new StringBuilder();
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                dados.append(linha);
            }
            bufferedReader.close();
            return dados.toString();
        } catch (IOException e) {
            System.out.println("Erro ao carregar os dados: " + e.getMessage());
            return null;
        }
    }
}
