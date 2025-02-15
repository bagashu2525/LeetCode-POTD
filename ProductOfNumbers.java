import java.util.ArrayList;
public class ProductOfNumbers {
    public ArrayList<Integer> pon;

    public ProductOfNumbers() {
        pon = new ArrayList<>();
    }

    // ans1
    public void add(int num) {
        pon.add(num);
    }

    public int getProduct(int k) {
        int n = pon.size();
        int p = 1;
        if (n < k)
            return -1;
        for (int i = n - k; i < n; i++) {
            p *= pon.get(i);
        }
        return p;
    }

    // ans2
    public void add2(int num) {
        if (num != 0)
            pon.add(num * pon.get(pon.size() - 1));
        else {
            pon.clear();
            pon.add(1);
        }
    }

    public int getProduct2(int k) {
        int n = pon.size();
        if (n > k)
            return (pon.get(n - 1) / pon.get(n - k - 1));
        else
            return 0;
    }
    public static void main(String[] args) {
        ProductOfNumbers pon = new ProductOfNumbers();
        
        Object[][] operationsWithValues = {
            {"ProductOfNumbers", null},
            {"add", 3},
            {"add", 0},
            {"add", 2},
            {"add", 5},
            {"add", 4},
            {"getProduct", 2},
            {"getProduct", 3},
            {"getProduct", 4},
            {"add", 8},
            {"getProduct", 2}
        };

        for (Object[] operation : operationsWithValues) {
            String op = (String) operation[0];
            if (op.equals("add")) {
                pon.add((int) operation[1]);
                System.out.println("null");
            } else if (op.equals("getProduct")) {
                System.out.println(pon.getProduct((int) operation[1]));
            } else {
                System.out.println("null");
            }
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */

 