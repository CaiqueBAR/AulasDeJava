/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Sistemalab
 */

import java.util.AbstractList;

public abstract class Fornecedor {
    private int codigo;
    private String nome;
    private String endereco;
    private String cidade;
    private String bairro;
    private String uf;
    private String telefone;
    private ArrayList<Fornecedor> fornecedores;
    

    public Fornecedor(int codigo, String nome, String endereco, String cidade, String bairro, String uf, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.bairro = bairro;
        this.uf = uf;
        this.telefone = telefone;
        this.fornecedores = new Arraylist<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void cadastrar(Fornecedor fornecedor){
        fornecedores.add(fornecedor);
    }
    
    
}
