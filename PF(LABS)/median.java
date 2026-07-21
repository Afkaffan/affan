public class median {

    public static void main(String[] args) {
    
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8};    

        System.out.println("mid of arr 1 ="+median(arr1));
        System.out.println("mid of arr 2 ="+median(arr2));


    }

    public static double median (int[] arr) {
        int a=arr.length;
        int b=a/2;

        if (a%2==0) {
            return (arr[b-1]+arr[b])/2.0;
        } else {
            return arr[b];
        }

    }


}