public class Main {
    public static void main(String[] args) {
    MyArrayList<Integer> array = new MyArrayList<>();
    array.add(1);
    array.add(1);
    array.add(1);
    array.add(2);
    array.add(2);
    System.out.println("Array before deleting duplicates: ");
    for (int i = 0; i < array.size(); i++) {
        System.out.print(array.get(i) + " ");
    }
    System.out.println();
    System.out.println("Array after deleting duplicates: ");
    array.deleteDuplicates();
    for (int i = 0; i < array.size(); i++) {
        System.out.print(array.get(i) + " ");
    }
    }
}