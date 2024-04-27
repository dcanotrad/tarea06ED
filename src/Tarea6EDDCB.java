/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Tarea6EDDCB {
    
    public void aplicarDescuento(double precioProducto, int numProductos){     
        logProductos(numProductos, precioProducto);

    }

    private void logProductos(int numProductos, double precioProducto) {
        double Total;
        if(numProductos>3)
            precioProducto-=descuentoFijoMasDe3Productos;
        if (numProductos!=0){
            Total = precioProducto*0.8;
            System.out.println("El total a pagar es:"+Total);
            System.out.println("Enviado");
        }else {
            Total = precioProducto*0.95;
            System.out.println("El total a pagar es:"+Total);
            System.out.println("Enviado");
        }
    }
    private static final int descuentoFijoMasDe3Productos = 5;
    
    
}
