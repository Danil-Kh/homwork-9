import java.util.Arrays;

public class MyQueue <T> {
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
    public T[] getTest(){
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
    public T peek(){
        return myArrayListCopy[0];
    }
    public T poll(){
        T firstElemet = myArrayListCopy[0];
        for (int i = 0; i < myArrayListCopy.length - 1 ; i++) {
            myArrayListCopy[i] = myArrayListCopy[i + 1];
        }
        myArrayListCopy[myArrayListCopy.length - 1] = null;
        return firstElemet;
    }

}

