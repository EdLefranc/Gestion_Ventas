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
public class Compras {
    private int codCompra;
    private RRHH provedor;
    private List<Producto> producto;
    private double monto;

    public Compras() {
    }

    public Compras(int codCompra, RRHH provedor, List<Producto> producto, double monto) {
        this.codCompra = codCompra;
        this.provedor = provedor;
        this.producto = producto;
        this.monto = monto;
    }

    public int getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(int codCompra) {
        this.codCompra = codCompra;
    }

    public RRHH getProvedor() {
        return provedor;
    }

    public void setProvedor(RRHH provedor) {
        this.provedor = provedor;
    }

    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Compras{" + "codCompra=" + codCompra + ", provedor=" + provedor + ", producto=" + producto + ", monto=" + monto + '}';
    }
    
    
}
