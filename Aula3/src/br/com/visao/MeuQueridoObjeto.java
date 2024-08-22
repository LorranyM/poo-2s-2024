/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.Semestre;
import javax.swing.JOptionPane;

/**
 *
 * @author lorrany.magalhaes
 */
public class MeuQueridoObjeto {
    public static void main(String [] args){
        Semestre s = new Semestre();
        
        int cont=0;
        for(cont=0; cont<3; cont++){
            
        s.setValor(Double.valueOf(JOptionPane.showInputDialog(" digite o valor")));
        JOptionPane.showMessageDialog(null, "valor "+s.getValor());
        JOptionPane.showMessageDialog(null, "dobro "+s.dobro());
    }
    }
}
/* faça um programa que receba como dados de entrada o valor de 5 compras 
e mostre como resultado:
a) a soma de todas as compras;
b) a maior compra efetuada.

*/