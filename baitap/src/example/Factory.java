package example;

public class Factory {
	private Factory() {	
	}
	public static final ThuongHieu getNote(LoaiThuongHieu slogan) {
		switch (slogan) {
		case KFC:
			return new KFC();
		case Lotteria:
			return new Lotteria();
		default:
			throw new IllegalArgumentException("Thương hiệu này không được hỗ trợ");
		}
	}
}
