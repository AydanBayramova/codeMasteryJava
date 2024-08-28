package az.edu.turing.generics;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox=new Box<>();
        stringBox.setElement("salam");
        System.out.println(stringBox.getElement());

        Integer[] intArray={2,3,4,5};
        printArray(intArray);

    }
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }
}
