import java.util.Scanner;

public class Project_Yadiel_Collado {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Please enter the Policy Number: ");
      int policyNum = scanner.nextInt();
      scanner.nextLine();
      
      System.out.print("Please enter the Providers Name: ");
      String providerName = scanner.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      String holderFirstName = scanner.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      String holderLastName = scanner.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      int holderAge = scanner.nextInt();
      scanner.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      String smokingStatus = scanner.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      double holderHeight = scanner.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      double holderWeight = scanner.nextDouble();
      
      
      Policy policy = new Policy(policyNum, providerName, holderFirstName, holderLastName, holderAge, smokingStatus, holderHeight, holderWeight);
      
      System.out.println("Policy Number: " + policy.getPolicyNum());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getHolderFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getHolderLastName());
      System.out.println("Policyholder's Age: " + policy.getHolderAge());
      System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policy.getSmokingStatus());
      System.out.printf("Policyholder's Height: %.1f%n", + policy.getHolderHeight());
      System.out.printf("Policyholder's Weight: %.1f%n", + policy.getHolderWeight());
      System.out.printf("Policyholder's BMI: %.2f%n", + policy.calculateBMI());
      System.out.printf("Policy Price: $%.2f%n", + policy.calculatePrice());
      
      scanner.close();
     }
    }