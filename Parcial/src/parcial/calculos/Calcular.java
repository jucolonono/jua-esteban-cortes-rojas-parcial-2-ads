/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.calculos;

/**
 *
 * @author juanes
 */
public interface Calcular {
    boolean error();
    
    void realizado();
    
    void noRealizado();
    
    int getResultado();
    
    void setResultado(int result);
    
    void imprimir();
}
