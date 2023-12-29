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
public class Ventas {
    private int codVenta;
    private RRHH cliente;
    private List<ItemProd> item;
    private double monto;

    public Ventas() {
    }

    public Ventas(int codVenta, RRHH cliente, List<ItemProd> item, double monto) {
        this.codVenta = codVenta;
        this.cliente = cliente;
        this.item = item;
        this.monto = monto;
    }

    public int getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(int codVenta) {
        this.codVenta = codVenta;
    }

    public RRHH getCliente() {
        return cliente;
    }

    public void setCliente(RRHH cliente) {
        this.cliente = cliente;
    }

    public List<ItemProd> getItem() {
        return item;
    }

    public void setItem(List<ItemProd> item) {
        this.item = item;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Ventas{" + "codVenta=" + codVenta + ", cliente=" + cliente + ", item=" + item + ", monto=" + monto + '}';
    }
    
    
}
