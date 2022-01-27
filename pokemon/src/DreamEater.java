import ru.ifmo.se.pokemon.*;

import java.util.Objects;

public class DreamEater extends SpecialMove {
    public DreamEater() {
        super(Type.PSYCHIC, 100, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        Effect effect = new Effect();
        Status p_status = p.getCondition();
        if (!(p_status == Status.SLEEP)) {
            effect.attack(0);
        }
        p.setMod(Stat.HP, (int) (-0.5 * p.getStat(Stat.HP)));


    }

    @Override
    protected String describe(){
        return "использует DreamEater";
    }


}
