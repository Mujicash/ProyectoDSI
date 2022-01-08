
package dto;

import java.util.Date;

/**
 *
 * @author andre
 */
public class OrdenCompraDTO {
    
    private int idOrdenCompra;
    private int idProveedor;
    private Date fechaCompra;
    private Date fechaEntrega;
    private boolean estado;

    public OrdenCompraDTO() {
    }

    public OrdenCompraDTO(int idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

    public OrdenCompraDTO(int idOrdenCompra, int idProveedor, Date fechaCompra, Date fechaEntrega, boolean estado) {
        this.idOrdenCompra = idOrdenCompra;
        this.idProveedor = idProveedor;
        this.fechaCompra = fechaCompra;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
    }

    public int getIdOrdenCompra() {
        return idOrdenCompra;
    }

    public void setIdOrdenCompra(int idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

    public int getProveedor() {
        return idProveedor;
    }

    public void setProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "OrdenCompraDTO{" + "idOrdenCompra=" + idOrdenCompra + ", fechaCompra=" + fechaCompra + ", fechaEntrega=" + fechaEntrega + ", estado=" + estado + '}';
    }
    
}
