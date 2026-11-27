abstract class Board {
    // Rows and columns of the board
    int arrayRows;
    int arrayColumn;

    // 2D / Multi-dimensional array to represent the board
    String[][] boardSize = new String[arrayRows][arrayColumn];

    Board(int arrayRows, int arrayColumn) {
        this.arrayRows = arrayRows;
        this.arrayColumn = arrayColumn;
    }

    // Abstract method to be implemented by subclasses for initializing the board state
    abstract void startingBoardState();
}