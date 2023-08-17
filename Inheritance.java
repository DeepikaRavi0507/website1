import java.util.Scanner;




public class Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select a Branch");
        System.out.println("1. Chennai \t 2.Mumbai \t 3.Pune");
        String branchName = scan.nextLine();
        if (branchName.equalsIgnoreCase("chennai")) {
            HeadOffice ho = new Chennai1();
            ho.registration();
            ho.proofVerification();

        }
        if (branchName.equalsIgnoreCase("mumbai")) {
            HeadOffice ho1 = new Mumbai1();
            ho1.registration();
            ho1.proofVerification();
        }
        if (branchName.equalsIgnoreCase("pune")) {
            HeadOffice ho2 = new Pune1();
            ho2.registration();
            ho2.proofVerification();

        }
    }
}
