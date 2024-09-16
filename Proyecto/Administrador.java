package Proyecto;

public class Administrador{
    private String id;
    private String nombre;
    private String apellidos;
    private String fechadenacimiento;

    public Administrador(String id, String nombre, String apellidos, String fechadenacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechadenacimiento = fechadenacimiento;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    
    public String getFechadenacimiento() {
        return fechadenacimiento;
    }
    public void setFechadenacimiento(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    @Override
    public String toString() {
        return "Administrador [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechadenacimiento="
                + fechadenacimiento + "]";
    }

}
