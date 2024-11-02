package time;

import java.util.Scanner;

public class TimeConverter {
    public static void convertTime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select conversion type:");
        System.out.println("1. Hours to Minutes\n2. Hours to Seconds\n3. Minutes to Hours\n4. Seconds to Hours");
        int choice = sc.nextInt();
        System.out.print("Enter the time: ");
        double time = sc.nextDouble();
        double result = 0;

        switch (choice) {
            case 1: result = time * 60; break;    // Hours to Minutes
            case 2: result = time * 3600; break;  // Hours to Seconds
            case 3: result = time / 60; break;    // Minutes to Hours
            case 4: result = time / 3600; break;  // Seconds to Hours
            default: System.out.println("Invalid choice."); return;
        }
        System.out.println("Converted time: " + result);
    }
}
