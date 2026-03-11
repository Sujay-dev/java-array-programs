package Arrays;

import java.util.Scanner;

public class Cricket_score_tracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of overs");
      int overs=sc.nextInt();
      System.out.println("Enter runs scored in each over");
      int score[] = new int[overs];
      for(int i=0; i<overs; i++) {
          score[i]=sc.nextInt();
      }
      int total_runs=0;
      int max=Integer.MIN_VALUE;
      for(int i=0; i<score.length; i++){
          total_runs+=score[i];
      }
      System.out.println("--------Match Summary---------");
      System.out.println();
      System.out.println("Total runs scored : "+ total_runs);

      for(int i=0; i<score.length; i++){
          if (score[i]>max) {
             max=score[i];
          }
      }
      System.out.println("Highest runs scored in a single over : "+ max);
      for(int i=0; i<score.length; i++){
          if (score[i]==max) {
               System.out.println("The over with the highest runs : "+ (i+1));
          }
      }
      double run_rate=(double)total_runs/overs;
      System.out.println("Current run rate (runs per over) : "+ run_rate);

      int balls=overs*6;

      double strike_rate=((double)total_runs/balls)*100;
      System.out.println("Team strike rate (runs per 100 balls) : "+ strike_rate);



     sc.close();
}
}


