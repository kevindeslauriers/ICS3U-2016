package com.bayviewglen.daythree;

public class CoinDriver {

	public static void main(String[] args) {
		Coin coin1 = new Coin();
		
		
		for (int i=0; i<10; ++i){
			System.out.println(coin1);
			
			coin1.flip();
		}
	}

}
