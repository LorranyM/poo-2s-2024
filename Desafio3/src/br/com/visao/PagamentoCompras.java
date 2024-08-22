/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.Compras;
import javax.swing.JOptionPane;

/**
 *
 * @author lorrany.magalhaes
 */
public class PagamentoCompras {
    public static void main(String[] args){
        Compras c = new Compras();
        
        int cont;
        for (cont=0; cont<5; cont++){
            
            c.setValor(Double.valueOf(JOptionPane.showInputDialog("digite o valor")));
        }
        JOptionPane.showMessageDialog(null, "valor "+ c.getMaior());
        JOptionPane.showMessageDialog(null, "valor "+ c.getSoma());
}
}
/* FAÇA UM PROGRAMA QUE RECEBA COMO DADOS DE ENTRADA DUAS NOTAS DE 10 ALUNOS
E MOSTRE COMO RESULTADO:
A)QUAL FOI A MAIOR NOTA DA TURMA;
B) QUAL FOI A MENOR NOTA DA TURMA;
C) QUAL FOI A MÉDIA DA TURMA;
*/