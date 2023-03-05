package model.toys;

public abstract class Toy {
    Integer id;
    String toyType;
    String name;
    Integer count;
    Integer weight;

    public Toy(Integer id, String name, Integer count, Integer weight) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.weight = weight;
    }

    public String getToyType() {return toyType;}
    public String getName() {
        return name;
    }

    public Integer getCount() {
        return count;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getId() {
        return id;
    }

    public void setCount(Integer newCount) {
        this.count = newCount;
    }

    @Override
    public String toString() {
        return String.format("%s \"%s\" Count: %d Chance to win: %d", toyType, name, count, weight);
    }
}
