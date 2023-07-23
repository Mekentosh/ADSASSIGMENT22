import java.util.Arrays;

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
        if (index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException();
        }
    }
    @Override
    public int size(){
        return this.size;
    }
    @Override
    public boolean contains(Object o){
        for (int i = 0; i < this.size; i++){
            if (array[i].equals(o)){
                return true;
            }
        }   return false;
    }
    @Override
    public void add(T item, int index) {
        checkIndex(index);
        if (this.size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, index);
            newArray[index] = item;
            System.arraycopy(array, index, newArray, index + 1, size - index);
            array = newArray;
        } else {
            System.arraycopy(array, index, array, index + 1, size - index);
            array[index] = item;
        }
        this.size++;
    }
    @Override
    public boolean remove(T item){
        for (int i=0; i < this.size; i++){
            if (array[i].equals(item)) {
                System.arraycopy(array, i + 1, array, i, this.size - i - 1);
                this.size--;
                array[this.size] = null;
                return true;
            }
        }
        return false;
    }
    @Override
    public void clear(){
        this.array = new Object[5];
        this.size = 0;
    }
    @Override
    public int indexOf(Object o){
        for (int i = 0; i < this.size; i++) {
            if (array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public int lastIndexOf(Object o){
        for (int i = this.size - 1; i >= 0; i--) {
            if (array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public void sort(){
        Arrays.sort((T[]) array, 0, this.size);
    }

    @Override
    public void deleteDuplicates(){
        for (int i = 0; i < this.size; i++){
            for (int j = 1; j < this.size; j++){
                if (array[i].equals(array[j])){
                    System.arraycopy(array, j + 1, array, j, this.size - j - 1);
                    this.size--;
                }
            }
        }
    }

}
