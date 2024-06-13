import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    MyHashMap myHashMap = new MyHashMap();


        myHashMap.put("sdf7", "ef");
        myHashMap.put("sdf7456", "ef");
        myHashMap.remove("sdf7456");
        myHashMap.put("sdf7456fvc", "ef");
        myHashMap.clear();
        myHashMap.put("sdf7456fvc", "ef");



        System.out.println("myHashMap.get(\"sdf\") = " + myHashMap.get("sdf7"));
        System.out.println("myHashMap.get(\"sdf\") = " + myHashMap.get("sdf7456"));
        System.out.println("myHashMap.size() = " + myHashMap.size());


    }
}