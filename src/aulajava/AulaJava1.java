package aulajava;

import java.util.Scanner;

public class AulaJava1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hora;

		System.out.println("Quantas Horas? ");
		hora = scan.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		} else {
			if (hora < 18) {
				System.out.println("Boa Tarde");
			} else {
				System.out.println("Boa Noite");
			}
		}

		scan.close();
	}
}


/*Estudos de condicional IF-ELSE*/