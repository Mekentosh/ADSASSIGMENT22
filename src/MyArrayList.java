public class MyArrayList<T> implements MyList<T> {
    //Define a private instance variable of type Object[] to hold the elements of the list.
    private Object[] array;
    //Define an int variable called size to keep track of the number of elements in the list.
    private int size = 0;
    public MyArrayList(){
        this.array = new Object[5];
        this.size = 0;
    }
    @Override
    public void add(T item){
        if (this.size == array.length){
            Object[] newArray = new Object[array.length * 2];

            System.arraycopy(array, 0, newArray, 0, this.size);

            array = newArray;
        }
        array[this.size] = item;
        this.size++;
    }


}
