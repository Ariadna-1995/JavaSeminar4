package seminar_4;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();

        myList.addLast("rose");
        myList.addLast("tulip");
        myList.addLast("daisy");
        myList.addLast("lavender");
        myList.addLast("daffodil");
        System.out.println("Linked List: " + myList);
        myList.addFirst("chrysanthemum");
        System.out.println("Linked List: " + myList);
        System.out.println("Index of element with value lavender" + myList.get("lavender"));
        myList.remove("daffodil");
        System.out.println("Linked List: " + myList);

    }
}
