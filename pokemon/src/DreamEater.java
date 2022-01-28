import ru.ifmo.se.pokemon.*;

import java.util.Objects;

public class DreamEater extends SpecialMove {
    public DreamEater() {
        super(Type.PSYCHIC, 100, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect effect = new Effect();
        Status p_status = pokemon.getCondition();
        if (!(p_status == Status.SLEEP)) {
            effect.attack(0);
        }
        pokemon.setMod(Stat.HP, (int) (-0.5 * pokemon.getStat(Stat.HP)));


    }

    @Override
    protected String describe(){
        return "использует DreamEater";
    }


}
