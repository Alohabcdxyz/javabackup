package iterator;

public class HienThi {
	public static void main(String[] args) {
		DanhSachNguoiChoi listNguoiChoi = new DanhSachNguoiChoi();
        Iterator iterator = listNguoiChoi.getIterator();
        while(iterator.hasNext()) {
            System.out.println("Tên người chơi: " + iterator.next());
        }
    }
}
