package vidu;
import java.util.ArrayList;

public class Tool {
			public static void showMenu() {
				System.out.println("Menu");
				System.out.println("1. Books");
				System.out.println("2. Tools");
				System.out.println("3. ThoĂ¡t");
				System.out.print("Nháº­p lá»±a chá»�n: ");
			}
			
			public static void showBookMenu() {
				System.out.println("SĂ¡ch");
				System.out.println("1. ChĂ¨n sĂ¡ch");
				System.out.println("2. Cáº­p nháº­t sĂ¡ch");
				System.out.println("3. XĂ³a sĂ¡ch");
				System.out.println("4. Hiá»ƒn thá»‹ toĂ n bá»™ sĂ¡ch");
				System.out.println("5. ThoĂ¡t");
				System.out.print("Nháº­p lá»±a chá»�n: ");
			}
			
			public static void showToolMenu() {
				System.out.println("CĂ´ng cá»¥");
				System.out.println("1. Lá»�c theo tĂ¡c giáº£");
				System.out.println("2. Lá»�c theo ngĂ´n ngá»¯");
				System.out.println("3. Lá»�c theo giĂ¡");
				System.out.println("4. Sáº¯p xáº¿p theo giĂ¡ giáº£m dáº§n");
				System.out.println("5. ThoĂ¡t");
				System.out.print("Nháº­p lá»±a chá»�n: ");
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
					System.out.println("KhĂ´ng tĂ¬m tháº¥y ID sĂ¡ch!");
				}
			}			
	} 		
		public static void deleteBook(ArrayList<Book> booklist, int x) {
			for(int i=0; i<booklist.size(); i++) {
				if(booklist.get(i).getId() == x ) {  
					booklist.remove(booklist.get(i));
					break;
				}else {
					System.out.println("KhĂ´ng tĂ¬m tháº¥y ID sĂ¡ch!");
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
					System.out.println("khĂ´ng tĂ¬m tháº¥y tĂ¡c giáº£");
				}
			}
		}
		public static void fileterByLanguage(ArrayList<Book> booklist, String x) {
			for(int i=0; i<booklist.size(); i++) {
				if(booklist.get(i).getLanguage().equalsIgnoreCase(x)) {
					System.out.println(booklist.get(i).thongTinChiTiet());
				}else  if(booklist.get(i).getLanguage() != x){
					System.out.println("khĂ´ng tĂ¬m tháº¥y ngĂ´n ngá»¯");
				}
			}
		}
		public static void filterByPrice(ArrayList<Book> booklist, int x) {
			for(int i=0; i<booklist.size(); i++) {
				if(booklist.get(i).getPrice() == x) {
					System.out.println(booklist.get(i).thongTinChiTiet());
			}else if(booklist.get(i).getPrice() != x){
				System.out.println("KhĂ´ng tĂ¬m tháº¥y giĂ¡ tiá»�n");
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
				System.out.println("Danh sĂ¡ch");
				Book[i].thongTinChiTiet();
			}
		}		
}
		
	

