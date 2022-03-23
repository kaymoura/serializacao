/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaymoura.serializacao;

import java.io.*;

/**
 * Ler Objeto
 * @author devsys-b
 */
public class Teste { 
    public static void main(String[] args) {
        Cliente cliente;
        FileInputStream fluxo;
        try{
            fluxo = new FileInputStream("cliente.ser");
            ObjectInputStream objar = new ObjectInputStream(fluxo);
            cliente = (Cliente) objar.readObject();
            objar.close();
            System.out.println("Objeto lido \n "+cliente);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
           
    }
}
