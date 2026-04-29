public class RegistrarPedido {
    private FacturaService factura;

    public RegistrarPedido(FacturaService factura) {
        this.factura = factura;
    }

    public void generarPedido(Pedido pedido, Cliente cliente) {
        System.out.println("Validando pedido #" + pedido.getIdPedido());

        factura.emitirFactura(cliente, pedido.getMonto());

        if(factura.validarComprobante()) {
            mostrarFactura(cliente, pedido);
        } else {
            System.out.println("Error: No se pudo confirmar la factura.");
        }
    }

    public void mostrarFactura(Cliente cliente, Pedido pedido) {
        System.out.println("--- Reporte de Generación ---");
        System.out.println("Venta completada para: " + cliente.getNombre());
    }
}
