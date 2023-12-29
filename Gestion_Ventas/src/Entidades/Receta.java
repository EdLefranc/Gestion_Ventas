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
public class Receta {
    private int idReceta;
    private String nombre;
    private List<Producto> productos;
    private String lote;
    private double costo;
    private double cantidad;

    public Receta() {
    }

    public Receta(int idReceta, String nombre, List<Producto> productos, String lote, double costo, double cantidad) {
        this.idReceta = idReceta;
        this.nombre = nombre;
        this.productos = productos;
        this.lote = lote;
        this.costo = costo;
        this.cantidad = cantidad;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Receta{" + "idReceta=" + idReceta + ", nombre=" + nombre + ", productos=" + productos + ", lote=" + lote + ", costo=" + costo + ", cantidad=" + cantidad + '}';
    }
    
    
}
