import model.toys.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {

    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    private String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String input = scanner.nextLine();
        return input.strip();
    }

    private <E> void showList(List<E> list) {
        for (E item : list) {
            System.out.println(item);
        }
    }

    public void run() {
        while (true) {
            try {
                String command = prompt("Choose an action:\n" +
                        "1 - Show available toys\n" +
                        "2 - Show pending prizes\n" +
                        "3 - Show awarded prizes\n" +
                        "4 - Add toy to toy list\n" +
                        "5 - Play a prize\n" +
                        "6 - Give out a prize\n" +
                        "7 - Change toys drop chance\n" +
                        "8 - Exit\n");
                switch (command) {
                    case "1":
                        showList(controller.getToys());
                        break;
                    case "2":
                        showList(controller.getPrizes());
                        break;
                    case "3":
                        showList(controller.readAwardedPrizes());
                        break;
                    case "4":
                        command = prompt("Choose an action:\n" +
                                "1 - Add soft toy\n" +
                                "2 - Add car\n" +
                                "3 - Add doll\n");
                        switch (command) {
                            case "1":
                                String toyName = prompt("Enter toy name\n");
                                int toyCount = Integer.parseInt(prompt("Enter number of toys\n"));
                                int toyWeight = Integer.parseInt(prompt("Enter drop chance\n"));
                                controller.addSoftToy(toyName, toyCount, toyWeight);
                                break;
                            case "2":
                                toyName = prompt("Enter toy name\n");
                                toyCount = Integer.parseInt(prompt("Enter number of toys\n"));
                                toyWeight = Integer.parseInt(prompt("Enter drop chance\n"));
                                controller.addCar(toyName, toyCount, toyWeight);
                                break;
                            case "3":
                                toyName = prompt("Enter toy name\n");
                                toyCount = Integer.parseInt(prompt("Enter number of toys\n"));
                                toyWeight = Integer.parseInt(prompt("Enter drop chance\n"));
                                controller.addDoll(toyName, toyCount, toyWeight);
                                break;
                        }
                        break;
                    case "5":
                        controller.getRandomPrize();
                        break;
                    case "6":
                        controller.releasePrize();
                        break;
                    case "7"

                }
            }
        }
    }
}
