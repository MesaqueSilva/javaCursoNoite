package javaCursoNoite;

public class FormaDePagamento {
    public static void main(String[] args) {
        String formaPagamento = "boleto"; // Altere para "cartao" para testar o outro pagamento

        Pagamento pagamento;

        if (formaPagamento.equals("cartao")) {
            pagamento = new CartaoDeCredito();
        } else {
            pagamento = new Boleto();
        }

        pagamento.realizarPagamento();
    }
}
