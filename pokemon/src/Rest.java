import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{
    public Rest(){
        super(Type.NORMAL, 0, 85);
    }

    private final static Effect SLEEP = new Effect().condition(Status.SLEEP).turns(2);

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        double maxHP = pokemon.getStat(Stat.HP);
        double heal = maxHP - pokemon.getHP();
        pokemon.setMod(Stat.HP, (int) -heal);
        pokemon.addEffect(SLEEP);
    }

    @Override
    protected String describe() {
        return "использует Rest";
    }
}
