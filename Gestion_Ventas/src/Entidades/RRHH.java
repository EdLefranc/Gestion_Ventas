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
    private List<Producto> productos;
    private List<Pedido_Venta> accionComercial;

    public RRHH() {
    }

    public RRHH(int codPersona, String nombre, String apellido, String numeroTel) {
        this.codPersona = codPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTel = numeroTel;
    }

    public RRHH(int codPersona, String nombre, String apellido, String numeroTel, String razonSocial, List<Producto> productos, List<Pedido_Venta> accionComercial) {
        this.codPersona = codPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTel = numeroTel;
        this.razonSocial = razonSocial;
        this.productos = productos;
        this.accionComercial = accionComercial;
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

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Pedido_Venta> getAccionComercial() {
        return accionComercial;
    }

    public void setAccionComercial(List<Pedido_Venta> accionComercial) {
        this.accionComercial = accionComercial;
    }

    @Override
    public String toString() {
        return "RRHH{" + "codPersona=" + codPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", numeroTel=" + numeroTel + ", razonSocial=" + razonSocial + ", productos=" + productos + ", accionComercial=" + accionComercial + '}';
    }
    
    
    
}
