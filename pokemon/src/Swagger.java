import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove{
    public Swagger(){
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect();
        effect.stat(Stat.ATTACK, 2 + (int) pokemon.getStat(Stat.ATTACK));
        pokemon.confuse();
    }

    @Override
    protected String describe() {
        return "использует Swagger";
    }
}
