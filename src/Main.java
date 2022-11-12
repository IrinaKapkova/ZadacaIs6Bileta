
public class Main {
    public static void main(String[] args) {
        partRandomArrayElements(15, 100, 3, 7);
    }

    public static int[] partRandomArrayElements(int number, int max, int first, int last) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[number];
        System.out.println("Весь массив с нечетными элементами: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(max);
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] + 1;
            }
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.println("Массив с " + first + " по " + last + " элемент массива:");
        for (int i = first; i <= last; i++) {
            System.out.print(arr[i] + ", ");
        }
        return arr;
    }
}