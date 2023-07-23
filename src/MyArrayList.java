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
    @Override
    public T get(int index){
        checkIndex(index);
        //Return index of an array
        return (T) array[index];
    }
    @Override
    public T remove(int index){
        checkIndex(index);
        T removedItem = (T) array[index];
        System.arraycopy(array, index + 1, array, index, this.size - index - 1);
        this.size--;
        array[size] = null;
        return removedItem;

    }
    public void checkIndex(int index){
        //If index is not in boundaries -> throw exception
        if (index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException();
        }
    }
    @Override
    public int size(){
        //returning the size variable
        return this.size;
    }
}
