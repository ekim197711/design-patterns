package datamodel;

public class SpaceShipPrintOutHelper {

    public void printAll(){
        DataModel
                .getInstance()
                .getSpaceStation()
                .getSpaceShips()
                .forEach(s -> System.out.printf("Name of spaceship: %s and crewmembers %d %n",
                        s.getName(), s.getCrew()));
    }


}
