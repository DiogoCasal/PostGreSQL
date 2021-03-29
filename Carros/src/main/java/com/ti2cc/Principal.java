package com.ti2cc;
import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		Scanner insert = new Scanner(System.in);
		DAO dao = new DAO();
		int cod = 0, placa = 0;
		String nome, modelo;

		dao.conectar();

		int in = 0;
		System.out.println("Selecione sua opcao:");
		System.out.println("1 - Listar");
		System.out.println("2 - Inserir");
		System.out.println("3 - Excluir");
		System.out.println("4 - Atualizar ");
		System.out.println("5 - Sair");
		while( in != 5 ){
		
			in = insert.nextInt();
		
			if(in == 1 ){
				Carro[] carros = dao.getCarros();
				for(int i = 0; i < carros.length; i++) {
					System.out.println(carros[i].toString());
				}
			} else if (in == 2) {
				System.out.println("Nomeie os atributos:");
				cod = insert.nextInt();
				nome = insert.next();
				modelo = insert.next();
				placa = insert.nextInt();
				Carro carro = new Carro(cod, nome, modelo,placa);
				if(dao.inserirCarro(carro) == true) {
					System.out.println("Insercao com sucesso -> " + carro.toString());
				}
			} else if (in == 3) {
				System.out.println("Nomeie o cod:");
				cod = insert.nextInt();
				dao.excluirCarro(cod);
			} else if( in ==4){
				System.out.println("Nomeie os atributos:");
				cod = insert.nextInt();
				nome = insert.next();
				modelo = insert.next();
				placa = insert.nextInt();
				Carro carro = new Carro(cod, nome, modelo,placa);
				if(dao.inserirCarro(carro) == true) {
					System.out.println("Insercao com sucesso -> " + carro.toString());
				}
			}
		}
		
		insert.close();
		dao.close();
	}
}
