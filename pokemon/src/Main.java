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

        //b.go();

        Person Ivan = new Person("Ivan", 18);
        Ivan.setName("Vanya");
        System.out.println(Ivan.getName());

        Ivan.setAge(19);
        System.out.println(Ivan.getAge());


    }
}

class Employee implements Person {
    private String name;
    private int age;
    private  int snils;
    public Employee(String name, int age, int snils){
        super(name, age);
        this.snils = snils;

    }

}

class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}




