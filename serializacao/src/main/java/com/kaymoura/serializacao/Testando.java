/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaymoura.serializacao;

import java.io.*;

/**
 * Gravando Arquivo
 * @author devsys-b
 */
public class Testando {
    public static void main(String[] args) throws FileNotFoundException {
        Cliente cliente = new Cliente("293894930", "Daniel");
        FileOutputStream fluxo;
        try{
            fluxo = new FileOutputStream("cliente.ser");
            ObjectOutputStream objarq = new ObjectOutputStream(fluxo);
            objarq.writeObject(cliente);
            objarq.close();
            System.out.println("Arquivo gravado");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
