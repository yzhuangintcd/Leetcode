
public class findCenterSolution {
        public int findCenter(int[][] edges) {
        
        int firstNode = edges[0][0];
        int secondNode = edges[0][1];
        int thirdNode = edges[1][0];
        int fourthNode  = edges[1][1];

        // you are guranteed 3 nodes 
        // and since there is a definite answer 
        // there must be a repeated node above
        // since first Node != second Node

        if (firstNode == thirdNode || firstNode == fourthNode){
            return firstNode;
        }
        else if (secondNode == thirdNode || secondNode == fourthNode){
            return secondNode;
        }
        return 0;
    }
}
