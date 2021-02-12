package mx.com.gamasoft.beans;

import javax.faces.bean.ManagedBean;

/**
 * 
 * @author Cesar
 */
@ManagedBean(name = "clic")
public class MensajeBean {
    
    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public void accionBoton(){
        System.out.println("Botón presionado, has llegado al bean!!!");
    }
}