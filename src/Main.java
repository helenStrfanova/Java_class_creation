public class Main {

    public static void main(String[] args) {

        Round round1 = new Round(14, 2.5);
        System.out.println(round1.toString());
        System.out.println(round1.hashCode());
        System.out.println(round1.equals(round1));
    }
}
