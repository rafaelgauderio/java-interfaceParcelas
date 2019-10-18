package modelo.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas {

	private static SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
	private Date dataPagamento;
	private Double valorDaParcela;

	public Parcelas() {

	}

	public Parcelas(Date dataPagamento, Double valorDaParcela) {
		this.dataPagamento = dataPagamento;
		this.valorDaParcela = valorDaParcela;
	}

	public static SimpleDateFormat getData() {
		return data;
	}

	public static void setData(SimpleDateFormat data) {
		Parcelas.data = data;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Double getValorDaParcela() {
		return valorDaParcela;
	}

	public void setValorDaParcela(Double valorDaParcela) {
		this.valorDaParcela = valorDaParcela;
	}
	
	@Override
	public String toString() {
		return data.format(dataPagamento)+" - "+String.format("R$ %.2f", valorDaParcela);
	}
	

}
