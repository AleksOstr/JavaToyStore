import model.store.ToyStore;
import model.toys.Toy;

import java.util.ArrayList;

public class Controller {
    private ToyStore toyStore;

    public Controller(ToyStore toyStore) {
        this.toyStore = toyStore;
    }

    public void addSoftToy(String name, Integer count, Integer weight) throws Exception {
        toyStore.addSoftToy(name, count, weight);
    }

    public void addCar(String name, Integer count, Integer weight) throws Exception {
        toyStore.addCar(name, count, weight);
    }

    public void addDoll(String name, Integer count, Integer weight) throws Exception {
        toyStore.addDoll(name, count, weight);
    }

    public void getRandomPrize() {
        toyStore.getRandomPrize();
    }

    public void releasePrize() {
        toyStore.releasePrize();
    }

    public ArrayList<Toy> getPrizes() {
        return toyStore.getPrizes();
    }

    public ArrayList<Toy> getToys() {
        return toyStore.getToys();
    }

    public ArrayList<String> readAwardedPrizes() {
        return toyStore.readAwardedPrizes();
    }
}
