import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

/**
 * Created by Администратор on 22.03.2017.
 */
public class lesson2 {
    public static void main(String[] args) {
        //task1
        int[] a={1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i]==0) a[i] = 1;
            else a[i] = 0;
        }
        System.out.println("Task 1:"+Arrays.toString(a));

        //task2
        int[] b=new int[8];
        for (int i = 0; i < 8; i++) {
            b[i]=i*3;
        }
        System.out.println("Task 2:"+Arrays.toString(b));

        //task3
        int[] c={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < c.length; i++) {
            if (c[i]<6) c[i]=c[i]*6;
        }
        System.out.println("Task 3:"+Arrays.toString(c));

        //task4
        System.out.println("Task 4:");
        int[][] e=new int[10][10];
        for (int i = 0, j= e.length-1; i < e.length; i++, j--) {
            e[i][i]=1;
            e[i][j]=1;
        }

        for (int i = 0; i < e.length; i++) {
            System.out.println(Arrays.toString(e[i]));
        }

        //task5
        System.out.println("Task 5:");
        int maxNumber=c[c.length-1];//нужно обязательно выбрать любое число из массива,
        int minNamber=c[c.length-1];//т.к., если присвоить 0 в массиве может не быть больше||меньше 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] > maxNumber) maxNumber = c[i];
            if (c[i] < minNamber) minNamber = c[i];
        }
        System.out.println("Max number "+maxNumber);
        System.out.println("Min number "+minNamber);
        //task6
        System.out.println("Task 6:");
        int[] d={1, 1, 2, 1, 1,1,1};
        System.out.println(checkBalance(d));
        //task7
        System.out.println("Task 7:");
        int[] l={1,2,3,4,5,6,7,8,9,0};
        toShiftArray(l,-3);
        }

    //task6
    public static boolean checkBalance(int e[]){
       int left=0;
       int right=0;
       if (e.length%2==0){
           int i = 0, j= e.length/2;

           while (i < e.length/2) {
               left=left+e[i];
               right=right+e[j];
               i++;
               j++;
           }
           if (left==right) return true;
       } else {
           int i = 0;
           while (i <= e.length/2) {
               left=left+e[i];
               i++;
           }
           int j = e.length/2+1;
           while (j < e.length) {
               right=right+e[j];
               j++;
           }
           if (right==left) return true;
           left=0;
           right=0;
           int k = 0;
           while (k <= e.length/2-1) {
               left=left+e[k];
               k++;
           }
           int l = e.length/2;
           while (l < e.length) {
               right=right+e[l];
               l++;
           }
           if (right==left) return true;
       }
        return false;
    }
    //task7
    public static void toShiftArray(int f[], int n){

        System.out.println(Arrays.toString(f));
        int len;
        if (n < 0){
            n=f.length+n;
        }

        for (int i = 0; i < f.length-n;i++) {
                len=f[i+n];
                f[i+n]=f[i];
                f[i]=len;
            }


            System.out.println(Arrays.toString(f));
    }
}
