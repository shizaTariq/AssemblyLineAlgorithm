import static org.junit.Assert.*;

import org.junit.Test;


public class findShortestPathTest {

	@Test
	public void test() {
		int currentTime[] = {2,4};
		int tLeave[] = {3,2};
		int stationTimes[][]={{7,9,3,4,8,4},{8,5,6,4,5,7}};
		int transTimes[][]={{2,3,1,3,4},{2,1,2,2,1}};
		int n = 6;
		int cost = AssemblyLine.findPath(currentTime,tLeave,stationTimes,transTimes,n);
		assert(cost==38);
	}

}
