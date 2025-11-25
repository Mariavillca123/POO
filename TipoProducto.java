public enum TipoProducto {
    LIMPIEZA("Limpieza","AXN8","Productos para limpieza del hogar o uso industrial", 0.10),
    MUEBLES("Muebles","MUE8","Mobiliario para oficina u hogar", 0.12),
    TECNOLOGIA("Tecnologia","TEC6","Equipos electronico, computo o accesorios digitales", 0.16),
    ALIMENTOS("Alimentos","ALI9","Productos alimentos perecibles o no perecibles", 0.16),
    OTROS("Otros","OTRO96","Productos no clasificados en otra categoria", 0.18);
    private final String nombreP;
    private final String codigo;
    private final String descripcion;
    private final double impuesto;

    TipoProducto(String nombreP, String codigo, String descripcion, double impuesto){
        this.nombreP = nombreP;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.impuesto = impuesto;
    }

    public String getNombreP() {
        return nombreP;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public static TipoProducto buscarPorCodigo(String codigo){
        for(TipoProducto tipo: values()){
            if(tipo.codigo.equalsIgnoreCase(codigo)){
                return tipo;
            }
        }
        return null;
    }
}

