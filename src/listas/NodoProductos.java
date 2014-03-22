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
public class NodoProductos {
    private int idProducto;
    private String nombreProducto;
    private int existencias;
    private double costoUnidad;

    public NodoProductos(int idProducto, String nombreProducto, int existencias, double costoUnidad) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.existencias = existencias;
        this.costoUnidad = costoUnidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public double getCostoUnidad() {
        return costoUnidad;
    }

    public void setCostoUnidad(double costoUnidad) {
        this.costoUnidad = costoUnidad;
    }
    
}
