

import ru.ifmo.se.pokemon.*;

public class FocusEnergy extends StatusMove {
    public FocusEnergy(){

        super(Type.NORMAL, 0, 0);
    }


    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect effect = new Effect();
        pokemon.setMod(Stat.SPEED,2);
    }

    @Override
    protected String describe(){
        return "использует FocusEnergy";
    }
}


