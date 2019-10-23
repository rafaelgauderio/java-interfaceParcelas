package servico;

public interface PagamentoOnlineServico {
	double pagamentoLivre(double valor);
	double juros(double valor, int meses);

}
