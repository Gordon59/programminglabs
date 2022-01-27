import ru.ifmo.se.pokemon.*;

public class Recover extends StatusMove{
    public Recover(){
        super(Type.NORMAL, 0, 100, 3, 1);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP, (int) (-0.5 * p.getStat(Stat.HP)));
    }

    @Override
    protected String describe(){
        return "использует Recover";
    }
}