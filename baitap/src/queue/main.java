package queue;
import java.util.LinkedList;
import java.util.Queue;
 
public class main {
    public static void main(String[] args)
    {
        Queue<String> linkPhim = new LinkedList<String>();
 
        linkPhim.add("PhimMoi");
        linkPhim.add("Netflix");
        linkPhim.add("MePhim");
        linkPhim.add("ZingTV");
        
        System.out.println("Cac kenh phim" + linkPhim);
        
        String deleteLink = linkPhim.remove();
        System.out.println("removed kenh phim - " + deleteLink);
        System.out.println("So kenh phim con lai " + linkPhim);
        String head = linkPhim.peek();
        System.out.println("Kenh phim dau tien" + head);
        int size = linkPhim.size();
        System.out.println("So kenh phim con lai " + size);
    }
}
