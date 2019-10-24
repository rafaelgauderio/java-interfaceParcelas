package servico;

public class PaypalServico implements PagamentoOnlineServico {
	
	private static final double PORCENTAGEM_LIVRE=0.02;
	private static final double JUROS_MENSAIS= 0.03;

	@Override
	public double pagamentoLivre(double valor) {
		return valor* PORCENTAGEM_LIVRE;
	}
	
	@Override
	public double juros(double valor, int meses) {
		return valor* JUROS_MENSAIS *meses ;
	}
	
	
}
