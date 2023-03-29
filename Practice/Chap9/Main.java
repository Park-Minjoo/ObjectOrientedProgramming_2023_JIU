public class Main {
    public static void main(String[] args) {
        Node one = new Node(5, 10);
        Node two = new Node(23, 7);
        Node result = one.getCenter(two);
        System.out.println("x : " + result.getX() + ", y: " + result.getY());
    }
}
