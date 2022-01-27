


import ru.ifmo.se.pokemon.*;


public class Piplup extends Pokemon{
    public Piplup(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setMove(new Rest(), new Swagger());
        setStats(53, 51, 53, 61, 56, 40);
    }
}