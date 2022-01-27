


import ru.ifmo.se.pokemon.*;


public class Empoleon extends Pokemon{
    public Empoleon(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.STEEL);
        setMove(new Rest(), new Swagger(), new FocusEnergy(), new Rest());
        setStats(84, 86, 88, 111, 101, 60);
    }
}