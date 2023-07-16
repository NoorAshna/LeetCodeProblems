// link to the problem is https://leetcode.com/problems/valid-sudoku/
// we use hashset to add the entries of the board and check for duplicate.
// the add method of the hashset return false if the entry is already present in the set.
// the time complexity is low that is O(9^2)
import java.util.HashSet;

public class Valid_soduku {
	  public static boolean isValidSudoku(char[][] board) {
	        HashSet<String> seen = new HashSet();
	        for(int i=0; i<9 ; i++){
	            for(int j=0 ; j<9 ; j++){
	                char val  = board[i][j];
	                if(val != '.'){
	                   if(!seen.add(val + "row" + i)|| 
	                       !seen.add(val + "col" + j)||
	                       !seen.add(val + "box" + i/3 + "." + j/3))
	                       return false;
	                }
	            
	            }
	        }
	        return true;
	    }
	public static void main(String[] args) {
		char [][] board = {{'5','3','.','1','2','4','6','8','.'}
				          ,{'.','2','.','.','.','.','.','3','.'}
						  ,{'1','.','.','.','3','5','.','.','.'}
						  ,{'.','.','.','.','.','.','4','.','1'}
						  ,{'7','.','1','2','.','3','.','6','.'}
						  ,{'.','.','2','.','.','1','3','.','8'}
						  ,{'9','.','5','6','.','.','.','7','.'}
						  ,{'4','8','.','.','1','9','.','5','.'}
						  ,{'2','.','.','.','.','.','1','4','9'}};
       boolean res = isValidSudoku(board);
       System.out.println(res);
	}

}
