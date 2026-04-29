public class AdapterBillingSystem implements FacturaService{
    private LegacyBillingSystem system;

    public AdapterBillingSystem(LegacyBillingSystem system) {
        this.system = system;
    }

    @Override
    public void emitirFactura(Cliente cliente, double monto) {
        system.crearComprobante();
        System.out.println("FACTURA GENERADA EXITOSAMENTE");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Monto: " + monto);
    }

    @Override
    public boolean validarComprobante() {
        return system.confirmarEstado(true);
    }
}
