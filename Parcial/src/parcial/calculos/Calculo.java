/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.calculos;

/**
 *
 * @author juane
 */
public class Calculo implements Calcular{
    
    private boolean sintaxError = false;
    
    private int result = 0;
    
    @Override
    public boolean error(){
        return sintaxError;
    }
    
    @Override
    public void realizado(){
        sintaxError = false;
    }
    
    @Override
    public void noRealizado(){
        sintaxError = true;
    }
    
    @Override
    public int getResultado(){
        return result;
    }
    
    @Override
    public void setResultado(int result){
        this.result = result;
    }
    
    @Override
    public void imprimir(){
        System.out.println("¿hay error?: " + (sintaxError ? "si" : "no" ));
        System.out.println("El resultado es: " + result);
    }
}
