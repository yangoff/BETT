/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kai
 */
public class Usr {
    
    String nome;
    String email;
    String senha;
    Boolean perm;

    public Usr() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void cadastrar(Usr usr){
        Boolean temp;
        temp = email.contains("@");
        if(temp = true){
        //adiciona(usr);
            System.out.println("Usuario "+usr.nome+" cadastrado com sucesso.");
    }else{
            System.out.println("Email errado");
        }
        
    }
    
    public boolean logar(String email,String senha){
        Boolean p= false;
        Boolean temp;
        temp = email.contains("@");
        if(temp = true){
            Usr u = new Usr();
        //valida(usr);
       if(u.perm == true){ 
            System.out.println("Usuario "+u.nome+" logado com sucesso.");
       }
       }else{
            System.out.println("Email errado");
        }
        return p;
    }
    
}
