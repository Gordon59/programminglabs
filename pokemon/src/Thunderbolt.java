import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove{
    public Thunderbolt(){
        super(Type.ELECTRIC, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect effect = new Effect();
        effect.chance(0.1);
        effect.condition(Status.PARALYZE);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe(){
        return "использует Thunderbolt";
    }

}

