package com.test.Practica1;

public class Cliente extends CuentaBancaria {

	public Cliente(CuentaBancaria cuentab) {
		super(cuentab);
		// TODO Auto-generated constructor stub
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nombreCliente, String numCuenta, double tInteres, double saldo) {
		super(nombreCliente, numCuenta, tInteres, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Mensaje1(String constructor) {
		// TODO Auto-generated method stub
		return "Mensaje para el constructor: " + constructor;
	}
}
