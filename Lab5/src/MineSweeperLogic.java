
public class MineSweeperLogic extends MyPanel {

	
	public static int squareProperty(int gridX, int gridY){
		int squareCounter = 0;
		for(int i=gridX-1;i<=gridX+1;i++){
			for(int j=gridY-1;j<=gridY+1;j++){
				if(i==gridX && j==gridY){

				}
				else{
					if( booleanArray[i][j]==true){
						squareCounter++;
					}
				}
			}
		}
		return squareCounter;
	}
}
