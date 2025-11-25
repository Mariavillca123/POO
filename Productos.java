public class Productos {
    private String nombre;
    private double precio;
    private int cantidad;
    private TipoProducto tipo;

    public Productos(String nombre, double precio, int cantidad, TipoProducto tipo){
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    //SETTER

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    // public o private - final
    public double calcularTotal(){
        return precio * cantidad;
    }
    @Override
    public String toString(){
        return "Nombre = " + nombre +
                "\nPrecio = " + precio +
                "\nCantidad = " + cantidad +
                "\n Descripcion de producto: " + tipo.getDescripcion()+
                "\n Codigo de producto: " + tipo.getCodigo()+
                "\n Impuesto de producto: " + tipo.getImpuesto();

    }
}
