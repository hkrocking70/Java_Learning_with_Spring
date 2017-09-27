package com.lowes.process;

public class Discount {
	
	float amountToPay(int salesAmt,float DisPer){
		
		return salesAmt - (salesAmt * DisPer/100);
	}
	
	public static void main(String[] args){
		
		 Discount dis = new Discount();
		 float k = dis.amountToPay(100,5);
		 System.out.println(k);
	}
}
