abstract class Board {
    //Board is suppose to be a super class for other multidimantional arrays
    int arrayHight;
    int arrayLenght;
    String[][] boardSize = new String[arrayHight][arrayLenght];

    Board(int arrayHight, int arrayLenght) {
        this.arrayHight = arrayHight;
        this.arrayLenght = arrayLenght;
    }

    abstract void acceptedBoardSymbols();
}