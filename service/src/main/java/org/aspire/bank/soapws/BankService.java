package org.aspire.bank.soapws;



import java.sql.Date;

import org.aspire.bank.entities.Account;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.NoArgsConstructor;

@WebService(serviceName = "BankService")
@NoArgsConstructor
public class BankService {
	
	@WebMethod(operationName = "convertEuroToDH")
	public double convert(@WebParam(name = "amount") double mt) {
		return 10;
	}
	
	@WebMethod(operationName = "getAccount")
	public Account getAccount(@WebParam(name = "code") int code) {
		return new Account(1,2000,Date.valueOf("2023/06/23"));
	}
}
