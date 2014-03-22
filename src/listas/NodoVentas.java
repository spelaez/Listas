/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listas;

/**
 *
 * @author Catalina
 */
public class NodoVentas {
    private NodoProductos producto;
    private int cantidadVendida;
    private double precioPromedio;
    private NodoVentas siguienteVenta;

    public NodoVentas(NodoProductos producto, int cantidadVendida, double precioPromedio) {
        this.producto = producto;
        this.cantidadVendida = cantidadVendida;
        this.precioPromedio = precioPromedio;
        this.siguienteVenta = null;
    }

    public NodoProductos getNodoProductos() {
        return producto;
    }

    public void setNodoProductos(NodoProductos producto) {
        this.producto = producto;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public double getPrecioPromedio() {
        return precioPromedio;
    }

    public void setPrecioPromedio(double precioPromedio) {
        this.precioPromedio = precioPromedio;
    }

    public NodoVentas getSiguienteVenta() {
        return siguienteVenta;
    }

    public void setSiguienteVenta(NodoVentas siguienteVenta) {
        this.siguienteVenta = siguienteVenta;
    }
    
    public boolean existeProducto(NodoProductos x, NodoVentas p){
        
        
        while (( p != null) && ( x.getIdProducto() != p.getNodoProductos().getIdProducto())){
        
                p = p.getSiguienteVenta();       
        }
        if (p == null)
            return false;
        else
        return x.getIdProducto() != p.getNodoProductos().getIdProducto();
           
    }
    
}
