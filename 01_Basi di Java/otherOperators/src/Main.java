public class Main {
    public static void main(String[] args) {
        int a = 15;
        System.out.println(a);

        a += 5;
        System.out.println(a);

        a -= 4;
        System.out.println(a);

        int b = a++;
        System.out.println(a);

        boolean c = b / 2 != 0;
        if(c){
            System.out.println("b it's odd");
        }else{
            System.out.println("b it's even");
        }

        boolean d = (b * (b+1)) / 3 == 0;
        if(d){
            System.out.println("multiple of 3");
        }
    }
}
