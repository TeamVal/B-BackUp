package pe.edu.upc.backup.dtos;
import java.time.LocalDate;

public class GrupoDTO {

    private int id;
    private String nombre;
    private String descripcion;
    private LocalDate fechaCrear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCrear() {
        return fechaCrear;
    }

    public void setFechaCrear(LocalDate fechaCrear) {
        this.fechaCrear = fechaCrear;
    }
}
