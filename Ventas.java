
package relaciones;

import java.util.List;

public class Ventas {
    private String nombres;
    private String apellidos;
    private int nit;
    private int identificador ;
    private String material;
    private int medida;
    private int cantidad;
    private List<Materiales> materiales; //relacion 1 a n (un cliente compra n materiales)
    private List<Clasificacion> clasificacion; //relacion 1 a n ( un cliente compra n materiales clasificados)

    public Ventas(String nombres, String apellidos, int nit, int identificador, String material, int medida, int cantidad, List<Materiales> materiales, List<Clasificacion> clasificacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nit = nit;
        this.identificador = identificador;
        this.material = material;
        this.medida = medida;
        this.cantidad = cantidad;
        this.materiales = materiales;
        this.clasificacion = clasificacion;
    }

    public void setClasificacion(List<Clasificacion> clasificacion) {
        this.clasificacion = clasificacion;
    }

    public List<Clasificacion> getClasificacion() {
        return clasificacion;
    }

    public void setMateriales(List<Materiales> materiales) {
        this.materiales = materiales;
    }

    public String getNombres() {
        return nombres;
    }

    public List<Materiales> getMateriales() {
        return materiales;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getNit() {
        return nit;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getMaterial() {
        return material;
    }

    public int getMedida() {
        return medida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
