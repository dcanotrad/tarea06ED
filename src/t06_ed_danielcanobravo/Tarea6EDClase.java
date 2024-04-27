package t06_ed_danielcanobravo;

public class Tarea6EDClase {

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double Total;
        if (numProductos > 3) {
            precioProducto -= reduccionFija;
        }
        logProductos(numProductos, precioProducto);

    }
    private static final int reduccionFija = 5;

    private void logProductos(int numProductos, double precioProducto) {
        double Total;
        if (numProductos != 0) {
            Total = precioProducto * 0.8;
            System.out.println("El total a pagar es:" + Total);
            System.out.println("Enviado");
        } else {
            Total = precioProducto * 0.95;
            System.out.println("El total a pagar es:" + Total);
            System.out.println("Enviado");
        }
    }
}
