import java.util.Scanner;

public class problem4 {

    static void analyzeInventory(int[] sectionA, int[] sectionB) {

        int sumA = 0;
        int sumB = 0;

        int max = sectionA[0];
        String section = "Section A";
        int index = 0;

        for (int i = 0; i < sectionA.length; i++) {

            sumA += sectionA[i];
            sumB += sectionB[i];

            if (sectionA[i] > max) {
                max = sectionA[i];
                section = "Section A";
                index = i;
            }

            if (sectionB[i] > max) {
                max = sectionB[i];
                section = "Section B";
                index = i;
            }
        }

        System.out.println("Section A Total: " + sumA);
        System.out.println("Section B Total: " + sumB);

        if (sumA == sumB) {
            System.out.println("Status: Balanced");
        } else {
            System.out.println("Status: Not Balanced");
        }

        System.out.println(
                "Highest Quantity: " + max +
                        " (" + section + ", Item " + (index + 1) + ")"
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] sectionA = new int[n];
        int[] sectionB = new int[n];

        System.out.println("Enter Section A quantities:");
        for (int i = 0; i < n; i++) {
            sectionA[i] = sc.nextInt();
        }

        System.out.println("Enter Section B quantities:");
        for (int i = 0; i < n; i++) {
            sectionB[i] = sc.nextInt();
        }

        analyzeInventory(sectionA, sectionB);

        sc.close();
    }
}