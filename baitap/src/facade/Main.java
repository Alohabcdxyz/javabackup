package facade;

public class Main {
	public static void main(String[] args) {
		LamBanhMi banhmi = LamBanhMi.getInstance();
		banhmi.lamBanhMiThapCam();
		banhmi.lamBanhMiTrung();
	}
}
