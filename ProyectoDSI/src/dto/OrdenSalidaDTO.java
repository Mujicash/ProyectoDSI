
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
    private UsuarioDTO usuario;

    public OrdenSalidaDTO(int idOrdenSalida, Date fecha, String motivo, UsuarioDTO idUsuario) {
        this.idOrdenSalida = idOrdenSalida;
        this.fecha = fecha;
        this.motivo = motivo;
        this.usuario = idUsuario;
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

    public UsuarioDTO getIdUsuario() {
        return usuario;
    }

    public void setIdUsuario(UsuarioDTO idUsuario) {
        this.usuario = idUsuario;
    }

    @Override
    public String toString() {
        return "OrdenSalidaDTO{" + "idOrdenSalida=" + idOrdenSalida + ", fecha=" + fecha + ", motivo=" + motivo + '}';
    }
}
