/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author alunodev10
 */
public class Conta {
    private String conta;
    private String saldo;
    private String nome;

    public Conta(String conta, String saldo, String nome) {
        this.conta = conta;
        this.saldo = saldo;
        this.nome = nome;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
   
    @Override
    public String toString() {
        return "Conta: " + conta + "\nSaldo: " +  saldo + "\nNome: " + nome; 
    }
    

    
   
    
    
}
