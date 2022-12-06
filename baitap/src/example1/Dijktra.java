package example1;
	public class Dijktra {
	    public static void main(String[] args) {
	        //Test Case 1: Distance from Vertex 3 to Vertex 6 
	    	PathFinder shortestPath1 = new PathFinder();
	        Vert v3tc1 = new Vert("3");
	        Vert v6tc1 = new Vert("6");
	        v3tc1.addNextWay(new Edge(8, v3tc1, v6tc1));
	        shortestPath1.ShortestWay(v3tc1);
	        System.out.println("Distance from 3 -> 6 is " + v6tc1.getDist());
	        
	        System.out.println(" ");
	        //Test Case 2: Distance from 0 to Another Vertex 
	    	Vert v0 = new Vert("0");
	        Vert v1 = new Vert("1");
	        Vert v2 = new Vert("2");
	        Vert v3 = new Vert("3");
	        Vert v4 = new Vert("4");
	        Vert v5 = new Vert("5");
	        Vert v6 = new Vert("6");
	        Vert v7 = new Vert("7");
	        Vert v8 = new Vert("8");
	        v0.addNextWay(new Edge(3, v0, v2));
	        v0.addNextWay(new Edge(5, v0, v1));
	        v1.addNextWay(new Edge(4, v1, v3));
	        v1.addNextWay(new Edge(2, v1, v4));
	        v1.addNextWay(new Edge(6, v1, v5));
	        v2.addNextWay(new Edge(5, v2, v4));
	        v2.addNextWay(new Edge(7, v2, v5));
	        v3.addNextWay(new Edge(8, v3, v6));
	        v4.addNextWay(new Edge(4, v4, v5));
	        v4.addNextWay(new Edge(7, v4, v6));
	        v4.addNextWay(new Edge(6, v4, v7));
	        v4.addNextWay(new Edge(12, v4, v8));
	        v5.addNextWay(new Edge(5, v5, v7));
	        v6.addNextWay(new Edge(8, v6, v7));
	        v4.addNextWay(new Edge(8, v6, v8));
	        v7.addNextWay(new Edge(7, v7, v8));
	        
	        PathFinder shortestPath = new PathFinder();
	        shortestPath.ShortestWay(v0);
	        System.out.println("Shortest way from:");
	        System.out.println("0 -> 1: " + v1.getDist());
	        System.out.println("0 -> 2: " + v2.getDist());
	        System.out.println("0 -> 3: " + v3.getDist());
	        System.out.println("0 -> 4: " + v4.getDist());
	        System.out.println("0 -> 5: " + v5.getDist());
	        System.out.println("0 -> 6: " + v6.getDist());
	        System.out.println("0 -> 7: " + v7.getDist());
	        System.out.println("0 -> 8: " + v8.getDist());
	        
	        System.out.println(" ");
	        //Test Case 3: Shortest way from 0 to another vertex
	        System.out.println("Shortest way from:");
	        System.out.println("0 -> 1: " + shortestPath.getShortestWay(v1));
	        System.out.println("0 -> 2: " + shortestPath.getShortestWay(v2));
	        System.out.println("0 -> 3: " + shortestPath.getShortestWay(v3));
	        System.out.println("0 -> 4: " + shortestPath.getShortestWay(v4));
	        System.out.println("0 -> 5: " + shortestPath.getShortestWay(v5));
	        System.out.println("0 -> 6: " + shortestPath.getShortestWay(v6));
	        System.out.println("0 -> 7: " + shortestPath.getShortestWay(v7));
	        System.out.println("0 -> 8: " + shortestPath.getShortestWay(v8));
	    }
	}