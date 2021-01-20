
package Datos;

/**
 *
 * @author Jose
 */
public class p_reserva {
    
    private p_cliente cliente;
    private p_detalle_reserva detalle_reserva;
    private p_fecha fecha;
    private p_pago pago;

    public p_reserva() {
    }

    public p_cliente getCliente() {
        return cliente;
    }

    public void setCliente(p_cliente cliente) {
        this.cliente = cliente;
    }

    public p_detalle_reserva getDetalle_reserva() {
        return detalle_reserva;
    }

    public void setDetalle_reserva(p_detalle_reserva detalle_reserva) {
        this.detalle_reserva = detalle_reserva;
    }

    public p_fecha getFecha() {
        return fecha;
    }

    public void setFecha(p_fecha fecha) {
        this.fecha = fecha;
    }

    public p_pago getPago() {
        return pago;
    }

    public void setPago(p_pago pago) {
        this.pago = pago;
    }
    
    
    
    
}
