/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iva.cl;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Usuario
 */
@ManagedBean(name = "consu")
@ViewScoped
public class iva {

    private static double consumir(double name) {
        iva_server.WebService service = new iva_server.WebService();
        iva_server.WebServiceIva port = service.getWebServiceIvaPort();
        return port.consumir(name);
    }
    private int num1;
    private int num2;
    private String res;
    private String sum;

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }
    
    public void  suma(){
       sum = String.valueOf(num1 + num2);
    }
    public void suma_iva (){
       suma();
       res = String.valueOf(consumir(num1 + num2));
       
    }
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    
}
