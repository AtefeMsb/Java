package hashset;

public class HashSetTestDrive {
    public static void main (String[] args) {

     // Your MyHashSet object will be instantiated and called as such:
        HashSet obj = new HashSet();
        obj.add(3);
        obj.add(4);
        obj.remove(3);
        System.out.println(obj.contains(3));
    }
}
