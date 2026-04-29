public class LegacyBillingSystem {
    private boolean estadoComprobante;

    public void crearComprobante() {
        System.out.println("Llamada al sistema antiguo: Generando...");
        this.estadoComprobante = true;
    }

    public boolean confirmarEstado(boolean estado) {
        return this.estadoComprobante;
    }
}
