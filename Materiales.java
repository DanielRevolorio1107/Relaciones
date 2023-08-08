
package relaciones;

public class Materiales {
    private String nombre;
    private String clasificacion;
    private float costo;
    private String proveedor;
    private int identificador;
    private Clasificacion  clasif; // relacion 1 a 1 (1 material sera clasificaco 1 vez)
    

   
    
    public Materiales(String nombre, String clasificacion, float costo, String proveedor, int identificador, Clasificacion clasif) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.costo = costo;
        this.proveedor = proveedor;
        this.identificador = identificador;
         this.clasif = clasif;
    }

    public void setClasif(Clasificacion clasif) {
        this.clasif = clasif;
    }
    
    public Clasificacion getClasif() {
        return clasif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public float getCosto() {
        return costo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public int getIdentificador() {
        return identificador;
    }
    
    
}
