import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(5);
        arraylist.add(10);
        System.err.println("Eleement : " + arraylist.get(0));
        int len = arraylist.size();
        for (int i  = 0 ; i < len ; i++){
            System.err.println("Element : " + arraylist.get(i));
        }

        // update 
        arraylist.set(1,20);
        for (int i  = 0 ; i < len ; i++){
            System.err.println("Element after update : " + arraylist.get(i));
        }

        // delete 
        arraylist.remove(0 );
        for (int i  = 0 ; i < arraylist.size() ; i++){
            System.err.println("Element after delete : " + arraylist.get(i));
        }

        // insert with shifting
        arraylist.add(0,30);
        for (int i  = 0 ; i < arraylist.size() ; i++){
            System.err.println("Element after insert with shifting  : " + arraylist.get(i));
        }
    }
}
