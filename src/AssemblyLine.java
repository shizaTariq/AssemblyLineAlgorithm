
public class AssemblyLine {

	
	
	

	public static int findPath(int currentTime[],int tLeave[], int timeStation[][], int transferTime[][], int totalStations) {

		//number of assembly lines i.e. = 2
		int numofLines = currentTime.length;
		if(numofLines != 2){
			System.err.println("Only two assembly line supported");
			return -1;
		}
		//Cost function array
		int f[][] = new int[numofLines][totalStations];
		//Station index back track array
		int i[][] = new int[numofLines][totalStations];
		
		//Final Cost and Final Station
		int finalCost = 0;
		int lastStation = 0;
		
		//Time for first station
		f[0][0] = currentTime[0]+timeStation[0][0];
		f[1][0] = currentTime[1]+timeStation[1][0];
		
		
		for (int j = 1; j < totalStations; j++) {
			
			
			if((f[0][j-1] + timeStation[0][j]) <= (f[1][j-1]+ transferTime[1][j-1]+timeStation[0][j])){
				f[0][j]= f[0][j-1]+ timeStation[0][j];
				i[0][j] = 0;
			}
			else{
				f[0][j]= f[1][j-1]+ transferTime[1][j-1]+timeStation[0][j];
				i[0][j]=1;
			}
			
			
			if(f[1][j-1] + timeStation[1][j] <= f[0][j-1]+ transferTime[0][j-1]+timeStation[1][j]){
				f[1][j]= f[1][j-1]+ timeStation[1][j];
				i[1][j] = 1;
			}
			else{
				f[1][j]= f[0][j-1]+ transferTime[0][j-1]+timeStation[1][j];
				i[1][j] = 0;
			}
			
		}
		
		
		if((f[0][totalStations-1]+tLeave[0]) <= (f[1][totalStations-1]+tLeave[1] )){
			finalCost =  f[0][totalStations-1]+tLeave[0];
			lastStation = 0;
		}
		else{
			finalCost = f[1][totalStations-1]+tLeave[1] ;
			lastStation = 1;
		}	
	
		printStation(lastStation,finalCost, i, totalStations);
		return finalCost;
	}

	public static void printStation(int lastStation,int costPath,int stationTrace[][], int n){
		int i = lastStation;
		StringBuilder path =  new StringBuilder();
		path.append("Line "+(i+1)+", station "+n);
		//System.out.println("Line "+(i+1)+", station "+n);
		for (int j = n-1; j > 0; j--) {
	
			i = stationTrace[i][j];
			path.insert(0, "Line "+(i+1)+", station "+(j)+ "\n");
			//System.out.println("Line "+(i+1)+", station "+(j)+ "\n");
			
		}
			System.out.println("Fastes Path Cost: "+ costPath);
			System.out.println("Fastes Path: ");
			System.out.println(path.toString());
	}
}
