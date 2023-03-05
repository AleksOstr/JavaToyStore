package model.toys;

public class Car extends Toy {
    private String toyType;

    public Car(Integer id, String name, Integer count, Integer weight) {
        super(id, name, count, weight);
        this.toyType = "Car";
    }

    public String getToyType() {
        return toyType;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Integer getCount() {
        return super.getCount();
    }

    @Override
    public Integer getWeight() {
        return super.getWeight();
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public void setCount(Integer newCount) {
        super.setCount(newCount);
    }

    @Override
    public String toString() {
        return String.format("%s \"%s\" Count: %d Chance to get: %d\n", this.toyType, this.getName(), this.getCount(),
                this.getWeight());
    }
}
