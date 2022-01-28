//import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import java.lang.reflect.Array;

public class Main{
    public static void main(String[] args){
        Battle b = new Battle();

        Empoleon p1 = new Empoleon("Empoleon", 1);
        Piplup p2 = new Piplup("Piplup", 1);
        Ariados p3 = new Ariados("Ariados", 1);
        Spinarak p4 = new Spinarak("Spinarak", 1);
        Turtonator p5 = new Turtonator("Turtonator", 1);
        Prinplup p6 = new Prinplup("Prinplup", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}






