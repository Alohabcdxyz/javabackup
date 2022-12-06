package assignment;

import java.util.ArrayList;

public class Tool {
			public static void showMenu() {
				System.out.println("Menu");
				System.out.println("1. Books");
				System.out.println("2. Tools");
				System.out.println("3. Thoát");
				System.out.print("Nhập lựa chọn: ");
			}
			
			public static void showBookMenu() {
				System.out.println("Sách");
				System.out.println("1. Chèn sách");
				System.out.println("2. Cập nhật sách");
				System.out.println("3. Xóa sách");
				System.out.println("4. Hiển thị toàn bộ sách");
				System.out.println("5. Thoát");
				System.out.print("Nhập lựa chọn: ");
			}
			
			public static void showToolMenu() {
				System.out.println("Công cụ");
				System.out.println("1. Lọc theo tác giả");
				System.out.println("2. Lọc theo ngôn ngữ");
				System.out.println("3. Lọc theo giá");
				System.out.println("4. Sắp xếp theo giá giảm dần");
				System.out.println("5. Thoát");
				System.out.print("Nhập lựa chọn: ");
			}
	
		public static void insertBook(ArrayList<Book> booklist) {
			Book book = new Book();
			book.nhapThongTin();
			booklist.add(book);
		}
		
		public static void updateBook(ArrayList<Book> booklist, int x) {
			for(int i=0; i<booklist.size(); i++) {
				if(booklist.get(i).getId() == x) {
					booklist.remove(booklist.get(i));
					Book book = new Book();
					book.nhapThongTin();
					booklist.add(book);			
				}else {
					System.out.println("Không tìm thấy ID sách!");
				}
			}			
	} 		
		public static void deleteBook(ArrayList<Book> booklist, int x) {
			for(int i=0; i<booklist.size(); i++) {
				if(booklist.get(i).getId() == x ) {  
					booklist.remove(booklist.get(i));
					break;
				}else {
					System.out.println("Không tìm thấy ID sách!");
				}
			}
		}
		
		public static void displayBook(ArrayList<Book> booklist) {
			for(Book book : booklist) {
				System.out.println(book.thongTinChiTiet());
			}
		}	
		public static void filterByAuthor(ArrayList<Book> booklist, String x) {		
			for(int i=0; i<booklist.size(); i++) {
				if(booklist.get(i).getAuthor().equalsIgnoreCase(x)) {
					System.out.println(booklist.get(i).thongTinChiTiet());	
				} else if(booklist.get(i).getAuthor() != x){
					System.out.println("không tìm thấy tác giả");
				}
			}
		}
		public static void fileterByLanguage(ArrayList<Book> booklist, String x) {
			for(int i=0; i<booklist.size(); i++) {
				if(booklist.get(i).getLanguage().equalsIgnoreCase(x)) {
					System.out.println(booklist.get(i).thongTinChiTiet());
				}else  if(booklist.get(i).getLanguage() != x){
					System.out.println("không tìm thấy ngôn ngữ");
				}
			}
		}
		public static void filterByPrice(ArrayList<Book> booklist, int x) {
			for(int i=0; i<booklist.size(); i++) {
				if(booklist.get(i).getPrice() == x) {
					System.out.println(booklist.get(i).thongTinChiTiet());
			}else if(booklist.get(i).getPrice() != x){
				System.out.println("Không tìm thấy giá tiền");
		}
	}
}
		public static void orderByPriceDesc(ArrayList<Book> booklist, Book[] Book) {
			Book temp = Book[0];
			for(int i = 0; i < booklist.size() - 1; i++) {
				for(int j = 0; j < booklist.size(); j++) {
					if(Book[i].getPrice() < Book[j].getPrice()) {
						temp = Book[j];
						Book[j] = Book[i];
						Book[i] = temp;
					}
				}
			}
			for(int i = 0; i < booklist.size(); i++) {
				System.out.println("Danh sách");
				Book[i].thongTinChiTiet();
			}
		}		
}
		
	

