package model.toys;

public class Car extends Toy{
    public Car(Integer id, String name, Integer count, Integer weight) {
        super(id, name, count, weight);
        super.toyType = "Car";
    }

    @Override
    public String getToyType() {
        return super.getToyType();
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
        return super.toString();
    }
}
