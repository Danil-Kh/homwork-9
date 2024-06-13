public class MyStack <T> {
    private int size = 0;
    private T[] MyStackMas = (T[]) new Object[10];

    public void add(T value) {
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
    public T[] remove(int index){
        for (int i = index; i < MyStackMas.length - 1 ; i++) {
            MyStackMas[i] = MyStackMas[i + 1];
        }
        MyStackMas[MyStackMas.length - 1] = null;
        return MyStackMas;
    }
    public T[] clear(){
        for (int i = 0; i < MyStackMas.length; i++) {
            MyStackMas[i] = null;
        }
        return MyStackMas;
    }
    public T peek(){
        for (int i = 0; i < MyStackMas.length; i++) {
            if (MyStackMas[i] == null){
                return MyStackMas[i - 1];
            }
        }
        return null;
    }
    public T pop(){
        for (int i = 0; i < MyStackMas.length; i++) {
            if (MyStackMas[i] == null){
                T element = MyStackMas[i - 1];
                MyStackMas[i - 1] = null;
                return element;
            }
        }
        return null;
    }

}
