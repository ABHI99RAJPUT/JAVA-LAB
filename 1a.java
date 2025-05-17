import java.util.Scanner;

class GymMembership {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to the Gym Membership Manager");
        System.out.print("Enter member name : ");
        String name=scanner.nextLine();
        System.out.print("Enter member age : ");
        int age=scanner.nextInt();
        System.out.print("Is the membership active : ");
        boolean isActive=scanner.nextBoolean();
        System.out.print("Enter membership duration in months : ");
        int duration=scanner.nextInt();
        
        double fees=duration*50;
        
        System.out.print("\n Member details ");
        System.out.print("Name : "+name);
        System.out.print("Age : "+age);
        System.out.print("Membership status : "+isActive);
        System.out.print("Fees : "+fees);
        scanner.close();
    }
}