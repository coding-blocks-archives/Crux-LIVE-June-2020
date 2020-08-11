package info.company.Lec32;

public class DicecountDp {

    public static void main(String[] args) {

        int n = 4;
        int[] mem= new int[n + 1];
        System.out.println(dice(4));
//        System.out.println(diceRecDp(4, target));
        System.out.println(DiceItrDp(4,mem));
    }

    public static int dice(int target) {

        if (target == 0) {
            return 1;
        }

        int cnt = 0;

        for (int i = 1; i <= 6 && i <= target; i++) {

            cnt += dice(target - i);
        }

        return cnt;
    }

    public static int diceRecDp(int target, Integer[] mem) {

        if (target == 0) {
            return 1;
        }

        if (mem[target] != null) {
            return mem[target];
        }

        int cnt = 0;

        for (int i = 1; i <= 6 && i <= target; i++) {

            cnt += diceRecDp(target - i, mem);

        }

        mem[target] = cnt;

        return mem[target];
    }

    public static int DiceItrDp(int target, int[] mem) {

        mem[0] = 1;

        for (int i = 1; i <= target; i++) {

            for (int j = 1; j <= 6 && j <= i; j++) {

                mem[i] = mem[i] + mem[i - j];
            }
        }
        return mem[target];
    }

}