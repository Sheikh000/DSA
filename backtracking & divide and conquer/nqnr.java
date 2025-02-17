public class nqnr {
    public static boolean isSafe(char board[][],int row ,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diag left
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diag right
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nqueens(char board[][],int row){
        
        //base case
        if(row==board.length){
          
            printboard(board);
            return;
        }
        //insering queens row vice
        
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
                
                board[row][j]='Q';
                nqueens(board, row+1); //function call
                board[row][j]='X'; //removing the queen when we backtrack
            }
         }
        
         
    }
    public static void printboard(char board[][]){
        System.out.println("-------chessboard---------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");

            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='X';

            }
        }
        nqueens(board,0);//board,row
    }
}
