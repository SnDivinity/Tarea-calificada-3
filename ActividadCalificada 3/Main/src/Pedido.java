public class Pedido {
    private String idPedido;
    private Double monto;
    private Cliente cliente;

    public Pedido(String idPedido, Double monto, Cliente cliente) {
        this.idPedido = idPedido;
        this.monto = monto;
        this.cliente = cliente;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public Double getMonto() {
        return monto;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
