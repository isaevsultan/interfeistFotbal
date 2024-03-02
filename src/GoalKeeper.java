import java.time.LocalDate;

public class GoalKeeper extends Sportsman implements PlayAble {
    public GoalKeeper() {
    }

    public GoalKeeper(String name, String surName, LocalDate age, float height, float weight) {
        super(name, surName, age, height, weight);
    }

    @Override
    public String play() {
        return getName()+" is  catch a gaol";
    }
}
