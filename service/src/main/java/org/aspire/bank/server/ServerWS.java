package org.aspire.bank.server;

import org.aspire.bank.soapws.BankService;

import jakarta.xml.ws.Endpoint;

public class ServerWS {
	public static void main(String[] args) {
		Endpoint.publish("http://0.0.0.0:8080/", new BankService());
		System.out.println("web server started");
	}
}
