/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iva_interface;

import javax.ejb.Local;

@Local
public interface inter {
    
    public double calc_iva (double num);
    
}
