public class Prog62 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("積を計算します");
        System.out.println(logic.Calculator.time(a,b));
        System.out.println("商を計算します");
        System.out.println(logic.Calculator.divide(a,b));

    }
}
