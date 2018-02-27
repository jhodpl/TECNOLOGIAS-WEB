

package iva;

import iva_server.WebService;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.xml.ws.WebServiceRef;

@ManagedBean(name="ivaBean")
@ViewScoped
public class cliente {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/IVA-war/WebService.wsdl")
    private WebService service;

    private double consumir(double name) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        iva_server.WebServiceIva port = service.getWebServiceIvaPort();
        return port.consumir(name);
    }
    
    private int num1;
    private int num2;
    private String res;
    private String suma;
    
    public void  suma(){
       suma = String.valueOf(num1 + num2);
    }
    public void suma_iva (){
       res = String.valueOf(consumir(num1 + num2));
       suma();
    }

    public WebService getService() {
        return service;
    }

    public void setService(WebService service) {
        this.service = service;
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

    public String getSuma() {
        return suma;
    }

    public void setSuma(String suma) {
        this.suma = suma;
    }
    
}
