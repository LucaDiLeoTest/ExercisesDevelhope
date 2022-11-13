public class Main {
    public static void main(String[] args) {
        int f0 = 0, f1 = 1, f2;
        System.out.println(f0);
        System.out.println(f1);
        int i = 2;
        while(i<=10){
            f2 = f0 + f1;
            System.out.println(f2);
            f0 = f1;
            f1 = f2;
            i++;
        }
    }
}