package Entidades;

import java.util.List;

/**
 *
 * @author Ed Le Franc
 */
public class RRHH {
    private int codPersona;
    private String nombre;
    private String apellido;
    private String numeroTel;
    private String razonSocial;
    

    public RRHH() {
    }

    public RRHH(int codPersona, String nombre, String apellido, String numeroTel) {
        this.codPersona = codPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTel = numeroTel;
    }

    public RRHH(int codPersona, String nombre, String apellido, String numeroTel, String razonSocial, List<Producto> productos) {
        this.codPersona = codPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTel = numeroTel;
        this.razonSocial = razonSocial;
        
    }

    public int getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(int codPersona) {
        this.codPersona = codPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    

    @Override
    public String toString() {
        return "RRHH{" + "codPersona=" + codPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", numeroTel=" + numeroTel + ", razonSocial=" + razonSocial + '}';
    }
    
    
    
}
