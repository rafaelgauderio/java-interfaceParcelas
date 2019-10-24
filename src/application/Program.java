package application;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import modelo.entidades.Contrato;
import modelo.entidades.Parcelas;
import servico.ContratoDeServico;
import servico.PaypalServico;
import servico.PagamentoOnlineServico;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Informe os dados do contrato");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Data: ");
		Date dataContrato = data.parse(sc.nextLine());
		System.out.print("Valor Contratado: ");
		double valorcontratado = sc.nextDouble();
		System.out.print("Informe a quantidade de parcelas: ");
		int n = sc.nextInt();

		Contrato contrato = new Contrato(numero, dataContrato, valorcontratado);
		ContratoDeServico contratodeServico = new ContratoDeServico(new PaypalServico());
		contratodeServico.ContratoProcessado(contrato, n);
		System.out.println("--------------------------------");
		System.out.println(contrato);
		System.out.println("Parcelado em " + n + " vezes");
		double valordaParcela = contrato.getValorcontratado() / n;
		System.out.println("O valor de cada parcela, sem juros e taxas: R$ " + String.format("%.2f", valordaParcela));
		System.out.println("--------------------------------");
		System.out.println("Parcelamento com taxa de juros (taxa de 2% e juros de 3% ao mês)");
		for (Parcelas apelido : contrato.getParcelas()) {
			System.out.println(apelido);
		}
		System.out.println("--------------------------------");

		System.out.println();

		sc.close();

	}
}
