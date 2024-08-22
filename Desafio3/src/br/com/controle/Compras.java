/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author lorrany.magalhaes
 */
public class Compras {
    private double valor;
    private double maior;
    private double soma;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
        if (this.valor > this.maior){
            this.maior = this.valor;
        }
        this.soma+=this.valor;
    }

    public double getMaior() {
        return maior;
    }

    public void setMaior(double maior) {
        this.maior = maior;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    
}