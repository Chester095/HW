public class HW1 {
    public static void main(String[] args) {
        //region Задача2
        byte a = 1;
        short b = 12;
        int c = -13;
        long d = 14;
        float e = 14.5f;
        double f = 15.5;
        char g = 16;
        boolean h = true;
        String i = "Андрей";
        //endregion
        System.out.println("Метод1: " + method1(1, 2, 3, 4));
        System.out.println("Метод2: " + method2(1,2));
        method3(5);
        System.out.println("Метод4: число " + c + " отрицательное? - " + method4(c));
        method5(i);
        method6(2008);
    }

    //region Задача3
    static float method1(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }
    //endregion

    //region Задача4
    static boolean method2(int a, int b) {
        if (a + b >= 10 && a + b <= 20) return true;
        else return false;
    }
    //endregion

    //region Задача5
    static void method3(int a) {
        if (a >= 0) System.out.println("Число " + a + " - положительное");
        else System.out.println("Число " + a + " - отрицательное");
    }
    //endregion

    //region Задача6
    static boolean method4(int a) {
        if (a < 0) return true;
        else return false;
    }
    //endregion

    // region Задача7
    static void method5(String a) {
        System.out.println("Привет, " + a + "!");
    }
    //endregion

    // region Задача8*
    static void method6(int a) {
        if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) System.out.println("Год " + a + " - високосный.");
        else System.out.println("Год " + a + " - невисокосный.");
    }
    //endregion

}
