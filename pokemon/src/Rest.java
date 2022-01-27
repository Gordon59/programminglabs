import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{
    public Rest(){
        super(Type.NORMAL, 0, 85);
    }

    private final static Effect SLEEP = new Effect().condition(Status.SLEEP).turns(2);

    @Override
    protected void applyOppEffects(Pokemon p) {
        double maxHP = p.getStat(Stat.HP);
        double heal = maxHP - p.getHP();
        p.setMod(Stat.HP, (int) -heal);
        p.addEffect(SLEEP);
    }

    @Override
    protected String describe() {
        return "использует Rest";
    }
}
