public class main {
    public static void main(String[] args) {
        persona p = new persona("Enzo","Rojas",34);
        System.out.println(p.toString());
        p.setNombre("Pors");
        p.setEdad(30);
        System.out.println(p.toString());


    }
}class persona{
    private String nombre,apellido;
    private int edad;
    private boolean activo;

    public persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+" , apellido: "+apellido+" edad: "+edad;
    }
}
