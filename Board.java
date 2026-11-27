abstract class Board {
    //Board is suppose to be a super class for other multidimantional arrays
    int arrayRows;
    int arrayColumn;
    String[][] boardSize = new String[arrayRows][arrayColumn];

    Board(int arrayRows, int arrayColumn) {
        this.arrayRows = arrayRows;
        this.arrayColumn = arrayColumn;
    }

    abstract void startingBoardState();
}