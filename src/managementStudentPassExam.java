import java.util.Scanner;
public class managementStudentPassExam {
    public static void main(String[] args) {
        int size;
        int[] array;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size: ");
            size = scanner.nextInt();
            if(size > 30){
                System.out.println("size should ot exceed 20!");
            }
        }while(size > 30);

        array = new int[size];
        int i = 0;
        while(i < array.length){
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        // show array
        int count = 0;
        for(int j = 0; j < array.length; j++){
            if(array[j] >= 5 && array[j] <= 10){
                count++;
            }
        }
        System.out.println("\n The number of students passing the exam is " + count);
    }
}
