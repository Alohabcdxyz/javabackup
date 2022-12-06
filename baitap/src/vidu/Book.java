package vidu;

import java.util.Scanner;

public class Book {

	private String name, author, publish_date, language, isbn;
	private int id,price;
	
	
	public Book() {
		
	}
	
	public Book(int id, String name, String author, String publish_date, String language, String isbn, int price) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publish_date = publish_date;
		this.language = language;
		this.isbn = isbn;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(String publish_date) {
		this.publish_date = publish_date;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@SuppressWarnings("resource")
	public void nhapThongTin() {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập ID: ");
		this.id = Integer.parseInt(in.nextLine());
		System.out.print("Nhập tên sách: ");
		this.name = in.nextLine();	
		System.out.print("Nhập tên tác giả: ");
		this.author = in.nextLine();		
		System.out.print("Nhập ngày xuất bản: ");
		this.publish_date = in.nextLine();		
		System.out.print("Nhập ngôn ngữ: ");
		this.language = in.nextLine();		
		System.out.print("Nhập ISBN: ");
		this.isbn = in.nextLine();		
		System.out.print("Nhập giá: ");
		this.price = Integer.parseInt(in.nextLine());
				
	}
	
	public String thongTinChiTiet() {
		return "Sách - " + "id: " + id + ", name: " + name + ", author: " + author + ", publish_date: " + publish_date
				+ ", language: " + language + ", isbn: " + isbn + ", price: " + price;
	}
	
}

