public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String... args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        for (int i = 1; i <= 10; i++){
            int multiple = n * i;
            System.out.println(n + " x " + i + " = " + multiple);
        }

    }

}
