package org.aspire.bank.entities;


import java.sql.Date;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
	private int code;
	private double solde;
	private Date dateCreation;
}
