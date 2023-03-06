public class Main {
    public static void main(String[] args) {

            HashMap<Integer, String> hashMap = new HashMap<>();

            hashMap.put(10, "hello");
            hashMap.put(11, "there");
            hashMap.put(12 ,"yourname");
            hashMap.get(11);
            hashMap.containsKey(10);
            hashMap.display();

        System.out.println(hashMap.size());
        System.out.println(hashMap.hashCode());
        hashMap.isEmpty();
        System.out.println(hashMap.containsValue("there"));
        System.out.println(hashMap.equals("there"));
        hashMap.remove(12);




    }
}