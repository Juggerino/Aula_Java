/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;


/**
 *
 * @author 1302211121
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        
        
        Contatos contato = new Contatos();
        contato.setNome("Mateus");
        
        Telefone f1 = new Telefone();
        f1.setDD("55");
        f1.setTelefone("45445-4555");
        
        f1.setNumero(f1.getDD(),f1.getTelefone());
        //f1.setNumero(add(getTelefone()));
        f1.setNumeros(f1.getNumero());
        
        
        
        
        Endereco endereco = new Endereco();
        endereco.setNomeRua("Rua a");
        endereco.setNumero("1489");
        endereco.setCep("49752-200");
        endereco.setCidade("Porto Alegre");
        endereco.setComplemento("N/A");
        endereco.setEstado("RS");
        
        
        contato.setEndereco(endereco);
        
            
        contato.tela();
        
        f1.textoNumeros();
        
        System.out.println(f1.getNumero()+"\n"+""+f1.getNumeros(1));
    }
    
}
