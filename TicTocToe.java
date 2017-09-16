/* 
 * [TicTocToe.java]
 * Ali Meshkat 
 * tic toc toe 
 * Feb 21, 2017
 */
import java.util.Scanner;
class TicTocToe{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in); 
    
    int again = 1; 
    while (again == 1){
      int[][] grid = {
        {0,0,0},
        {0,0,0},
        {0,0,0}
      };
      int play = 0 ;
      int turn = 1;
      int play2;
      int ho = 0;
      int hx = 0;
      boolean win1 = false;
      boolean win2 = false;
      boolean notWon = true;
      
      for (int i = 0; i <= 2; i ++){
        for (int j = 0; j <= 2; j++){
          System.out.print(xo(grid[i][j]));
          if (j != 2){
            System.out.print(" | ");
          }else{
            System.out.println("");
          }
        }
        if (i != 2){
          System.out.println("----------");
        }
      }
      
      
      
      do{ 
        
        System.out.print("Player " + turn + "'s turn!");
        play = input.nextInt();
        
        
        //puts value into the grid array and adds to sum 
        if (play % 3 != 0 ){
          grid [(play/3)][(play%3)-1] = 1;
        }else{
          grid [(play/3)-1][2] = 1;
        }
        
        
        
        //draws game grid
        for (int i = 0; i <= 2; i ++){
          for (int j = 0; j <= 2; j++){
            System.out.print(xo(grid[i][j]));
            if (j != 2){
              System.out.print(" | ");
            }else{
              System.out.println("");
            }
          }
          if (i != 2){
            System.out.println("----------");
          }
        }
        
        
        ///checks for winner 
        for (int i = 0 ; i<= 2;i++){
          if(notWon){
            for (int j = 0 ; j<=2 ; j++){
              if (grid[i][j] == 1){
                ho += 1;
              }else if (grid[i][j] == 2){
                hx += 1;
              }
            }
          }
          if (ho == 3){
            win1 = true;
            notWon = false;
          }else if(hx == 3){
            win2 = true;
            notWon = false;
          }
          hx = 0;
          ho = hx;
        }
        if (notWon){
          for (int i = 0 ; i<= 2;i++){
            if(notWon){
              for (int j = 0 ; j<=2 ; j++){
                if (grid[j][i] == 1){
                  ho += 1;
                }else if (grid[j][i] == 2){
                  hx += 1;
                }
              }
            }
            if (ho == 3){
              win1 = true;
              notWon = false;
            }else if(hx == 3){
              win2 = true;
              notWon = false;
            }
            hx = 0;
            ho = hx;
          }
        }
        if (notWon){
          if ((grid[0][0] == 1 && grid[1][1] == 1 && grid[2][2] == 1) || (grid[0][2] == 1 && grid[1][1] == 1 && grid[2][0] == 1)){
            win1 = true;
            notWon = false;
          }else if ((grid[0][0] == 2 && grid[1][1] == 2 && grid[2][2] == 2) || (grid[0][2] == 2 && grid[1][1] == 2 && grid[2][0] == 2)){
            win2 = true;
            notWon = false;
          }
        }
        
        
        int check = 0;
        //checks for a tie 
        for (int i = 0; i <= 2; i ++){
          for (int j = 0; j <= 2; j++){
            if (grid [i][j] != 0){
              check += 1;
            }
          }
        }
        if (check == 9){
          win1 = true;
          win2 = true;
          notWon = false;
        }
        
        //p2's turn 
        if(notWon){
          System.out.print("Player 2"  + "'s turn!");
          play2 = input.nextInt();
          
          if (play2 % 3 != 0 ){
            grid [(play2/3)][(play2%3)-1] = 2;
          }else{
            grid [(play2/3)-1][2] = 2;
          }
          
          //draws grid after p2's turn 
          for (int i = 0; i <= 2; i ++){
            for (int j = 0; j <= 2; j++){
              System.out.print(xo(grid[i][j]));
              if (j != 2){
                System.out.print(" | ");
              }else{
                System.out.println("");
              }
            }
            if (i != 2){
              System.out.println("----------");
            }
          }
          
          // checking for winner
          for (int i = 0 ; i<= 2;i++){
            if(notWon){
              for (int j = 0 ; j<=2 ; j++){
                if (grid[i][j] == 1){
                  ho += 1;
                }else if (grid[i][j] == 2){
                  hx += 1;
                }
              }
            }
            if (ho == 3){
              win1 = true;
              notWon = false;
            }else if(hx == 3){
              win2 = true;
              notWon = false;
            }
            hx = 0;
            ho = hx;
          }
          if (notWon){
            for (int i = 0 ; i<= 2;i++){
              if(notWon){
                for (int j = 0 ; j<=2 ; j++){
                  if (grid[j][i] == 1){
                    ho += 1;
                  }else if (grid[j][i] == 2){
                    hx += 1;
                  }
                }
              }
              if (ho == 3){
                win1 = true;
                notWon = false;
              }else if(hx == 3){
                win2 = true;
                notWon = false;
              }
              hx = 0;
              ho = hx;
            }
            if (notWon){
              if ((grid[0][0] == 1 && grid[1][1] == 1 && grid[2][2] == 1) || (grid[0][2] == 1 && grid[1][1] == 1 && grid[2][0] == 1)){
                win1 = true;
                notWon = false;
              }else if ((grid[0][0] == 2 && grid[1][1] == 2 && grid[2][2] == 2) || (grid[0][2] == 2 && grid[1][1] == 2 && grid[2][0] == 2)){
                win2 = true;
                notWon = false;
              }
            }
            
          }
        }
        
        
      }while(!win1 && !win2);
      
      if (win1 && win2){
        System.out.print("It's a tie!!!!!!!!!!!!");
      }else if (win1){
        System.out.println("Player 1 wins!!!");
      }else{
        System.out.println("Player 2 wins!!!!!");
      }
      
      
      System.out.println("1.Again            2.Quit");
      again = input.nextInt();
    }
  }
  
  
  
  public static String xo(int play){
    if (play ==1){
      return "O";
    }else if(play ==2){
      return "X";
    }else {
      return " ";
    } 
  }
}