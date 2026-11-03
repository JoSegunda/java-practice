import java.util.Scanner;

class Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        int max = Integer.parseInt(sc.nextLine().trim()); 
        int j;
        for(int i = 0; i < n-1; i++)
        {
            j = Integer.parseInt(sc.nextLine().trim());

            if (j > max) max = j;
        }

        System.out.println("Largest: " + max);

        sc.close();
    }
}
