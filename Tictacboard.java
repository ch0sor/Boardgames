public class Tictacboard extends Board{
    Tictacboard() {
        super(3,3);
    }

    @Override 
    void startingBoardState() {
        for(int i = 0; i < arrayRows; i++) {
            for(int j = 0; j < arrayColumn; j++) {
                boardSize[i][j] = " ";
            }
        }
        
    }
}
