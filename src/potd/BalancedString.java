package potd;

public class BalancedString {
    public static void main(String[] args) {

        String s = balencedString(57);
        System.out.println(s);
    }

    public static String balencedString(int n) {
        String alphabate = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder ans = new StringBuilder();
        int r = n;
        while (n > 26) {
            ans.append(alphabate);
            n -= 26;
        }
        int start = 0;
        int end = 0;
        if (n % 2 == 0) {
            start = n / 2;
            end = n / 2;
        } else {
            int sum = 0;

            while (r > 0) {
                sum += r % 10;
                r/= 10;
            }
            if (sum % 2 == 0) {
                start = (n + 1) / 2;
                end = (n - 1) / 2;
            } else {
                start = (n - 1) / 2;
                end = (n + 1) / 2;
            }
        }
        ans.append(alphabate.substring(0, start));
        ans.append(alphabate.substring((26 - end), 26));
        return ans.toString();
    }
}
