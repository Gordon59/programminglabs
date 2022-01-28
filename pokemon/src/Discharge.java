import ru.ifmo.se.pokemon.*;

public class Discharge extends SpecialMove{

    public Discharge(){

        super(Type.ELECTRIC,80,100);

    }


    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect effect = new Effect();
        effect.chance(0.3);
        effect.condition(Status.PARALYZE);
    }

    @Override
    protected String describe(){
        return "использует Discharge";
    }
}
