
package relaciones;

import java.util.List;


public class Clasificacion {
    private int identificador;
    private float medida;
    private String nombre;
    private int cantidad;
    

    public Clasificacion(int identificador, float medida, String nombre, int cantidad) {
        this.identificador = identificador;
        this.medida = medida;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public int getIdentificador() {
        return identificador;
    }

    public float getMedida() {
        return medida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setMedida(float medida) {
        this.medida = medida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
