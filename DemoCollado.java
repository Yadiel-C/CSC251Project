import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class DemoCollado {
   public static void main(String[] args) throws Exception{
      
   ArrayList<Policy> policies = new ArrayList<Policy>();
   File file = new File("PolicyInformation.txt");
   Scanner inputFile = new Scanner(file);
   int smokerCount = 0;
   int nonSmokerCount = 0;
  
   while(inputFile.hasNext()) {
      int policyNum = inputFile.nextInt();
      inputFile.nextLine();
      String providerName = inputFile.nextLine();
      String firstName = inputFile.nextLine();
      String lastName = inputFile.nextLine();
      int age = inputFile.nextInt();
      inputFile.nextLine();
      String smokingStatus = inputFile.nextLine();
      double height = inputFile.nextDouble();
      inputFile.nextLine();
      double weight = inputFile.nextDouble();
      inputFile.nextLine();
   
      policies.add(new Policy(policyNum, providerName, firstName, lastName, age, smokingStatus, height, weight));
   }
   inputFile.close();
  
   for(int i=0; i<policies.size(); i++) {
      System.out.println("Policy Number: " + policies.get(i).getPolicyNum());
      System.out.println("Provider Name: " + policies.get(i).getProviderName());
      System.out.println("Policyholder's First Name: " + policies.get(i).getHolderFirstName());
      System.out.println("Policyholder's Last Name: " + policies.get(i).getHolderLastName());
      System.out.println("Policyholder's Age: " + policies.get(i).getHolderAge());
      System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policies.get(i).getSmokingStatus());
      System.out.printf("Policyholder's Height: %.1f inches%n", policies.get(i).getHolderHeight());
      System.out.printf("Policyholder's Weight: %.1f pounds%n", policies.get(i).getHolderWeight());
      System.out.printf("Policyholder's BMI: %.2f%n", policies.get(i).calculateBMI());
      System.out.printf("Policy Price: $%.2f%n", policies.get(i).calculatePrice());
      System.out.println();
      
      if(policies.get(i).getSmokingStatus().equalsIgnoreCase("smoker"))
         smokerCount++;
        else
         nonSmokerCount++;
     }
     System.out.println("The number of policies with a smoker is: " + smokerCount);
     System.out.println("The number of non-smoker is: " + nonSmokerCount);
    }
   }
  