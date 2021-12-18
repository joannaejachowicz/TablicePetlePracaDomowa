import java.util.Arrays;

public class FirstExcercise {
    public static void main(String[] args) {


        int[] pierwszaTablica = {0, 1, 2, 3, 4, 5};
        //1.3
        for (int element : pierwszaTablica) {
            System.out.println(element);
        }
        //1.5
        int[] drugaTablica = new int[12];
        System.out.println(Arrays.toString(drugaTablica));
        for (int i = 0; i < drugaTablica.length; i++) {
            drugaTablica[i] = pierwszaTablica[i / 2];
        }

        //1.2

        System.out.println(pierwszaTablica.length);
        System.out.println(drugaTablica.length);

        //1.4
        System.out.println(Arrays.toString(drugaTablica));

        //1.6
        int[] trzeciaTablica = new int[6];
        int pozycjaTablicy = 0;
        for (int element : drugaTablica) {
if(element%2==0){
    trzeciaTablica[pozycjaTablicy++]=element;
        }
    }
        System.out.println(Arrays.toString(trzeciaTablica));

        //1.7
        int [] czwartaTablica = Arrays.copyOf(trzeciaTablica, 12 );
        System.out.println(Arrays.toString(czwartaTablica));

        //1.8
        int pozycjaTablicy1 = 6;
        for (int element:drugaTablica) {
            if (element%2>0){
                czwartaTablica[pozycjaTablicy++]=element;


            }
        }
        System.out.println(Arrays.toString(czwartaTablica));

        //1.9
        int[] piataTablica = {1,2,3};
        int[] table1 = piataTablica.clone();
        System.out.println(Arrays.toString(piataTablica));
        System.out.println(Arrays.toString(table1));




}







}
