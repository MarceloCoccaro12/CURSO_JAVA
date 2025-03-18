package secao5;

public class Condicoes {
    public static void main(String[] args) {
        int x =10;

        System.out.println(x == 10);
        System.out.println(x == 9);
        System.out.println(x != 5);

        // Comparacao de strings

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("Java"));
    }
}
