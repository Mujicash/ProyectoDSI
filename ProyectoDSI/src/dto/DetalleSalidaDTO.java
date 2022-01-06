
package dto;

/**
 *
 * @author andre
 */
public class DetalleSalidaDTO {
    
    //private int idOrdenSalida;
    private OrdenSalidaDTO orden;
    private ProductoDTO producto;
    //private int idTipoProducto;
    //private int idMedicamento;
    private int cantidad;

    public DetalleSalidaDTO() {
    }

    public DetalleSalidaDTO(OrdenSalidaDTO orden, ProductoDTO producto, int cantidad) {
        this.orden = orden;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public OrdenSalidaDTO getOrden() {
        return orden;
    }

    public void setOrden(OrdenSalidaDTO orden) {
        this.orden = orden;
    }

    public ProductoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDTO producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DetalleSalidaDTO{" + "orden=" + orden + ", producto=" + producto + ", cantidad=" + cantidad + '}';
    }
}
