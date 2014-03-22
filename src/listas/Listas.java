/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listas;


import java.util.Scanner;
/**
 *
 * @author Catalina Y Santiago
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NodoAlmacen L;
        VectorBodega bodega = new VectorBodega(100);
        L = new NodoAlmacen();
        
        Scanner scn= new Scanner(System.in);
        int opcion, contador=0, contadorp=0;
        
        
        System.out.println("¿Qué desea hacer?");
        System.out.println("Ingrese 1 para agregar un nuevo almacén");
        opcion=scn.nextInt();
        
        while(opcion != 0){
        switch(opcion){
            case 1: 
                    System.out.println("Ingrese nombre del almacén");
                    String nombre=scn.next();
                    contador += 1;
                    NodoAlmacen.insertarOrdenado(contador, nombre, L);
                    System.out.println("El almacén ha sido guardado");
                    break;
                
            case 2:
                System.out.print("Ingrese nombre del producto, existencia y costo por unidad");
                String np=scn.next();
                int ex = scn.nextInt();
                double cu = scn.nextDouble();
                contadorp += 1;
                NodoProductos a = new NodoProductos(contadorp, np, ex, cu);
                bodega.setProducto(ex, a);
                
                break;
                
            case 0: System.exit(0);
                    }
                    System.out.println("¿Qué desea hacer?");
                    System.out.println("Ingrese 1 para agregar un nuevo almacén");
                    opcion = scn.nextInt();
                
    }
    }
   
}
