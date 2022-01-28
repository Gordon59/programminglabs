
import ru.ifmo.se.pokemon.*;

public class Astonish extends PhysicalMove{
    public Astonish(){
        super(Type.GHOST,30,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect effect = new Effect();
        effect.chance(0.3);
        effect.condition(Status.PARALYZE);
    }

    @Override
    protected String describe(){
        return "использует Astonish";
    }
}
