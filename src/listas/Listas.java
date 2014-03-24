/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listas;


import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JFrame;
/**
 *
 * @author Catalina Y Santiago
 */
public class Listas extends Canvas{

    
    @Override
    public void paint(Graphics g){
        
        int i = 0;
        int x= 10, y= 10, ancho= 100, alto= 50;
        
        g.setColor(Color.BLACK);
        g.drawRect(x, y, ancho, alto);
        g.drawString("Holi",(int)( 50),(int)(30));
        g.drawLine(x, y+30, ancho+10, y+30);
        g.drawString("Chai", 50, 55);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame jf = new JFrame("Almacenes");
        Listas lst = new Listas ();
        jf.setSize(800, 600);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(lst);
        
        
        NodoAlmacen L;
        VectorBodega bodega = new VectorBodega(100);
        L = new NodoAlmacen();
        
        Scanner scn= new Scanner(System.in);
        int opcion, contador=0, contadorp=0;
        
        
        System.out.println("¿Qué desea hacer?");
        System.out.println("Ingrese 1 para agregar un nuevo almacén, 2 para Agregar un nuevo producto");
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
                System.out.println("Ingrese nombre del producto, existencia y costo por unidad");
                String np=scn.next();
                int ex = scn.nextInt();
                double cu = scn.nextDouble();
                contadorp += 1;
                NodoProductos a = new NodoProductos(contadorp, np, ex, cu);
                bodega.setProducto(ex, a);
                
                break;
                
            case 3:
                
           
            case 0: System.exit(0);
                    }
                    System.out.println("¿Qué desea hacer?");
                    System.out.println("Ingrese 1 para agregar un nuevo almacén");
                    opcion = scn.nextInt();
                
    }
    }
   
}
