import java.time.LocalDate;

public class MidfielderAttacker extends Sportsman implements  PlayAble{
    public MidfielderAttacker() {
    }

    public MidfielderAttacker(String name, String surName, LocalDate age, float height, float weight) {
        super(name, surName, age, height, weight);
    }

    @Override
    public String play() {
        return getName()+"wdas";
    }
}
