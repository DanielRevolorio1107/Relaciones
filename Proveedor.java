
package relaciones;

public class Proveedor {
    private String nombre;
    private int identificador;
    private int nit;
    private String direccion;
    private String fechaEntrega;

    public Proveedor(String nombre, int identificador, int nit, String direccion, String fechaEntrega) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.nit = nit;
        this.direccion = direccion;
        this.fechaEntrega = fechaEntrega;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getNit() {
        return nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
