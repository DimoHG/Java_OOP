package barracksWars;

import barracksWars.interfaces.Repository;
import barracksWars.interfaces.Runnable;
import barracksWars.interfaces.UnitFactory;
import barracksWars.core.Engine;
import barracksWars.core.factories.UnitFactoryImpl;
import barracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();

        //Repository -> holds the data of the application.
        //UnitFactory -> Used to create Units(Archers, Pikemans, Swordsmans)
        //Engine -> used to parse and execute commands
        //Units -> the characters in the game
    }
}
