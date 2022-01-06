
package dto;

/**
 *
 * @author andre
 */
public class DetalleCompraDTO {
    
    private OrdenCompraDTO orden;
    private MedicamentoDTO medicamento;
    private int unidades;
    private float precio;

    public DetalleCompraDTO() {
    }

    public DetalleCompraDTO(OrdenCompraDTO orden, MedicamentoDTO medicamento) {
        this.orden = orden;
        this.medicamento = medicamento;
    }

    public DetalleCompraDTO(OrdenCompraDTO orden, MedicamentoDTO medicamento, int unidades, float precio) {
        this.orden = orden;
        this.medicamento = medicamento;
        this.unidades = unidades;
        this.precio = precio;
    }

    public OrdenCompraDTO getOrden() {
        return orden;
    }

    public void setOrden(OrdenCompraDTO orden) {
        this.orden = orden;
    }

    public MedicamentoDTO getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(MedicamentoDTO medicamento) {
        this.medicamento = medicamento;
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
        return "DetalleCompraDTO{" + "orden=" + orden + ", medicamento=" + medicamento + ", unidades=" + unidades + ", precio=" + precio + '}';
    }
}
