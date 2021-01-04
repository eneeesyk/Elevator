
public class Driver {

	public static void main(String[] args) {
		Elevator el = new Elevator();

	    el.setFloor();
	    el.setPersonInside();
	    el.personEnters(3);
	    el.goUpFloor(5);
	    el.personLeaves(3);
	    el.personEnters(6);
	    el.goUpFloor(14);
	    el.personLeaves(5);
	    el.personEnters(1);
	    el.goDownFloor(-3);
	    el.emergencyStop();

	}

}
