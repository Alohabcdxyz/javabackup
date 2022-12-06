package example1;
import java.util.ArrayList;
import java.util.List;
public class Vert implements Comparable<Vert> {
    private boolean visited;
    private String vert;
    private List<Edge> List;
    private double dist = Double.MAX_VALUE;
    private Vert currentVert;
    public Vert(String vert) {
        this.vert = vert;
        this.List = new ArrayList<>();
    }
    public List<Edge> getList() {
        return List;
    }
    public String getVert() {
        return vert;
    }
    public void setVert(String vert) {
        this.vert = vert;
    }
    public void setList(List<Edge> List) {
        this.List = List;
    }
    public void addNextWay(Edge edge) {
        this.List.add(edge);
    }
    public boolean Visited() {
        return visited;
    }
    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    public Vert getCurrentVert() {
        return currentVert;
    }
    public void setCurrentVert(Vert currentVert) {
        this.currentVert = currentVert;
    }
    public double getDist() {
        return dist;
    }
    public void setDist(double dist) {
        this.dist = dist;
    }
    @Override
    public String toString() {
        return this.vert;
    }
    @Override
    public int compareTo(Vert otherV) {
        return Double.compare(this.dist, otherV.getDist());
    }
}
 