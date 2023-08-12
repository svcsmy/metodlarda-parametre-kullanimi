import java.util.Scanner;

public class main {
	
	public static void toplama(int a, int b, int c) {
		System.out.println("Toplamlari: " +( a + b + c));
	}
	
	
	public static void selamlama(String isim) {
		System.out.println("selamlar" + isim);
	}
    
	public static void main(String[] args) {
	
	selamlama(" ruby");
	selamlama(" kali"); //kedilerimin  ismi :)
	
	toplama(3,4,5);
    toplama(10,12,20);
	}

}
