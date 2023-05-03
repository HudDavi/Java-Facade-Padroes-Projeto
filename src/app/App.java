package app;

import app.service.Service;

public abstract class App {
	public static void main(String[] args) {
		Service cliente = new Service();
		cliente.service("Hudson Davi", "69000000");
	}
}