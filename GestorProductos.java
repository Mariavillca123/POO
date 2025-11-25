import java.util.ArrayList;

public class GestorProductos {
    ArrayList<Productos> inventario = new ArrayList<>();

    public void agregarProducto(Productos productos){
        inventario.add(productos);
    }

    public void mostrarProducto(){
        System.out.println("\n*LISTA DE PRODUCTOS***\n");
        for(Productos productos: inventario){
            System.out.println(productos);
        }
    }

    public double gananciaTotal(){
        double total = 0;
        for(Productos productos: inventario){
            total += productos.calcularTotal();
        }
        return total;
    }
}
