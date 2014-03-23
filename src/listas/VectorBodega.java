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
public class VectorBodega {
    private int N;
    private static NodoProductos[] productos;
    
    
    public VectorBodega(int n){
        productos= new NodoProductos[n];       
    }
    
    public void setProducto(int p, NodoProductos x){
        productos[p]=x; 
    }
    
    public NodoProductos getProducto(int p){    
    return productos[p];
    }
    
    public static NodoProductos buscarProducto(int id){
        int i;
        for (i = 0; i < productos.length; i++){
        
        if (productos[i].getIdProducto() == id){
                return productos[i];         
            }  
        }  
        return null;
      }
}
