import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap size cua mang 1");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i=0;i< array.length;i++){
            System.out.println(" nhap phan tu cua mang 1 co vi tri i" + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("nhap size1 cua mang 2");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        for (int i=0;i< array1.length;i++){
            System.out.println(" nhap phan tu cua mang 2 co vi tri i" + i);
            array1[i]= scanner.nextInt();
        }
        int length = array.length + array1.length;
        int[] arrayGop = new int[length];
//        int j = 0;
        for (int i=0;i < array.length; i++){
            arrayGop[i] = array[i];
        }
        System.out.println("sau khi push mang 1 vao" + Arrays.toString(arrayGop));
        for (int k = array.length; k < arrayGop.length; k++){
            System.out.println("====" + k);
            arrayGop[k] = array1[k - array.length];
        }
        System.out.println(Arrays.toString(arrayGop));

    }
}