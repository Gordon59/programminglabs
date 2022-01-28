import ru.ifmo.se.pokemon.*;

public class Recover extends StatusMove{
    public Recover(){
        super(Type.NORMAL, 0, 100, 3, 1);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.HP, (int) (-0.5 * pokemon.getStat(Stat.HP)));
    }

    @Override
    protected String describe(){
        return "использует Recover";
    }
}