package list;

	import java.util.Scanner;
	 public class DSLK_DOI {
	 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int lc;
	 Node node;
	 int temp, k;
	 lien_ket_doi lk = new lien_ket_doi();
	 do {
	     lc = luachon(scanner);
	     switch (lc) {
	         case 0:
	             break;
	         case 1:
	             System.out.print("Nhập vào số lượng Node : ");
	             int slData = scanner.nextInt();
	             for (int i=0; i < slData; i++) {
	                 System.out.print("- Nhập vào Data : ");
	                 temp = scanner.nextInt();
	                 lk.Add(temp);
	             }
	             break;
	         case 2:
	             lk.Print();
	             break;
	         case 3:
	             System.out.print("Nhập Data khoá k cần tìm : ");
	             temp = scanner.nextInt();
	             node = lk.Find(temp);
	             if (node == null) {
	                 System.out.println("Không tìm thấy Node có chứa khoá " + temp);
	             }else {
	                 System.out.println("Tìm thấy node có chứa khoá " + node.Data);
	             }
	             break;	         
	         case 4:
	             System.out.println("Thêm vào đầu danh sách.");
	             System.out.print("Nhập vào Data : ");
	             temp = scanner.nextInt();
	             lk.AddFirst(temp);
	             break;
	         case 5:
	             System.out.println("Xoá phần tử đầu.");
	             lk.DeleteFirst();
	             break;
	         case 6:
	             System.out.println("Xoá phần tử cuối danh sách.");
	             lk.DeleteAfter();
	             break;
	 }

	 }while(lc !=0);
	 }
	 public static int luachon(Scanner scanner) {
	     System.out.println("--- Danh sách chức năng --- \n");
	     System.out.println("1 : Thêm danh sách liên kết \n");
	     System.out.println("2 : In danh sách liên kết \n");
	     System.out.println("3 : Tìm kiếm k trong danh sách liên kết \n");
	     System.out.println("4 : Thêm Node vào đầu danh sách liên kết \n");
	     System.out.println("5 : Xoá phần tử đầu danh sách \n");
	     System.out.println("6 : Xoá phần tử cuối danh sách \n");

	     System.out.print("Mời nhập lựa chọn : ");
	     int lc = scanner.nextInt();
	     return lc;
	 } 
	 }
