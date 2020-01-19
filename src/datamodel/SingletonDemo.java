package datamodel;

public class SingletonDemo {

    public static void main(String[] args) {
        DataModel.getInstance().getSpaceStation().addShip(new SpaceShip("Flat", 123));
        DataModel.getInstance().getSpaceStation().addShip(new SpaceShip("Almost flat", 10));
        new SpaceShipPrintOutHelper().printAll();

    }
}
