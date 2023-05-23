package Array;

public class nestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array = {
				{95, 86} ,
				{83, 92, 96} ,
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0; i < 3; i++) {
			if( i == 0) {
				for(int j = 0; j < 2; j++) {
					sum += array[i][j];
				}
			} else if( i == 1) {
				for(int j = 0; j < 3; j++) {
					sum += array[i][j];
				}
			} else if( i == 2) {
				for(int j = 0; j < 5; j++) {
					sum += array[i][j];
				}
			}
		}
		
		avg = (double)sum / 10;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);

	}

}
