public class Tictacboard extends Board{

    Tictacboard() {
        super(3,3);
    }

    // Method to initialize the Tic Tac Toe board with empty spaces
    @Override 
    void startingBoardState() {
        for(int i = 0; i < arrayRows; i++) {
            for(int j = 0; j < arrayColumn; j++) {
                boardSize[i][j] = " ";
            }
        }
        
    }
}
