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
public class OperacionesAvanza extends OperacionesBasicas{
    
    public OperacionesAvanza(Calcular calcul){
        super.calcul = calcul;
    }
    
    public void potencia(){
        calcul.setResultado(calcul.getResultado()^111);
    }
}
