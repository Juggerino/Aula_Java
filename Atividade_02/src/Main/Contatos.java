/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;



/**
 *
 * @author 1302211121
 */
public class Contatos {
    private String nome;
    private Telefone telefone;
    private Endereco endereco;
    
    
   
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
    public void tela(){
        String texto;
        Main main = new Main();
        Telefone telefone = new Telefone();
        
        //System.out.println(telefones);
        
        texto = "Nome :"+getNome()+" \nEndereço"; 
        
        /*if(nome != null && getTelefone() != null){
            texto = "\nTelefone : "+getTelefone().getDD()+"\nTelefone : "+getTelefone().getTelefone();
        }*/
                
        if(nome != null && getEndereco() != null){
           texto = "\nNome da Rua : "+getEndereco().getNomeRua()+"\nNumero : "+getEndereco().getNumero()+
                   "\nComplemento"+getEndereco().getComplemento()+"\nCEP : "+getEndereco().getCep()+
                   "\nCidade : "+getEndereco().getCidade()+"\nEstado : "+getEndereco().getEstado();
    
        }
        
        /*if(nome != null && telefone.getTelefone() =! null){
            
            for(int i:main.telefones()){
                texto = "Telefone : "+telefones(i); 
            }
        }*/
        
        
        System.out.println(texto);
    }

    
    
}
