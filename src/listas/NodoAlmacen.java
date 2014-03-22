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
public class NodoAlmacen {
   private int idAlmacen;
   private String nombreAlmacen;
   private NodoAlmacen siguienteAlmacen;
   private NodoVentas siguienteVenta;
  /* private NodoAlmacen L;
   
   private void listaVacia(){  
   
   L.setIdAlmacen(0);
   L.setNombreAlmacen(null);
   L.setSiguienteAlmacen(L);
   L.setSiguienteVenta(null);
   }
     */
   public NodoAlmacen(int id, String nombre){

       idAlmacen=id;
       nombreAlmacen=nombre;
       siguienteVenta=null;
     
    }

   public NodoAlmacen(){  
       this.setIdAlmacen(0);
       this.setNombreAlmacen(null);
       this.setSiguienteAlmacen(this);
       this.setSiguienteVenta(null); 
   }
   
    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getNombreAlmacen() {
        return nombreAlmacen;
    }

    public void setNombreAlmacen(String nombreAlmacen) {
        this.nombreAlmacen = nombreAlmacen;
    }

    public NodoAlmacen getSiguienteAlmacen() {
        return siguienteAlmacen;
    }

    public void setSiguienteAlmacen(NodoAlmacen siguienteAlmacen) {
        this.siguienteAlmacen = siguienteAlmacen;
    }

    public NodoVentas getSiguienteVenta() {
        return siguienteVenta;
    }

    public void setSiguienteVenta(NodoVentas siguienteVenta) {
        this.siguienteVenta = siguienteVenta;
    }

    public static void insertarOrdenado(int id, String nombre, NodoAlmacen L){
         NodoAlmacen N, A;
         N = new NodoAlmacen(id, nombre);
         A= buscarDonde(id, L);
         N.setSiguienteAlmacen(A.getSiguienteAlmacen());
         A.setSiguienteAlmacen(N);
    }
    
    public static NodoAlmacen buscarDonde(int id, NodoAlmacen L){
        NodoAlmacen P,A;
        P= new NodoAlmacen();
        P.setSiguienteAlmacen(L.getSiguienteAlmacen());
        A = L;
        
        while(P != L){
            if(id > P.getIdAlmacen()){
                A = P;
                P = P.getSiguienteAlmacen();
            }
                else {
                return(A);
                        }
            
        }
        return (A);        
        
    }
   
    
}
