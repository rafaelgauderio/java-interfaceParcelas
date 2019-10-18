package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import modelo.entidades.Contrato;
import modelo.entidades.Parcelas;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
				
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Informe os dados do contrato");
		System.out.print("Número: ");
		int  numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Data: ");
		Date dataContrato=data.parse(sc.nextLine());
		System.out.print("Valor Contratado: ");
		double valorcontratado=sc.nextDouble();
		System.out.print("Informe a quantidade de parcelas: ");
		int n=sc.nextInt();
		
		Contrato contrato=new Contrato(numero, dataContrato, valorcontratado);
		System.out.println("--------------------------------");
		System.out.println(contrato);
		System.out.println("Parcelado em "+n+" vezes");
		System.out.println("--------------------------------");
		
		sc.close();
		
		
		

	}
}
