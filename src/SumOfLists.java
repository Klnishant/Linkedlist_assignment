import java.util.LinkedList;
import java.util.Scanner;

public class SumOfLists {
    public static LinkedList<Integer> addTwoList(LinkedList<Integer> list1,LinkedList<Integer> list2){
        LinkedList<Integer> result =new LinkedList<>();
        int list1Sum = 0;
        int list2Sum = 0;
        int totalSum ;

        for (int i = list1.size()-1, n=1; i >=0 ; i--) {
            list1Sum += list1.get(i)*n;
            n=n*10;
        }
        for (int i = list2.size()-1,n=1; i >=0 ; i--) {
            list2Sum += list2.get(i)*n;
            n=n*10;
        }
        totalSum=list1Sum+list2Sum;
        while (totalSum>0){
            result.addFirst(totalSum%10);
            totalSum=totalSum/10;
        }
        return result;
    }

            public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        System.out.println("Enter the size of the list1:");
        int n=sc.nextInt();
        System.out.println("Enter the element of the list1:");
        for (int i = 0; i < n; i++) {
            int ele=sc.nextInt();
            list1.add(ele);
        }

        System.out.println("Enter the size of the list2:");
        int m=sc.nextInt();
        System.out.println("Enter the element of the list2:");
        for (int i = 0; i < m; i++) {
            int ele=sc.nextInt();
            list2.add(ele);
        }

        LinkedList<Integer> result = addTwoList(list1,list2);
                System.out.println("Summation of given list in list format:"+result);

    }
}
