public class Main {
    public static void main (String[] args) {
        partRandomeArrayElements(15,100,3,7);
    }
    public static int[] partRandomeArrayElements(int number,int max,int first,int last){
        java.util.Random random=new java.util.Random();
        int[] arr=new int[number];
        System.out.println("Весь массив с нечетными элементами: ");
        for (int i=0; i<arr.length;i++){
            arr[i]=random.nextInt(max);
            if(arr[i]%2==0){
                arr[i]=arr[i]+1;
            }
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        System.out.println("Массив элементов с  "+first+ " элемента массива до "+last);
        for(int i=first-1; i<=last-1; i++){
        System.out.print(arr[i]+", ");
    }
return arr;
}
}