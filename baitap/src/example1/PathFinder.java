package example1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
public class PathFinder {
    public void ShortestWay(Vert sourceV) {
        sourceV.setDist(0);
        PriorityQueue<Vert> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceV);
        sourceV.setVisited(true);
        while (!priorityQueue.isEmpty()) {
            Vert currentVertex = priorityQueue.poll();
            for (Edge edge : currentVertex.getList()) {
                Vert v = edge.getDestinationVert();
                if (!v.Visited()) {
                    double newDistance = currentVertex.getDist() + edge.getWeight();
                    if (newDistance < v.getDist()) {
                        priorityQueue.remove(v);
                        v.setDist(newDistance);
                        v.setCurrentVert(currentVertex);
                        priorityQueue.add(v);
                    }
                }
            }
            currentVertex.setVisited(true);
        }
    }
    public List<Vert> getShortestWay(Vert destinationVertex) {
        List<Vert> path = new ArrayList<>();
        for (Vert vertex = destinationVertex; vertex != null; vertex = vertex.getCurrentVert()) {
            path.add(vertex);
        }
        Collections.reverse(path);
        return path;
    }
}