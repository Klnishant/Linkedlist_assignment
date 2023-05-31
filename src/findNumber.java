import java.util.LinkedList;
import java.util.Scanner;

public class findNumber {
    public static boolean search(LinkedList<Integer> list,int x){
        while (!list.isEmpty()){
            if (list.getFirst()==x){
                return true;
            }
            else list.removeFirst();
        }
        return false;
    }
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
        boolean result=search(list,x);

        if (result) System.out.println(x+" is present in the list.");
        else System.out.println(x+" is not present in the list.");

    }
}
