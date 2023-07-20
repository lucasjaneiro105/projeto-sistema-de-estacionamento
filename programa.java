package aplicacao;

import java.util.Scanner;

import entidades.Estacionamento;

public class programa {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Estacionamento[] vagas = new Estacionamento[20];
		
		System.out.println("Quantos carros deseja estacionar? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Carro - " + i + ":");
			System.out.println("nome do motorista? ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("placa: ");
			String placa = sc.nextLine();
			System.out.print("Vaga: ");
			int vaga = sc.nextInt();
			vagas[vaga] = new Estacionamento(nome, placa);
			}
		
		System.out.println();
		System.out.println("vagas ocupadas:");
		for (int i=0; i<20; i++) {
		if (vagas[i] != null) {
		System.out.println(i + ": " + vagas[i]);}}
		
	
		sc.close();

	}
	
}
