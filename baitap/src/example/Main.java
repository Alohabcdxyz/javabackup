package example;

public class Main {
	 public static void main(String[] args) {
	        ThuongHieu SloganKFC = Factory.getNote(LoaiThuongHieu.KFC);
	        System.out.println(SloganKFC.Slogan());
	        ThuongHieu SloganLotte = Factory.getNote(LoaiThuongHieu.Lotteria);
	        System.out.println(SloganLotte.Slogan());        
}
}
