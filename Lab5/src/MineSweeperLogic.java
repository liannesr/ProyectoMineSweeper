
public class MineSweeperLogic extends MyPanel {   //extends MyPanel = Inherits from MyPanel
	// New Class

	public static int squareProperty(int gridX, int gridY){
		//verifica si alrededor de los cuadros del cuadro seleccionado hay bomba.
		//si hay bomba alrededor sube el contador
		//si no hay bomba alrededor devuelve 0.

		int squareCounter = 0;

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

				if(i == -1 || j == -1 || i >= TOTAL_COLUMNS || j >= TOTAL_ROWS){
					//If for is out of the board, Do Nothing
					System.out.println("it worked");
				}
				else if(i==gridX && j==gridY){
					//Trying to delete this is a goal, nothing happens in this square. Can stay like that. Don't want to check that square.
					//If for checks the selected grid, Do Nothing.
				}
				else if(booleanArray[i][j]){
					//This logic works perfect
					squareCounter++;

				}


			}//end for
		}//end for
		return squareCounter;

	}//end method
	


}


