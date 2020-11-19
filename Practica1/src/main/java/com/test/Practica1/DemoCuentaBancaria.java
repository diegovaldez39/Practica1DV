package com.test.Practica1;

import java.util.Scanner;

public class DemoCuentaBancaria {

	public static void main(String[] args) {
		// Creacion de Objetos
		Cliente c = new Cliente();
		Scanner leer = new Scanner(System.in);

		System.out.println(c.Mensaje1("POR OMISION"));

		// Captura de Datos

		System.out.println("Ingrese el Nombre del Cliente: ");
		c.setNombreCliente(leer.nextLine());
		System.out.println("Ingrese el Numero de Cuenta: ");
		c.setNumCuenta(leer.nextLine());
		System.out.println("Ingrese el Tipo de Interes: ");
		c.settInteres(leer.nextDouble());
		System.out.println("Ingrese el Saldo: ");
		c.setSaldo(leer.nextDouble());

		System.out.println("El Nombre es: " + c.getNombreCliente());
		System.out.println("Numero de Cuenta: " + c.getNumCuenta());
		System.out.println("Tipo de Interes: " + c.gettInteres());
		System.out.println("El Saldo esa: " + c.getSaldo());

		System.out.println(c.Mensaje1("POR PERSONALIZADO"));

		// Con Variables Auxiliares
		System.out.println("Ingrese el Nombre del Cliente: ");
		String nom = leer.nextLine();
		System.out.println("Ingrese el Numero de Cuenta: ");
		String num = leer.nextLine();
		System.out.println("Ingrese el Tipo de Interes: ");
		double interes = leer.nextDouble();
		System.out.println("Ingrese el Saldo: ");
		double sal = leer.nextDouble();

		Cliente c2 = new Cliente(nom, num, interes, sal);

		System.out.println("El Nombre es: " + c2.getNombreCliente());
		System.out.println("Numero de Cuenta: " + c2.getNumCuenta());
		System.out.println("Tipo de Interes: " + c2.gettInteres());
		System.out.println("El Saldo esa: " + c2.getSaldo());
		
		System.out.println(c.Mensaje1("COPIA"));
		
		Cliente c3 = new Cliente(c);
		System.out.println("El Nombre es: " + c3.getNombreCliente());
		System.out.println("Numero de Cuenta: " + c3.getNumCuenta());
		System.out.println("Tipo de Interes: " + c3.gettInteres());
		System.out.println("El Saldo esa: " + c3.getSaldo());
	}

}
