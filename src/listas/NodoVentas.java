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
    
    public static boolean existeProducto(NodoProductos x, NodoVentas p){
        
        
        while (( p != null) && ( x.getIdProducto() != p.getNodoProductos().getIdProducto())){
        
                p = p.getSiguienteVenta();       
        }
        if (p == null)
            return false;
        else
        return x.getIdProducto() != p.getNodoProductos().getIdProducto();
           
    }
    
    
    public void insertarVentaOrdenado(NodoAlmacen alm, NodoVentas x, NodoProductos p, int cant){
    
    NodoVentas n,  a;
    
    n = new NodoVentas(p,  cant, p.getCostoUnidad());
    if (alm.getSiguienteVenta() == null){
        n.setSiguienteVenta(null);
        alm.setSiguienteVenta(n);
    }
    else{
        a = buscarAnterior(alm, n.getNodoProductos().getIdProducto());    
        n.setSiguienteVenta(a.getSiguienteVenta());
        a.setSiguienteVenta(n);
            
        }
    }
    
    public NodoVentas buscarAnterior(NodoAlmacen cab, int id){
    
    int sw = 0;
    NodoVentas p, a;
    p = cab.getSiguienteVenta();
    a = null;
        while(p != null && sw == 0){
        if(p.getNodoProductos().getIdProducto() < id ){
        
         a = p;
         p = p.getSiguienteVenta();
        }
        else {
        
        sw = 1;
        
        }
        }
        
        return a; 
    }
    
    public void actualizarInformacion(NodoVentas x, int cant){
    
    x.setCantidadVendida(x.getCantidadVendida() + cant);
    x.setPrecioPromedio((x.getCantidadVendida() * x.getPrecioPromedio() + cant * x.getNodoProductos().getCostoUnidad()) / (x.getCantidadVendida() + cant));
    
    }
    
    
    public void registrarVenta(NodoAlmacen alm, int idP, int cant, int precio){
    
        
        NodoProductos p = VectorBodega.buscarProducto(idP);
         
           if (p.getExistencias() >= cant){
            
               if (existeProducto(p, this)){
                   actualizarInformacion(this, cant);
            }
               else{
                   insertarVentaOrdenado(alm, this, p, cant);
               }
           }
           else{
        
           System.out.print ("No hay suficiente cantidad del producto, en existencia: " + p.getExistencias());
        
        }
    
    }
    
    public static void totalVentas(NodoAlmacen p){
    
    NodoVentas x = p.getSiguienteVenta();
    double suma = 0;
    
    while (x != null){
    
        suma = suma + (x.getCantidadVendida() * x.getNodoProductos().getCostoUnidad());
        x = x.getSiguienteVenta();
    }
    
    System.out.println("Total ventas: " + suma );
    }
    
    
    
    
}
