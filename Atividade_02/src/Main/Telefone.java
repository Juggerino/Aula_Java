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
public class Telefone {
    
    public int i;
    private String DD;
    private String telefone;
    private ArrayList<ArrayList> numeros = new ArrayList<>();
    private ArrayList<String> numero = new ArrayList<>(2);
    

    public String getDD() {
        return DD;
    }

    public void setDD(String DD) {
        this.DD = DD;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<ArrayList> getNumeros(int i) {
        return numeros.get(i);
    }

    public void setNumeros(ArrayList numero) {
        numeros.add(numero);
    }

    public String getNumero2(int i){
        return numero.get(i);
    }
    
    public ArrayList<String> getNumero() {
        return numero;
   
    }

    public void setNumero(String DD,String telefone) {
        numero.add(DD);
        numero.add(telefone);
        
    }
    
    public void textoNumeros(){
    
        for(int x = 0;x < 2;x++){
            
            String texto;
            
            texto = getNumero2(x);
            System.out.println("\n Numero1:"+texto);   
            
            
        }
    }

    
    
}
