

public class Main {
    public static void main(String[] args) {
        UnaSeteLagoasStack<Integer> myList = new UnaSeteLagoasStack<>();

        myList.push(1);
        myList.push(2);
        myList.push(3);

        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.verifyIfIsEmpty());
        System.out.println();

        myList.pop();

        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println();

        myList.toEmpty();

        System.out.println(myList);
        System.out.println(myList.size());



        System.out.println();
    }
}