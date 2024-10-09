import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(23);
        numbersList.add(45);

        for (int i : numbersList){
            System.out.println(i);
        }

    }
}