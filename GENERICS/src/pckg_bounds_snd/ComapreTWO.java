package pckg_bounds_snd;

public class ComapreTWO <T extends Comparable<T>> { //čak i kod sučelja je extends, a ne implements (u parametrizaciji)

    private T fst;
    private T snd;


    public ComapreTWO(T fst, T snd) {
        this.fst = fst;
        this.snd = snd;
    }

    public void compareTwo(){
        if (fst.compareTo(snd) > 0) {
            System.out.println("First one is larger!");
        } else if (fst.compareTo(snd) < 0) {
            System.out.println("Second one is larger!");
        } else {
            System.out.println("Equal!");
        }
    }

}
