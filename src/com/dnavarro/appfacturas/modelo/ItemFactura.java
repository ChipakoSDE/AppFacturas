package com.dnavarro.appfacturas.modelo;

public class ItemFactura {
    private int cantidad;
    private Producto producto;

    public ItemFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double calcularImporte(){
        return this.cantidad * this.producto.getPrecio();
    }

    @Override
    public String toString() {
        return producto +
                "\t\t" + cantidad +
                "\t" + calcularImporte();
    }
}