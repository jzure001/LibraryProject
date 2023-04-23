package Raffle;
import Raffle.BSTNode;
import java.util.Scanner;
import java.util.Random;
//created by chris
public class Raffle implements RaffleInterface {
    BSTNode root = null;
    int count = 20;
    public BSTNode getRoot() {
        return root;
    }
    public int getCount(){
        return count;
    }
    public BSTNode getRightChild(BSTNode node) {
        return node.right;
    }
    public int getRaffleNumber(BSTNode node){
        return node.raffle;
    }


    public static void main (String[] args) {
        Raffle tree = new Raffle();
        Scanner keyboard = new Scanner(System.in);
        int userRaffleNum;
        int winner = -1;
        String userFirstName;

        // filling tree
        tree.put("Samantha", 1);
        tree.put("Alex", 2);
        tree.put("Benjamin", 3);
        tree.put("Scott", 4);
        tree.put("Trey", 5);
        tree.put("Jeff", 6);
        tree.put("George", 7);
        tree.put("Amanda", 8);
        tree.put("Sarah", 9);
        tree.put("Elizabeth", 10);
        tree.put("Lauren", 11);
        tree.put("Billy", 12);
        tree.put("Paul", 13);
        tree.put("Dan", 14);
        tree.put("Victoria", 15);
        tree.put("Rachel", 16);
        tree.put("Jesus", 17);
        tree.put("Irvin", 18);
        tree.put("Allen", 19);
        tree.put("Oliver", 20);

        System.out.println("Welcome to the Library's monthly raffle!");
        System.out.println("This month's prize is the full set of books from J.R.R. Tolkien's Lord of The Rings Series. This includes:");
        System.out.println("The Hobbit (1937)");
        System.out.println("The Fellowship of the Ring (1954)");
        System.out.println("The Two Towers (1954)");
        System.out.println("The Return of the King (1955)");
        System.out.println("The Silmarillion (1977)");
        System.out.println("");

        System.out.println("To enter, please provide your first name:");
        userFirstName = keyboard.nextLine();
        userRaffleNum = tree.getCount() + 1;
        tree.put(userFirstName, userRaffleNum);
        System.out.println("Thank you, your number is: " + userRaffleNum);

        System.out.println(userFirstName);
        System.out.println(tree.getCount());
        System.out.println(userRaffleNum);

        Random rand = new Random();
        winner = rand.nextInt(tree.getCount() +1);
        System.out.println("Winning number is raffle number: " + winner);
        tree.checkWinner(tree.root, userRaffleNum,winner);
    }


    public void put(String s, int raffleNum) {
        root = recursiveInsert(root, s, raffleNum);
    }

    public String checkWinner(BSTNode node, int raffleNum, int winner) {
        if (node == null){
            return "Error, could not find node.";
        }
        if (node.raffle == raffleNum){
            if (node.raffle == winner){
                return ("Congradulations " + node.item + ", you won! Please contact the front desk to recieve your reward.");
            }
            else {
                return("Sorry, better luck next time! Come back next month for another chance to win.");
            }
        }
        if (node.raffle < raffleNum){
            checkWinner(node.left, raffleNum, winner);
        }
        else if (node.raffle > raffleNum){
            checkWinner(node.right,raffleNum, winner);
        }
        return "";
    }

    public BSTNode recursiveInsert(BSTNode node, String s, int raffleNum) {
        if (node == null){
            count++;
            return new BSTNode(s, raffleNum);
        }
        if (raffleNum < node.raffle){
            node.left = recursiveInsert(node.left, s, raffleNum);
        }
        else if (raffleNum > node.raffle){
            node.right = recursiveInsert(node.right, s, raffleNum);
        }
        return node;
    }
}