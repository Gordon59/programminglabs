
import ru.ifmo.se.pokemon.*;


public class Prinplup extends Pokemon{
    public Prinplup(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setMove(new Rest(), new Swagger(), new FocusEnergy());
        setStats(64, 66, 68, 81, 76, 50);
    }
}