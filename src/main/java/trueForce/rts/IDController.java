package trueForce.rts;

public class IDController {
	private static int nextUnitID = 0;
	
	public static int getNewUnitID() {
		int ret = nextUnitID;
		nextUnitID++;
		return ret;
	}
	
}
