public class Policy {
   private int policyNum;
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String smokingStatus;
   private double holderHeight;
   private double holderWeight;
   
   /* No-arg constructor that sets all fields to default values */
   public Policy() {
      policyNum = 0;
      providerName = "";
      holderFirstName = "";
      holderLastName = "";
      holderAge = 0;
      smokingStatus = "";
      holderHeight = 0.0;
      holderWeight = 0.0;
     }
     
     /* Constructor that sets up all the fields with the given arguments */
     /* @param policyNum the policy number */
     /* @param providerName the name of the insurance provider */
     /* @param holderFirstName the first name of the policyholder */
     /* @param holderLastName the last name of the policyholder */
     /* @param holderAge the age of the policyholder */
     /* @param smokingStatus the smoking status of the policyholder */
     /* @param holderHeight the height of the policyholder in inches */
     /* @param holderWeight the weight of the policyholder in pounds */
     public Policy(int policyNum, String providerName, String holderFirstName, String holderLastName, int holderAge, String smokingStatus, double holderHeight, double holderWeight) {
      this.policyNum = policyNum;
      this.providerName = providerName;
      this.holderFirstName = holderFirstName;
      this.holderLastName = holderLastName;
      this.holderAge = holderAge;
      this.smokingStatus = smokingStatus;
      this.holderHeight = holderHeight;
      this.holderWeight = holderWeight;
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
     
     /* Returns the policyholder's first name */
     /* @return holderFirstName */
     public String getHolderFirstName() {
      return holderFirstName;
     }
     
     /* Returns the policyholder's last name */
     /* @return holderLastName */
     public String getHolderLastName() {
      return holderLastName;
     }
     
     /* Returns the policyholder's age */
     /* @return holderAge */
     public int getHolderAge() {
      return holderAge;
     }
     
     /* Returns the policyholder's smoking status */
     /* @return smokingStatus */
     public String getSmokingStatus() {
      return smokingStatus;
     }
     
     /* Returns the policyholder's height in inches */
     /* @return holderHeight */
     public double getHolderHeight() {
      return holderHeight;
     }
     
     /* Returns the policyholder's weight in pounds */
     /* @return holderWeight */
     public double getHolderWeight() {
      return holderWeight;
     }
     
     
     /* Sets the policy number */
     /* @param policyNum the policy number to set */
     public void setPolicyNum(int policyNum) {
      this.policyNum = policyNum;
     }
     
     /* Sets the provider's name */
     /* @param providerName the provider name to set */
     public void setProviderAge(String providerName) {
      this.providerName = providerName;
     }
     
     /* Sets the policyholder's first name */
     /* @param holderFirstName the first name to set */
     public void setHolderFirstName(String holderFirstName) {
      this.holderFirstName = holderFirstName;
     }
     
     /* Sets the policyholder's last name */
     /* @param holderLastName the last name to set */
     public void setHolderLastName(String holderLastName) {
      this.holderLastName = holderLastName;
     }
     
     /* Sets the policyholder's age */
     /* @param holderAge the holder age to set */
     public void setHolderAge(int holderAge) {
      this.holderAge = holderAge;
     }
     
     /* Sets the policyholder's smoking status */
     /* @param smokingStatus the policyholder's smoking status to set */
     public void setSmokingStatus(String smokingStatus) {
      this.smokingStatus = smokingStatus;
     }
     
     /* Sets the policyholder's height in inches */
     /* @param holderHeight the policyholder's height to set (in inches) */
     public void setHolderHeight(double holderHeight) {
      this.holderHeight = holderHeight;
     }
     
     /* Sets the policyholder's weight in pounds */
     /* @param holderWeight the policyholder's weight to set (in pounds) */
     public void setHolderWeight(double holderWeight) {
      this.holderWeight = holderWeight;
     }
     
     
     /* Calculates and returns the BMI of the policyholder */
     /* @return the policyholder's BMI */
     public double calculateBMI() {
      if(holderHeight == 0) return 0;
      return(holderWeight * 703) / (holderHeight * holderHeight);
     }
     
     /* Calculates and returns the price of the insurance policy */
     /* @return the policyholder's price */
     public double calculatePrice() {
      double price = 600;
      if(holderAge > 50) {
         price += 75;
        }
        if(smokingStatus.equalsIgnoreCase("smoker")) {
         price += 100;
        }
        
        double BMI = calculateBMI(); 
         if(BMI > 35) {
            price += (BMI - 35) * 20;
           }
           return price;
          }
         }