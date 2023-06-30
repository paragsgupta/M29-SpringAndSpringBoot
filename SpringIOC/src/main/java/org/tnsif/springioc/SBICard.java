package org.tnsif.springioc;

public class SBICard implements DebitCard{

	public void deposite() {
		System.out.println("SBI-depositing an amount of 1 Lakh rupee");
		
	}

	public void withdraw() {
		System.out.println("SBI-withdrwing an amount of 20 thousand rupee");
		
	}

}
