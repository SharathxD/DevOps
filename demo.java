import java.util.*;
public class demo {
    public static void main(String[] args) {
        HashSet<Integer> hm= new HashSet<>();
        int arr[]={1,2,3,4,5,6,6};
        for(int num:arr){
            System.out.println(num);
            System.out.println(hm.add(num));
        }
        System.out.println(hm);

    }
}
