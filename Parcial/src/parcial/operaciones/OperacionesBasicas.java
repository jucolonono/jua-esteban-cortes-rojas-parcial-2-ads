/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.operaciones;

import parcial.calculos.Calcular;
/**
 *
 * @author juane
 */
public class OperacionesBasicas implements Operaciones{
    
    protected Calcular calcul;
    
    
    public int hola=0;
            
    public OperacionesBasicas(){
    }
    
    public OperacionesBasicas(Calcular calcul){
        this.calcul = calcul;
    }
    
    public void llenar(int imput){
        this.hola = imput;
    }
    public int gethola(){
        return hola;
    }
    
    @Override
    public void sumar(){
        calcul.setResultado(calcul.getResultado()+hola);  
    }
    
    @Override
    public void restar(){
        calcul.setResultado(calcul.getResultado()-hola);
    }
    
    @Override
    public void multiplicar(){
        calcul.setResultado(calcul.getResultado()*hola);
    }
    
    @Override
    public void dividir(){
        calcul.setResultado(calcul.getResultado()/hola);
    }
}
    

