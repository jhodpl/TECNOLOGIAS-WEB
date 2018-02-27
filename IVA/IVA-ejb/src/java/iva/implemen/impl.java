/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iva.implemen;

import iva_interface.inter;
import javax.ejb.Stateless;


@Stateless
public class impl implements inter{

    @Override
    public double calc_iva(double num) {
           
        return num * 0.19;

    }
    
    
    
}
