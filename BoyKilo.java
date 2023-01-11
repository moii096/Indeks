package Indeks;

import java.util.Scanner;

public class BoyKilo {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in );
		double boy , kg ;
		
		
		System.out.print("Lutfen boyunuzu giriniz  :");
		boy=scan.nextDouble();
		
		System.out.print("Lutfen kilonuzu giriniz  :");
        kg=scan.nextDouble();
        
        double indeks = kg / (boy*boy) ;
        
        System.out.println("Vucut kitle indeksiniz   :"   + indeks );
	}

}
