import java.util.ArrayList;

//even and odd numbers
public class Main {
    public static void main(String[] args) {
        int [] numbers = {5,3,2,10,15,20};
        ArrayList<Integer> even_nums = new ArrayList<>();
        ArrayList<Integer> odd_nums = new ArrayList<>();
        for (int nums : numbers) {
            if (nums % 2 == 0){
                even_nums.add(nums);
            }
            else {
                odd_nums.add(nums);
            }
        }
        System.out.println("Even numbers: " + even_nums);
        System.out.println("Odd numbers: " + odd_nums);

    }
}