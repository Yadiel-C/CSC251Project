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
   int noneSmokerCount = 0;
  
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
      
      PolicyHolder holder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
      policies.add(new Policy(policyNum, providerName, holder));
     }
   inputFile.close();
  
   for(int i=0; i<policies.size(); i++) {
      System.out.println(policies.get(i));
      System.out.println();
      
      if(policies.get(i).getHolder().getSmokingStatus().equalsIgnoreCase("smoker"))
         smokerCount++;
        else
         noneSmokerCount++;
        }
        
     System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created");
     System.out.println("The number of policies with a smoker is: " + smokerCount);
     System.out.println("The number of non-smoker is: " + noneSmokerCount);
    }
   }
  