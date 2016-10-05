
public class MineSweeperLogic extends MyPanel {
// New Class
	
	public static int squareProperty(int gridX, int gridY){
		int squareCounter = 0;
		for(int i=gridX-1;i<=gridX+1;i++){
			for(int j=gridY-1;j<=gridY+1;j++){
				if(i==gridX && j==gridY){
//Trying to delete this is a goal, nothing happens in this square
				}
				else{
					if( booleanArray[i][j]==true){//This logic works perfect
						squareCounter++;
					}
				}
			}
		}
		return squareCounter;
	}
}
