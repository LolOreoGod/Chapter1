package ChapterSeven_Three;


/**************************************************
 * 
 * Author: Mengting Chang
 * Last Modified: 1/4/21
 * 
 * Contents: Chapter 7 Hw 4, E7.16
 * 
 * Function: Computes the avg of the neighbors of a table element in the eight directions shown in Figure 15
 * Methods:
 * 	set: Sets element space within array to an integer
 * 	neighAvg: Scans array elements around the selected element space, adds them up, and finds the average
 * 	sum: Returns sum of row or column depending on boolean value
 * 
 * 
 *************************************************/

public class Table2 {

		private int[][] values;
		private int rows = 0;
		private int columns = 0;
		//OFFSETS FOR: Left, Bottom, Right, Top, TopLeft, Bottom Left, Bottom Right, Top Right neighbors 
		private int offseti[] = {0, 1, 0, -1, -1, 1, 1, -1};
		private int offsetj[] = {-1, 0, 1, 0, -1, -1, 1, 1};
		
		
		//Creates an array with specified rows and columns
		public Table2(int rows, int columns) {
			this.rows = rows - 1;
			this.columns = columns - 1;
			values = new int[rows][columns];
			
		}
		
		/**
		Sets a value in the table.
		@param i the row of the item to modify
		@param j the column of the item to modify
		@param n the number to use for the new value.
		*/
		
		
		public void set(int i, int j, int n) {
			
			values[i][j] = n;
		}
		
		
		
		/*
		 * Searches for neighbors around the specified element location
		 */
		public double neighAvg(int row, int column) {
			double sum = 0;
			double count = 0;
			//Iterates through offsets for adjacent values: top, bottom, right, left, topleft, bottom left, bottom right, top right
			for(int i  = 0; i < this.offseti.length; i++) {
				int nrow = row + offseti[i];
				int ncol = column + offsetj[i];
				
				//checks if the specified element location is on the edge/corner
				if(nrow < 0 || nrow > this.rows || ncol < 0 || ncol > this.columns) {
					
					continue;
				}
				
				//applies the offsets and adds the new elements (neighbors) to sum
				sum += values[nrow][ncol];
				//Increase number of neighbors recorded
				count++;
			}
			
			/*
			 @returns average
			 */
			return sum / count;

		}
		
		
		/*
		 * @returns sum of row or column
		 */
		public double sum(int i, boolean horizontal) {
			double sum = 0;
			//Returns sum of row if horizontal is true
			if(horizontal) {
				//Scans for left and right of element, if any
				for(int j = 0; j < this.columns + 1; j++) {
					if(j < 0 || j > this.rows) {
						continue;
					}
					
					sum += values[i][j];
				}
				
			}
			//Returns sum of column is horizontal is not true
			else {
				//Scans for up and down of element, if any
				for(int j = 0; j < this.rows + 1; j++) {
					if(j < 0 || j > this.columns) {
						continue;
					}
					
					sum += values[j][i];
					
				}
				
			}
			
			return sum;
		}
}


class TableTester2 {
	
	public static void main(String[] args) {
		
		Table2 myTable = new Table2(3, 3);
		/*inputs values into table as such:
		 * 
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * 
		 */
		myTable.set(0, 0, 1);
		myTable.set(0, 1, 2);
		myTable.set(0, 2, 3);
		myTable.set(1, 0, 4);
		myTable.set(1, 1, 5);
		myTable.set(1, 2, 6);
		myTable.set(2, 0, 7);
		myTable.set(2, 1, 8);
		myTable.set(2, 2, 9);

		// AT POSITION 1,1 OF ARRAY, THE NUMBER IS 5. THE NEIGHBORS => 1+2+3+4+6+7+8+9 = 40. THE AVG => 40/8 = 5
		System.out.println("Avg of neighbors for location (1,1): " + myTable.neighAvg(1, 1));
		
		
		//AT POSITION 0,0 OF ARRAY, THE NUMBER IS 1. THE NEIGHBORS => 2+4+5 = 11. THE AVG => 11/3 = 3.666
		System.out.println("Avg of neighbors for location (0,0): " + myTable.neighAvg(0, 0));
		
		
		//AT POSITION 0,1 OF ARRAY, THE NUMBER IS 2. THE NEIGHBORS => 1+3+4+5+6 = 19. THE AVG => 19/5 = 3.8
		System.out.println("Avg of neighbors for location (0,1): " + myTable.neighAvg(0, 1));
		
		
		//AT ROW 2 OF ARRAY, 7+8+9 = 24
		System.out.println("SUM OF ELEMENTS IN ROW 2: " + myTable.sum(2, true));
		
		//AT COLUMN 2 OF ARRAY, 3+6+9 = 18
		System.out.println("SUM OF ELEMENTS IN COLUMN 2: " + myTable.sum(2, false));
		
		//AT ROW 1 OF ARRAY, 4+5+6 = 15
		System.out.println("SUM OF ELEMENTS IN ROW 1: " + myTable.sum(1, true));
		
	}
	
}