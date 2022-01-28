


import ru.ifmo.se.pokemon.*;


public class Ariados extends Pokemon{
    public Ariados(String name, int level) {
        super(name, level);
        setType(Type.BUG, Type.POISON);
        setMove(new Facade(), new DoubleTeam(), new Confide());
        setStats(40, 60, 40,40,40,30);
    }
}