package app;

import java.rmi.Naming;

import modelo.ContaBancaria;

public class Client {

	public static void main(String[] args) throws Exception {
	
		ContaBancaria contaBancaria = (ContaBancaria) Naming.lookup("rmi://localhost:1020/conta");
		ContaBancaria contaBancaria1 = (ContaBancaria) Naming.lookup("rmi://localhost:1020/conta");
		contaBancaria.depositar(1000);
		contaBancaria.sacar(200);
//		
	
		System.out.println(contaBancaria1.getSaldo());
	}

}
