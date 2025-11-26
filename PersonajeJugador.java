public class PersonajeJugador {
    private String nombre;
    private int nivel;
    private int salud;
    private TipoPersonaje tipo;

    public PersonajeJugador(String nombre, int nivel, int salud, TipoPersonaje tipo){
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
        this.tipo = tipo;
    }

    // GETTERS
    public String getNombre() { return nombre; }
    public int getNivel() { return nivel; }
    public int getSalud() { return salud; }
    public TipoPersonaje getTipo() { return tipo; }

    // SETTERS
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setNivel(int nivel) { this.nivel = nivel; }
    public void setSalud(int salud) { this.salud = salud; }
    public void setTipo(TipoPersonaje tipo) { this.tipo = tipo; }

    public void recibirDanio(int cantidad){
        this.salud -= cantidad;
        if(this.salud < 0){
            this.salud = 0;
        }
        System.out.println(nombre + " ha recibido " + cantidad +
                " puntos de daño. Salud restante: " + salud);
    }

    public String atacar(String enemigo){
        return nombre + " ataca a " + enemigo + " utilizando su habilidad de "
                + tipo.getNombre() + ".";
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre +
                "\nNivel: " + nivel +
                "\nSalud: " + salud +
                "\nTipo de personaje: " + tipo.getNombre() +
                "\nDescripción: " + tipo.getDescripcion() +
                "\nCódigo: " + tipo.getCodigo();
    }
}
