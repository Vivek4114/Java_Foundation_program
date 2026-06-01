/*  6. Game Score vs. Player Lives
In a game:
Score should reset to 0 every time a new game starts.
High score should remain across multiple games.
Which variable(s) should be local and which should be static?

 */
 
 class GameScore{
	 
	 static int HighScore = 0;
	 
	 public static void main(String [] args){
		 GameRestart();
		 GameRestart();
		 
	 }
	 
	 public static void GameRestart(){
		 int score =0;
		 score += 10;
		 score +=20;
		 
		 
		  System.out.println("Score is " + score);
		  
		 System.out.println();
		 
		 if(score > HighScore){
			 HighScore=score;
			 System.out.println("Higher Score is : " + HighScore);
		 }
		  
		  System.out.println();
		
		 
		   
		 		 
	 }
 }
		 