import java.util.LinkedList;
import java.util.Scanner;

public class insertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Enter the size of the list:");
        int n=sc.nextInt();
        System.out.println("Enter the element of the list:");
        for (int i = 0; i < n; i++) {
            int ele=sc.nextInt();
            list.add(ele);
        }
        System.out.println("Enter the number:");
        int x=sc.nextInt();
        System.out.println("Enter the index:");
        int idx=sc.nextInt();

        list.add(idx,x);
        System.out.println(list);
    }
}
