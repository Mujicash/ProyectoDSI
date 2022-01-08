
package dto;

/**
 *
 * @author andre
 */
public class DetalleCompraDTO {
    
    private int idOrdenCompra;
    private int idMedicamento;
    private int unidades;
    private float precio;

    public DetalleCompraDTO() {
    }

    public DetalleCompraDTO(int idOrdenCompra, int idMedicamento) {
        this.idOrdenCompra = idOrdenCompra;
        this.idMedicamento = idMedicamento;
    }

    public DetalleCompraDTO(int idOrdenCompra, int idMedicamento, int unidades, float precio) {
        this.idOrdenCompra = idOrdenCompra;
        this.idMedicamento = idMedicamento;
        this.unidades = unidades;
        this.precio = precio;
    }

    public int getIdOrdenCompra() {
        return idOrdenCompra;
    }

    public void setIdOrdenCompra(int idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "DetalleCompraDTO{" + "orden=" + idOrdenCompra + ", medicamento=" + idMedicamento + ", unidades=" + unidades + ", precio=" + precio + '}';
    }
}
