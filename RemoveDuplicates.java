import java.util.*;

public class RemoveDuplicates {
    // public static void remover(List<String> list){
    //     Set<String> set = new LinkedHashSet<>(list);
    //     list.clear();
    //     list.addAll(set);
    // }
    public static int[] TwoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            if (map.containsKey(remain)) {
                return new int[]{map.get(remain),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        // List<String> list = new ArrayList<>(Arrays.asList("Java", "Python","C++","Python"));
        //    remover(list);
        //    System.out.println(list);
        int [] arr = {1,5,8,6,2,4};
        int target = 10;
        int [] arr2 = TwoSum(arr, target);
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
