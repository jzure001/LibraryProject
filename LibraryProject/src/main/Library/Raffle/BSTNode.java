package Raffle;
public class BSTNode

{
    String item;
    int raffle;		// The data in the node
    BSTNode left; 	// Left child
    BSTNode right; 	// Right child

    BSTNode(String key, int raffleNum) {
        this.item = key;
        this.raffle = raffleNum;
    }
}