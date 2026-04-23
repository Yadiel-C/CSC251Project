public class Policy {
   private int policyNum;
   private String providerName;
   private PolicyHolder holder;
   private static int policyCount = 0;
   
   /* No-arg constructor that sets all fields to default values */
   public Policy() {
      policyNum = 0;
      providerName = "";
      holder = new PolicyHolder();
     }
     
     /* Constructor that sets up all the fields with the given arguments */
     /* @param policyNum the policy number */
     /* @param providerName the name of the insurance provider */
     public Policy(int policyNum, String providerName, PolicyHolder holder) {
      this.policyNum = policyNum;
      this.providerName = providerName;
      this.holder = holder;
      policyCount++;
     }
     
     /* Returns the policy number */
     /* @return policyNum */
     public int getPolicyNum() {
      return policyNum;
     }
     
     /* Returns the providers name */
     /* @return providerName */
     public String getProviderName() {
      return providerName;
     }
     
     public PolicyHolder getHolder() {
      return holder;
     }
     
     public static int getPolicyCount() {
      return policyCount;
     }
     
     //Setters
     public void setPolicyNum(int policyNum) {
      this.policyNum = policyNum;
     }
     
     public void setProviderName(String providerName) {
      this.providerName = providerName;
     }
     
     public void setHolder(PolicyHolder holder) {
      this.holder = holder;
     }

     public double calculatePrice() {
      double price = 600;
      if(holder.getAge() > 50) {
         price += 75;
        }
        if(holder.getSmokingStatus().equalsIgnoreCase("smoker")) {
         price += 100;
        }
        
        double BMI = holder.calculateBMI(); 
         if(BMI > 35) {
            price += (BMI - 35) * 20;
           }
           return price;
          }
          
          public String toString() {
            return "Policy Number: " + policyNum +
            "Provider Name: " + providerName +
            holder.toString();
         }
        }