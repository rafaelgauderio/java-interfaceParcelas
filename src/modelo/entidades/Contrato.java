package modelo.entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Contrato {
	
	
	private static SimpleDateFormat data=new SimpleDateFormat("dd/MM/yyyy");
	
	private List <Parcelas> parcelas = new ArrayList<>();
	private Integer numero;
	private Date datacontrato;
	private Double valorcontratado;
	
	public Contrato() {
		
	}
		
	public Contrato(Integer numero, Date datacontrato, Double valorcontratado) {
		this.numero = numero;
		this.datacontrato = datacontrato;
		this.valorcontratado = valorcontratado;
	}

	
	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getDataContrato() {
		return datacontrato;
	}


	public void setData(Date datacontrato) {
		this.datacontrato = datacontrato;
	}



	public Double getValorcontratado() {
		return valorcontratado;
	}



	public void setValorcontratado(Double valorcontratado) {
		this.valorcontratado = valorcontratado;
	}

	
		public List<Parcelas> getParcelas() {
		return parcelas;
		}	
		
	public void adicionarParcelas(Parcelas quantParcelas) {	
		parcelas.add(quantParcelas);
	}
	
	public void removerParcelas(Parcelas quantParcelas) {
		parcelas.remove(quantParcelas);
	}
	

	@Override
	public String toString() {
		return "Número do contrato: "+numero+
				"\nData da contratação: "+data.format(datacontrato)+
				"\nValor Contratado: "+String.format("R$ %.2f",valorcontratado);
		
	}
	
}
