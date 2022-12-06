package main;

public class Main {
	final static double metToKilomet = 1000;
	public static void main(String[] args) {
		System.out.println("1 met sang km la: " + doiDonVi(1));
		System.out.println("10 met sang km la: " + doiDonVi(10));
		System.out.println("1,5 met sang km la: " + doiDonVi(1.5));
	}
	public static double doiDonVi(double met) {
		return met * metToKilomet;
	}
}
