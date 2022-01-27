import ru.ifmo.se.pokemon.*;

public class Turtonator extends Pokemon{
    public Turtonator(String name, int level){
        super(name, level);
        setType(Type.FIRE, Type.DRAGON);
        setMove(new Discharge(), new Astonish(), new Thunderbolt(), new DreamEater());
        setStats(60, 78, 135, 91, 85, 36);
    }
}