package com.kaleshsingh;

public class Main {
	
	public static void main(String[] args) {
		
		ITelephone kaleshsPhone;
		kaleshsPhone = new DeskPhone(123456);
		kaleshsPhone.powerOn();
		kaleshsPhone.callPhone(123456);
		kaleshsPhone.answer();

		kaleshsPhone = new MobilePhone(2334578);
		kaleshsPhone.powerOn();
		kaleshsPhone.callPhone(2334578);
		kaleshsPhone.answer();
	}
}
