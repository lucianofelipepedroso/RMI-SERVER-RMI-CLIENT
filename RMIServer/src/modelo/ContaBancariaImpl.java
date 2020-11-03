package modelo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ContaBancariaImpl extends UnicastRemoteObject implements ContaBancaria {

	private static final long serialVersionUID = 1L;

	private double saldo;

	public ContaBancariaImpl() throws RemoteException {

	}

	public double getSaldo() throws RemoteException {
		return this.saldo;
	}

	public void sacar(double valor) throws RemoteException {
		this.saldo -= valor;
	}

	public void transferir(ContaBancaria outraConta, double valor) throws RemoteException {
		sacar(valor);
		outraConta.depositar(valor);

	}

	public void depositar(double valor) throws RemoteException {
		this.saldo += valor;

	}

}
