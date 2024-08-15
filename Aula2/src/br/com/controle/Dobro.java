/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author lorrany.magalhaes
 */
public class Dobro {  /* classe */
    private double valor;              /*atributos*/

    public double getValor() {         /*métodos*/
        return valor;
    }

    public void setValor(double valor) {    /*métodos*/
        this.valor = valor;
    }
    public double calcularDobro(){         /*métodos*/
        return this.valor*2;
    }
    
}
