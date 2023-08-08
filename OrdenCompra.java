
package relaciones;

import java.util.List;


public class OrdenCompra {
    private int identificador ;
    private String nombre;
    private float costo;
    private String proveedor;
    private int cantidad;
    private String fechaPedido;
    private Proveedor prov; //relacion 1 a 1 (1 orden de compra por proveedor)
    private List<Materiales> listaMateriales; //relacion n a 1 (una lista materiales por 1 orden de compra)

   

    public OrdenCompra(int identificador, String nombre, float costo, String proveedor, int cantidad, String fechaPedido, Proveedor prov, List<Materiales> listaMateriales) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.costo = costo;
        this.proveedor = proveedor;
        this.cantidad = cantidad;
        this.fechaPedido = fechaPedido;
        this.prov = prov;
        this.listaMateriales = listaMateriales;
    }

    public void setProv(Proveedor prov) {
        this.prov = prov;
    }

    public Proveedor getProv() {
        return prov;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCosto() {
        return costo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
}
