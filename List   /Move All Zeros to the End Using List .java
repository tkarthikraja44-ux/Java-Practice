import java.util.ArrayList;
class Main {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(0);
        nums.add(0);
        nums.add(1);
        nums.add(2);
        nums.add(3);

        int count = 0;

        // Original size
        int og = nums.size();

        // Remove zeros
        for (int i = 0; i < nums.size(); i++) {

            if (nums.get(i) == 0) {

                nums.remove(i);

                count++;

                // Because elements shifted left
                i--;
            }
        }

        // Number of non-zero elements
        int n = og - count;

        // Add zeros at the end
        for (int i = n; i < og; i++) {
            nums.add(0);
        }

        System.out.print(nums);
    }
}
