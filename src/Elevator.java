
public class Elevator {
	int currentFloor = 0;
    int personInside = 0;
    static int capacity = 5;
    static int maxFloor = 14;
    static int minFloor = -3;
    boolean isDoorOpen = false;

    public int setPersonInside(){
      return personInside;
    }

    public int setFloor(){
      return currentFloor;
    }

    public void goUp(){
      System.out.println("up");
      currentFloor++;
    }

    public void goUpFloor(int floorNumber){
      if (currentFloor == floorNumber) {
        System.out.println("You are already floor number: " + currentFloor);
      }else if (floorNumber > maxFloor){
        System.out.println("You cant go up from here! max is "+ maxFloor);
      }
      else{
        System.out.println("The Elevator going UP");
        while (currentFloor != floorNumber) {
            goUp();
        }
        System.out.println("Welcome to floor number " + currentFloor);
      }
}


    public void goDown(){
      System.out.println("down");
      currentFloor--;
    }


    public void goDownFloor(int floorNumber){
      if (currentFloor == floorNumber) {
        System.out.println("You are already floor number: " + currentFloor);
      }else if (floorNumber < minFloor){
        System.out.println("You cant go up from here! min is "+ minFloor);
      }
      else{
        System.out.println("The Elevator going DOWN!");
        while (currentFloor != floorNumber) {
            goDown();
        }
        System.out.println("Welcome to floor number " + currentFloor);

      }
   }

    public void personEnters(int p){
      openDoor();
      System.out.println(p+" person are getting in");
      if (capacity == personInside) {
        System.out.println("The Elevator is FULL");
      }else {
        for (int i = 0; personInside < capacity && i < p; i++) {
          if (i > capacity) {
            closeDoor();
            break;
          }else{
            personInside++;
          }
        }
        System.out.println("There is "+personInside+" person inside the elevator.");
      }
      closeDoor();
    }

    public void personLeaves(int p){
      openDoor();
      System.out.println(p +" person are getting out");
      if (personInside == 0) {
        System.out.println("The Elevator is EMPTY");
      }else if(p > personInside) System.out.println("There are not that many people here");
      else {
        personInside = personInside - p;
        System.out.println("There is "+personInside+" person inside the elevator.");
      }
      closeDoor();
    }

    public void emergencyStop(){
      openDoor();
      System.out.println("*********************************************");
      System.out.println("DOOR IS OPENİNG");
      System.out.println("*********************************************");
      System.out.println("This is an emergency, everybody get out!");
      System.out.println("*********************************************");
      System.out.println("DOOR IS CLOSEING");
      System.out.println("*********************************************");
      closeDoor();
    }
    public boolean closeDoor(){
        isDoorOpen = false;
        return isDoorOpen;
    }
    public boolean openDoor(){
        isDoorOpen = true;
        return isDoorOpen;
    }
}
