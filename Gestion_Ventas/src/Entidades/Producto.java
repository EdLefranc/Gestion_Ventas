/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Ed Le Franc
 */
public class Producto {
    private int codProducto;
    private String nombre;
    private String familia;
    private double precio;
    private double cantidadStock;
    private Date vencimiento;

    public Producto() {
    }

    public Producto(int codProducto, String nombre, String familia, double precio, double cantidadStock, Date vencimiento) {
        this.codProducto = codProducto;
        this.nombre = nombre;
        this.familia = familia;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
        this.vencimiento = vencimiento;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(double cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    @Override
    public String toString() {
        return "Producto{" + "codProducto=" + codProducto + ", nombre=" + nombre + ", familia=" + familia + ", precio=" + precio + ", cantidadStock=" + cantidadStock + ", vencimiento=" + vencimiento + '}';
    }
    
    
}
