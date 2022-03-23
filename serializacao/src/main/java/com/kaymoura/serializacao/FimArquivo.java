/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaymoura.serializacao;

import java.io.*;

/**
 * Fim do Arquivo
 * @author devsys-b
 */
public class FimArquivo {
    public static void main(String[] args) {
        Cliente cliente;
        FileInputStream fluxo;
        ObjectInputStream objarq = null;
        try{
            fluxo = new FileInputStream("cliente.ser");
            objarq = new ObjectInputStream(fluxo);
            while(true){
                cliente = (Cliente) objarq.readObject();
                System.out.println(cliente);
            }
        } catch (EOFException eofExc){
            System.out.println("Chegou no fim do arquivo");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
 