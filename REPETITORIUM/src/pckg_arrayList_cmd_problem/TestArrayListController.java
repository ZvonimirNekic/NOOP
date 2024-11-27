package pckg_arrayList_cmd_problem;

import java.util.ArrayList;

public class TestArrayListController {

    public static void main(String[] args) {
        User user1 = new User("userName01");
        User user2 = new User("userName02");
        User user3 = new User("userName03");
        User user4 = new User("userName04");
        ArrayList<User> users = new ArrayList<>();

        Car car1 =  new Car("brand01", "model01");
        Car car2 =  new Car("brand02", "model02");
        Car car3 =  new Car("brand03", "model03");
        Car car4 =  new Car("brand04", "model04");
        ArrayList<Car> cars = new ArrayList<>();

        ArrayListController alc = new ArrayListController();
        AddNewElementToList<User> add1 = new AddNewElementToList<>(users, user1);
        AddNewElementToList<User> add2 = new AddNewElementToList<>(users, user1);
        AddNewElementToList<User> add3 = new AddNewElementToList<>(users, user2);
        InsertElementAtIndexPosition<User> insert1 = new InsertElementAtIndexPosition<>(users, user3, 1);
        ClearAllElements<User> clearAllElements1 = new ClearAllElements<>(users);
        AddNewElementToList<Car> addCar1 = new AddNewElementToList<>(cars, car1);


        alc.setCommand(add1);
        alc.runCommand();
        alc.setCommand(add2);
        alc.runCommand();
        alc.setCommand(add3);
        alc.runCommand();
        alc.setCommand(insert1);
        alc.runCommand();
        alc.setCommand(addCar1);
        alc.runCommand();
        alc.undoCommand();
        alc.undoCommand();
        alc.setCommand(clearAllElements1);
        alc.runCommand();

    }
}
