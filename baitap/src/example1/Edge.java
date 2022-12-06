package example1;
public class Edge {
	private double weight;
    private Vert startVert;
    private Vert destinationVert;
    public Edge(double weight, Vert startVert, Vert destinationVert) {
        this.weight = weight;
        this.startVert = startVert;
        this.destinationVert = destinationVert;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public Vert getStartVert() {
        return startVert;
    }
    public void setStartVert(Vert startVert) {
        this.startVert = startVert;
    }
    public Vert getDestinationVert() {
        return destinationVert;
    }
    public void setTargetVert(Vert destinationVert) {
        this.destinationVert = destinationVert;
    }
}
