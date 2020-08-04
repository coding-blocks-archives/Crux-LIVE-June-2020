package info.company.Lec30;

public class GraphClient {

    public static void main(String[] args) {

        AdjacencyList list = new AdjacencyList();

        list.addVertex("A");
        list.addVertex("B");
        list.addVertex("C");
        list.addVertex("D");

//        list.addVertex("E");
//        list.addVertex("F");


        list.addEdge("A","B");
        list.addEdge("B","D");
        list.addEdge("A","C");
        list.addEdge("C","D");

//        list.addEdge("E", "F");

        System.out.println(list.isConnected());
//        list.BFT();
        System.out.println(list.connectedComponents());
//        list.DFT();
//        list.display();
    }
}
