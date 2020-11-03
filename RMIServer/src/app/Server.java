package app;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import modelo.ContaBancaria;
import modelo.ContaBancariaImpl;


public class Server {

	public static void main(String[] args) throws Exception {

	   ContaBancaria contaBancaria = new ContaBancariaImpl();

		//ContaBancaria contaStub = (ContaBancaria) UnicastRemoteObject.exportObject(contaBancaria, 0);
		Registry registry = LocateRegistry.createRegistry(1020);
		registry.rebind("conta", contaBancaria);
		System.out.println("Aguardando...");
		
		

	}

}
