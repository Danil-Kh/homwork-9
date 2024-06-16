public class MyStack <T> {
    private int size = 0;
    private T[] MyStackMas = (T[]) new Object[10];

    public void push(T value) {
        if (size >= MyStackMas.length){
            T[] CopyStackMas = (T[]) new Object[size + size / 2];
            for (int i = 0; i < MyStackMas.length; i++) {

                CopyStackMas[i] = MyStackMas[i];

            }
            MyStackMas = CopyStackMas;

        }
        MyStackMas[size] = value;
        size++;
    }
    public void remove(int index){
        if (index <= size) {
            for (int i = index; i < size - 1; i++) {
                MyStackMas[i] = MyStackMas[i + 1];
            }
            MyStackMas[MyStackMas.length - 1] = null;
            size--;
        }
        else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void clear(){
        for (int i = 0; i < MyStackMas.length; i++) {
            MyStackMas[i] = null;
        }
    }
    public T peek(){
        return MyStackMas[size - 1];
    }
    public T pop(){
        for (int i = 0; i < MyStackMas.length; i++) {
            if (MyStackMas[i] == null){
                T element = MyStackMas[i - 1];
                MyStackMas[i - 1] = null;
                size--;
                return element;
            }
        }
        return null;
    }
    public int size(){
        return size;
    }

}
