
package dto;

import java.util.Date;

/**
 *
 * @author andre
 */
public class OrdenSalidaDTO {
    
    private int idOrdenSalida;
    private Date fecha;
    private String motivo;
    private int idUsuario;

    public OrdenSalidaDTO(int idOrdenSalida, Date fecha, String motivo, int idUsuario) {
        this.idOrdenSalida = idOrdenSalida;
        this.fecha = fecha;
        this.motivo = motivo;
        this.idUsuario = idUsuario;
    }

    public OrdenSalidaDTO(int idOrdenSalida) {
        this.idOrdenSalida = idOrdenSalida;
    }

    public int getIdOrdenSalida() {
        return idOrdenSalida;
    }

    public void setIdOrdenSalida(int idOrdenSalida) {
        this.idOrdenSalida = idOrdenSalida;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "OrdenSalidaDTO{" + "idOrdenSalida=" + idOrdenSalida + ", fecha=" + fecha + ", motivo=" + motivo + '}';
    }
}
