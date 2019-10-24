package servico;

import java.util.Calendar;
import java.util.Date;

import modelo.entidades.Contrato;
import modelo.entidades.Parcelas;

public class ContratoDeServico {

	private PagamentoOnlineServico pagamentoOnlineServico;

	public ContratoDeServico(PagamentoOnlineServico pagamentoOnlineServico) {

		this.pagamentoOnlineServico = pagamentoOnlineServico;
	}

	private Date adicionarMeses(Date data, int n) {
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		calendario.add(Calendar.MONTH, n);
		return calendario.getTime();
	}

	public void ContratoProcessado(Contrato contrato, int meses) {
		// cota basica é sem os valores da taxa de pagamentos e dos juros

		double cotaBasica = contrato.getValorcontratado() / meses;
		// juros compostos. O valor da cota atualizada é sempre calculada como base na
		// anterior
		for (int i = 1; i <= meses; i++) {
			Date data = adicionarMeses(contrato.getDataContrato(), i);

			double cotaAtualizada = cotaBasica + pagamentoOnlineServico.juros(cotaBasica, i);
			double cotaFinal = cotaAtualizada + pagamentoOnlineServico.pagamentoLivre(cotaAtualizada);
			contrato.adicionarParcelas(new Parcelas(data, cotaFinal));
		}

	}

}
