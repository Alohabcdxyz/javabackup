package list;

	public class lien_ket_doi {
	     Node head;
	     Node tail;
	     lien_ket_doi(){
	         head = tail = null;
	     }

	    lien_ket_doi(Node node){
	         Add(node);
	     }
	     
	    public void Add(Node node) {
	        if (head == null) {
	           head = tail = node;     
	        }else {
	          tail.next = node;
	          node.prev = tail;
	          tail = node;
	       } 
	    }
	    
	    public Node Find(int Data) {
	         Node now = head;
	         while (now != null) {
	             if (now.Data == Data) return now;
	             now = now.next;
	         };
	         return null;
	    }

	    public Node Find(Node node) {
	         return this.Find(node.Data);
	    }

	     public void AddFirst(Node node) {
	         node.next = head;
	         head.prev = node;
	         head = node;
	     }

	     public void AddFirst(int Data) {
	         Node node = new Node(Data);
	         this.AddFirst(node);
	     }

	    public void Deletek(Node k) {
	         if (head == null) {
	             System.out.println("Danh sách rỗng.");
	             return;
	         };
	         if (head.Data == k.Data) {
	             this.DeleteFirst();
	             return;
	         }
	         Node nodek = this.Find(k);
	         if (nodek == null) {
	             System.out.println("Không tìm thấy khoá k");
	             return;
	         }
	        if (nodek.next == null) {
	            this.DeleteAfter();
	            return;
	        }
	        nodek.prev.next = nodek.next;
	        nodek.next.prev = nodek.prev;   
	   }

	   public void DeleteFirst() {
	         if (head == null) return;
	         head = head.next;
	         if (head == null) tail = null;
	     }
	    
	    public void DeleteAfter() {
	         if (head == null) return;
	         if (head.next == null) {
	             this.DeleteFirst();
	             return;
	         }
	         tail.prev.next = null;
	         tail = tail.prev; 
	   }
	 
	public void Delete() {
	         head = tail = null;
	     }
	  public void Add(int Data) {
	      Node node = new Node(Data);
	      this.Add(node); 
	   } 
	  
	  public void Print() {
	       if (head == null) { 
	        System.out.println("Danh sách liên kết rỗng, không thể in");
	         return;
	        }
	       System.out.println("Danh sách liên kết : ");
	       Node now = head;
	       while (now != null) {
	         now.Print();
	         now = now.next;
	        }
	  }
	}

	class Node{
	     int Data = 0;
	     Node next = null;
	     Node prev = null;
	     Node(){ 
	     } 
	     Node(int Data){
	        this.Data = Data;
	      }
	    
	     public void Print() {
	       System.out.println("\t- Data : " + this.Data); 
	     }
	 }
