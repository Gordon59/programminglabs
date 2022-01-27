

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove{
    public Facade(){
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        Status p_status = def.getCondition();
        if (p_status.equals(Status.BURN) || p_status.equals(Status.POISON) || p_status.equals(Status.PARALYZE)) {
            super.applyOppDamage(def, damage*2);
        }
        else {
            super.applyOppDamage(def, damage);
        }
    }

    @Override
    protected String describe(){
        return "использует Facade";
    }
}