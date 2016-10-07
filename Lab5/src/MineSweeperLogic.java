
public class MineSweeperLogic extends MyPanel {   //extends MyPanel = Inherits from MyPanel
	// New Class

	public static int squareProperty(int gridX, int gridY){

		int squareCounter = 0;

//		if(gridX == 0 || gridY == 0){
//			//Do Nothing
//			System.out.println("You touched a side");
//		}
//		else{
		for(int i=gridX-1;i<=gridX+1;i++){
			for(int j=gridY-1;j<=gridY+1;j++){
				//				if(i==gridX && j==gridY){
				//					//Trying to delete this is a goal, nothing happens in this square
				//				}
				//				else{
				//					if( booleanArray[i][j]==true){//This logic works perfect. Remember that Professor doesn't want this: booleanArray[i][j]==true
				//						squareCounter++;
				//					}
				//				}

				if(i == -1 || i == -1){
					//Do Nothing
					System.out.println("it worked");
				}
				else{
				if(i==gridX && j==gridY){
					//Trying to delete this is a goal, nothing happens in this square. Can stay like that. Don't want to check that square.
				}
				else if(booleanArray[i][j]){//This logic works perfect
					squareCounter++;
				}
				}


			}
		}
//		}
		return squareCounter;
	}
	
}
	

