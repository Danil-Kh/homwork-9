import java.util.Arrays;

public class MyArrayList <T> {
   private int size = 0;
    private T[] myArrayListCopy = (T[]) new Object[10];


    public void add(T value) {
      if (size >= myArrayListCopy.length){
          T[] myNewArrayList = (T[]) new Object[size + size / 2];
          for (int i = 0; i < myArrayListCopy.length; i++) {

              myNewArrayList[i] = myArrayListCopy[i];

          }
          myArrayListCopy = myNewArrayList;

      }
        myArrayListCopy[size] = value;
        size++;
    }

    public void remove(int index) {
        if (index <= size) {
            for (int i = index; i < size - 1; i++) {
                myArrayListCopy[i] = myArrayListCopy[i + 1];
            }
            size--;
            myArrayListCopy[myArrayListCopy.length - 1] = null;

        }
        else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    public void clear(){
        for (int i = 0; i < myArrayListCopy.length; i++) {
            myArrayListCopy[i] = null;
        }
        size = 0;
    }
    public int size(){
        return size;
    }
    public T get(int index){
        if (index  > size - 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            return myArrayListCopy[index];
        }

    }






}
