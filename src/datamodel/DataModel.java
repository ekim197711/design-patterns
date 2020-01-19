package datamodel;

public class DataModel {
    private static DataModel datamodel = null;
    private SpaceStation spaceStation;

    private DataModel() {
        spaceStation = new SpaceStation("Big spacestation");
        spaceStation.addShip(new SpaceShip("Square",100));
        spaceStation.addShip(new SpaceShip("Round",400));
        spaceStation.addShip(new SpaceShip("Pyramid",300));
        spaceStation.addShip(new SpaceShip("Pentagon",200));
    }

    public static DataModel getInstance(){
        if (datamodel == null){
            datamodel = new DataModel();
        }
        return datamodel;
    }

    public SpaceStation getSpaceStation() {
        return spaceStation;
    }
}
