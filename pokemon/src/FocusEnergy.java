

import ru.ifmo.se.pokemon.*;

public class FocusEnergy extends StatusMove {
    public FocusEnergy(){

        super(Type.NORMAL, 0, 0);
    }


    @Override
    protected void applySelfEffects(Pokemon p){
        Effect effect = new Effect();
        p.setMod((Stat) Stat.SPEED, (int) +2);
    }

    @Override
    protected String describe(){
        return "использует FocusEnergy";
    }
}


