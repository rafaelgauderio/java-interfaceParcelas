package servico;

public class DepositoServico  implements PagamentoOnlineServico{
	
	private static final double TAXA_DEPOSITO=5.00;
	private static final double JUROS_DEPOSITO=0.03;
	
	@Override
	public double pagamentoLivre(double valor) {
		return valor +TAXA_DEPOSITO;		
	}
	
	@Override
	public double juros(double valor, int meses) {
		return valor*JUROS_DEPOSITO*meses;
	}
	

}
