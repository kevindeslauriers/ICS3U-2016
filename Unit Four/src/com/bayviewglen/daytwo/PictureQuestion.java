package com.bayviewglen.daytwo;

public class PictureQuestion {

	public static void main(String[] args) {
		int m, n, p, q;
		
		m = 3;
		n = 4;
		p = 1;
		q = 2;
		
		
		for (int i =1; i <= q; ++i){
			for (int j =1; j <= n + 2*p + 2*q; ++j){
				System.out.print("#");
			}
			System.out.println();
		}
		
		
		for (int i =1; i <= p; ++i){
			for (int j=1;j<=q;j++){
				System.out.print("#");
			}
			for (int j =1; j <= n + 2*p; ++j){
				System.out.print("+");
			}
			for (int j=1;j<=q;j++){
				System.out.print("#");
			}
			System.out.println();
		}
		
		// picture
		for (int i =1; i <= m; ++i){
			for (int j=1;j<=q;j++){
				System.out.print("#");
			}
			for (int j =1; j <= p; ++j){
				System.out.print("+");
			}
			
			for (int j =1; j <= n; ++j){
				System.out.print(".");
			}
			
			for (int j =1; j <= p; ++j){
				System.out.print("+");
			}
			for (int j=1;j<=q;j++){
				System.out.print("#");
			}
			System.out.println();
		}
		
		for (int i =1; i <= p; ++i){
			for (int j=1;j<=q;j++){
				System.out.print("#");
			}
			for (int j =1; j <= n + 2*p; ++j){
				System.out.print("+");
			}
			for (int j=1;j<=q;j++){
				System.out.print("#");
			}
			System.out.println();
		}
		
		
		for (int i =1; i <= q; ++i){
			for (int j =1; j <= n + 2*p + 2*q; ++j){
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
