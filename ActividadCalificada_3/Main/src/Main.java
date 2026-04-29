//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("JuanCarlos", "juan@gmail.com");
        Pedido pedido = new Pedido("pedido 1", 250.50, cliente);

        LegacyBillingSystem sistemaViejo = new LegacyBillingSystem();

        FacturaService adaptador = new AdapterBillingSystem(sistemaViejo);

        RegistrarPedido registro = new RegistrarPedido(adaptador);

        registro.generarPedido(pedido, cliente);
        

    }
}