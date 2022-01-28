import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove{
    public DoubleTeam(){
        super(Type.NORMAL, 100, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.EVASION, 1);

    }

    @Override
    protected String describe(){
        return "использует Double Team";
    }
}