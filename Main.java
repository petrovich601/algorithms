public class Main {
    public static void main(String[] args) {
        Linlist list = new Linlist();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.print();
        list.revert();
        list.print();
    }

}