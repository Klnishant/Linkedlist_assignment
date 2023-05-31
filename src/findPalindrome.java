import java.util.LinkedList;
import java.util.Scanner;

public class findPalindrome {
    public static  boolean isPalindrome(LinkedList<Integer> list){
        int i=0;
        int j=list.size()-1;
        while (i<j){
            if (!(list.get(i).equals(list.get(j)))) return false;
            i++;
            j--;
        }
        return true;
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
        System.out.println("Given list is palindrome:"+isPalindrome(list));
    }
}
