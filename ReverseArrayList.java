import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {

    public static void reverseList(List<Integer> list){
         int left = 0;
        int right = list.size() - 1;
        for (int i = 0; i < list.size(); i++) {
            if (left < right) {
                int temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(80);
        list.add(55);
        list.add(60);
        list.add(50);
        System.out.println("Normal ArrayList: "+list);
        reverseList(list);
        System.out.println("After Reverse: "+list);
    }
}
