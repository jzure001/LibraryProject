package Raffle;
// created by chris
    interface RaffleInterface {
        // passes user's name and raffle number to the recursiveInsert class
         void put(String s, int raffleNum);

        // checks if user's raffle number is the winner and prints winning or losing statements
        String checkWinner(BSTNode node, int raffleNum, int winner);

        // inserts user into a binary search tree based upon the user's raffle number
         BSTNode recursiveInsert(BSTNode node, String s, int raffleNum);

}
