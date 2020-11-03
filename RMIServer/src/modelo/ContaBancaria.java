package modelo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ContaBancaria extends Remote {
	
	void depositar (double valor) throws RemoteException;
	
	double getSaldo() throws RemoteException;
	
	void sacar(double valor) throws RemoteException;
	
	void transferir (ContaBancaria contaBancaria, double valor) throws RemoteException;
	

}
