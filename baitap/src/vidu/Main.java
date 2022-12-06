package vidu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		ArrayList<Book> booklist = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		Book[] Book = null;
		int option = -1, option1 = -1 , option2 = -1;
		do {
			Tool.showMenu();
			try {
			option = in.nextInt();
			if(option == 3) {
				break;
			}
			} catch(Exception e) {
				System.out.println("Nhập sai định dạng!");
				break;
			}			
			switch (option) {
			case 1:
				do {
					Tool.showBookMenu();	
					try {
					option1 = in.nextInt();
					if( option1 == 5) {
						break;
					}
					} catch (Exception e) {
						System.out.println("Nhập sai định dạng!");
						break;
					}
					switch (option1) {
					case 1:
						Tool.insertBook(booklist);
						break;
					case 2:
						System.out.print("Nhập sách cần được cập nhật(id): ");
						int n;
						n = in.nextInt();
						Tool.updateBook(booklist, n);
						break;
					case 3:
						System.out.print("Nhập sách cần được xóa(id): ");
						int m;
						m = in.nextInt();
						Tool.deleteBook(booklist, m);
						break;
					case 4:
						Tool.displayBook(booklist);
						break;
					default:
						System.out.println("Vui lòng nhập lại!");
						break;
					}
				}while(option1 != 5);
				break;
			case 2:
				do {
					Tool.showToolMenu();
					try {
					option2 = in.nextInt();
					if(option2 == 5) {
						break;
					}
					}catch(Exception e) {
						System.out.println("Nhập sai định dạng!");
					}
					switch (option2) {
					case 1:
						System.out.print("Nhập tên tác giả: ");
						String t,y;
						t = in.nextLine();
						y = in.nextLine();
						Tool.filterByAuthor(booklist, y);
						break;
					case 2:
						System.out.print("Nhập ngôn ngữ sách: ");
						String u,i;
						u = in.nextLine();
						i = in.nextLine();
						Tool.fileterByLanguage(booklist, i);
						break;
					case 3:
						System.out.print("Nhập giá: ");
						String o;
						int p;
						o = in.nextLine();
						p = Integer.parseInt(in.nextLine());
						Tool.filterByPrice(booklist, p);
						break;
					case 4:
						Tool.orderByPriceDesc(booklist, Book);
						break;
					default:
						System.out.println("Vui lòng nhập lại!");
						break;
					}
				}while(option2 != 5);
				break;
			case 3:
				break;
			default:
				System.out.println("Vui lòng nhập lại!");
				break;
			}
		}while(option != 3);
		in.close();
	} 
}
