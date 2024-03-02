import java.time.LocalDate;

public class Defender  extends Sportsman implements PlayAble {
    public Defender() {
    }

    public Defender(String name, String surName, LocalDate age, float height, float weight) {
        super(name, surName, age, height, weight);
    }

    @Override
    public String play() {
        return this.getName()+" is protect the ball";
    }

}
