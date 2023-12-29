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
public class Informe {
    private int codInforme;
    private List<Ventas> ventas;
    private List<Compras> compras;
    private List<Caja> cajas;
    private List<Producto> productos;
    private List<ItemProd> items;

    public Informe() {
    }

    public int getCodInforme() {
        return codInforme;
    }

    public void setCodInforme(int codInforme) {
        this.codInforme = codInforme;
    }

    public List<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(List<Ventas> ventas) {
        this.ventas = ventas;
    }

    public List<Compras> getCompras() {
        return compras;
    }

    public void setCompras(List<Compras> compras) {
        this.compras = compras;
    }

    public List<Caja> getCajas() {
        return cajas;
    }

    public void setCajas(List<Caja> cajas) {
        this.cajas = cajas;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<ItemProd> getItems() {
        return items;
    }

    public void setItems(List<ItemProd> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Informe{" + "codInforme=" + codInforme + ", ventas=" + ventas + ", compras=" + compras + ", cajas=" + cajas + ", productos=" + productos + ", items=" + items + '}';
    }
    
    
}
