import java.util.LinkedList;
import java.util.Scanner;

public class deleteDuplictesElement {
    public static LinkedList<Integer> removeDuplicate(LinkedList<Integer> list){
        LinkedList<Integer> result = new LinkedList<>();
        if (list.size()==1) result.add(list.get(0));
        for (int i = 1; i < list.size() ; i++) {
            if (i==list.size()-1 || !list.get(i).equals(list.get(i-1))){
                result.add(list.get(i-1));
            }
        }
        return result;
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

        LinkedList<Integer> result=removeDuplicate(list);
        System.out.println(result);
    }
    }
