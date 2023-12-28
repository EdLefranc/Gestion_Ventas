/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.List;

/**
 *
 * @author Ed Le Franc
 */
public class ItemProd {
    private int codItem;
    private String nombre;
    private double costo;
    private double precioVenta;
    private Receta receta;
    private List<Producto> productos;

    public ItemProd() {
    }

    public ItemProd(int codItem, String nombre, double costo, double precioVenta, Receta receta, List<Producto> productos) {
        this.codItem = codItem;
        this.nombre = nombre;
        this.costo = costo;
        this.precioVenta = precioVenta;
        this.receta = receta;
        this.productos = productos;
    }

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "ItemProd{" + "codItem=" + codItem + ", nombre=" + nombre + ", costo=" + costo + ", precioVenta=" + precioVenta + ", receta=" + receta + ", productos=" + productos + '}';
    }
    
    
    
}
