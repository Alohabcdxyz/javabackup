package time;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Nhap n: ");
    	int n = sc.nextInt();
    	for (int i = 1; i <= n; i++) {
    	    for(int j = 1; j <= n; j++) {
    	        System.out.println("Day la cap so " + i + " va " + j);
    	    }
    	}
    }
}
}