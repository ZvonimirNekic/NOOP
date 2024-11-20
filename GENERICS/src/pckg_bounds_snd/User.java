package pckg_bounds_snd;

public class User implements Comparable<User> {

    private int id;
    private static int cntID = 10;

    private String name;

    public User(String name){
        this.name = name;
        this.id = cntID++;
    }

//    @Override
//    public int compareTo(User other) {
//        int result;
//        if (this.id > other.id) {
//            result = 1;
//        } else if (this.id < other.id){
//            result = -1;
//        } else {
//            result = 0;
//        }
//        return result;
//    }

    @Override
    public int compareTo(User other) {
        int result;
        if (this.name.length() > other.name.length()){
            result = 1;
        } else if (this.name.length() < other.name.length()){
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

    public int getId(){
        return this.id;
    }
}
