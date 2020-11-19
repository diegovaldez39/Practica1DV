package com.test.Practica1;

public abstract class CuentaBancaria {
	private String nombreCliente, numCuenta;
	private double tInteres, saldo;

	public CuentaBancaria() {

	}

	public CuentaBancaria(String nombreCliente, String numCuenta, double tInteres, double saldo) {
		this.nombreCliente = nombreCliente;
		this.numCuenta = numCuenta;
		this.tInteres = tInteres;
		this.saldo = saldo;
	}

	public CuentaBancaria(CuentaBancaria cuentab) {
		this.nombreCliente = cuentab.nombreCliente;
		this.numCuenta = cuentab.numCuenta;
		this.tInteres = cuentab.tInteres;
		this.saldo = cuentab.saldo;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double gettInteres() {
		return tInteres;
	}

	public void settInteres(double tInteres) {
		this.tInteres = tInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract String Mensaje1(String constructor);
	
}
