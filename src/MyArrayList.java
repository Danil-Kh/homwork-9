import java.util.Arrays;

public class MyArrayList <T> {
   private int size = 0;
    private T[] myArrayListCopy = (T[]) new Object[10];


    public void add(T value) {
      if (size >= myArrayListCopy.length){
          T[] newmyArrayListCopy = (T[]) new Object[size + size / 2];
          for (int i = 0; i < myArrayListCopy.length; i++) {

              newmyArrayListCopy[i] = myArrayListCopy[i];

          }
          myArrayListCopy = newmyArrayListCopy;

      }
        myArrayListCopy[size] = value;
        size++;
    }

    public T[] remove(int index){
        for (int i = index; i < myArrayListCopy.length - 1 ; i++) {
            myArrayListCopy[i] = myArrayListCopy[i + 1];
        }
        myArrayListCopy[myArrayListCopy.length - 1] = null;
        return myArrayListCopy;
    }
    public T[] clear(){
        for (int i = 0; i < myArrayListCopy.length; i++) {
            myArrayListCopy[i] = null;
        }
        return myArrayListCopy;
    }
    public int size(){
        return myArrayListCopy.length;
    }
    public T get(int index){
        return myArrayListCopy[index];
    }






}
