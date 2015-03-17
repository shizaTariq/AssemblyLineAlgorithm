import static org.junit.Assert.*;

import org.junit.Test;


public class testTwo {

	@Test
	public void test() {
		
		
		int currentTime[] = {10,12};
		int tLeave[] = {18,7};
		int stationTimes[][]={{4,5,3,2},{2,10,1,4}};
		int transTimes[][]={{7,4,5},{9,2,8}};
		int n = 4;
		int cost =AssemblyLine.findPath(currentTime,tLeave,stationTimes,transTimes,n);
		assert(cost==35);
	}

}
