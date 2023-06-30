package org.tnsif.springioc;

public class HDFCCard implements DebitCard{

	public void deposite() {
		System.out.println("HDFC-depositing an amount of 1 Lakh rupee");
		
	}

	public void withdraw() {
		System.out.println("HDFC-withdrwing an amount of 20 thousand rupee");
		
	}

}
