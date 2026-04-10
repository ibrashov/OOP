package problem3;

public class Start {
    public static void main(String[] args) {
        MyCollection<String> collection = new Array<>();
        collection.add("Arcane");
        collection.add("One Piece");
        collection.add("OTOKA NA TITANNOV");
        System.out.println("Size: " + collection.size());
        System.out.println("Contains Banana: " + collection.contains("Arcane"));
        collection.remove("Arcane");
        System.out.println("Size after remove: " + collection.size());
        System.out.println("Is empty: " + collection.isEmpty());
        Object[] arr = collection.toArray();
        for (Object x : arr) {
            System.out.println(x);
        }
    }
}