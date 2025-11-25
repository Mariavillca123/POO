public class Main{
    public static void main(String[]args){
//        productos Producto1 =
//                new productos("Leche la vaquita", 50, 5);
//        productos Producto2 =
//                new productos( "Detergente",  54, 5);
//        System.out.println("Detalles: " + Producto1.toString());
//        System.out.println("Total: " + Producto1.calcularTotal());
//
//        System.out.println("\nDetalles: " + Producto2.toString());
//        System.out.println("Total: " + Producto2.calcularTotal());
        GestorProductos gp = new GestorProductos();
        gp.agregarProducto(new Productos("Leche la vaquita", 50,5, TipoProducto.ALIMENTOS));
        gp.agregarProducto(new Productos("Detergente", 54, 5, TipoProducto.LIMPIEZA));
        gp.agregarProducto(new Productos("Mesa", 100, 8, TipoProducto.MUEBLES));
        gp.mostrarProducto();
        gp.gananciaTotal();
        double ganacia = gp.gananciaTotal();
        System.out.println(ganacia);
        System.out.println("**********************");

        TipoProducto buscando = TipoProducto.buscarPorCodigo("AXN8");
        System.out.println(buscando);
    }
}
