/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iva_server;

import iva.implemen.impl;
import iva_interface.inter;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "WebService")
public class WebService_iva {

    private inter iva;
    
    @WebMethod(operationName = "consumir")
    public double consumir (@WebParam(name = "name") double num) {
        iva = new impl();
        iva.calc_iva(num);
        return iva.calc_iva(num);
    }
}
