public class Policy {
   private int policyNum;
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String smokingStatus;
   private double holderHeight;
   private double holderWeight;
   
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
     
     public int getPolicyNum() {
      return policyNum;
     }
     
     public String getProviderName() {
      return providerName;
     }
     
     public String getHolderFirstName() {
      return holderFirstName;
     }
     
     public String getHolderLastName() {
      return holderLastName;
     }
     
     public int getHolderAge() {
      return holderAge;
     }
     
     public String getSmokingStatus() {
      return smokingStatus;
     }
     
     public double getHolderHeight() {
      return holderHeight;
     }
     
     public double getHolderWeight() {
      return holderWeight;
     }
     
     
     public void setPolicyNum(int policyNum) {
      this.policyNum = policyNum;
     }
     
     public void setProviderAge(String providerName) {
      this.providerName = providerName;
     }
     
     public void setHolderFirstName(String holderFirstName) {
      this.holderFirstName = holderFirstName;
     }
     
     public void setHolderLastName(String holderLastName) {
      this.holderLastName = holderLastName;
     }
     
     public void setHolderAge(int holderAge) {
      this.holderAge = holderAge;
     }
     
     public void setSmokingStatus(String smokingStatus) {
      this.smokingStatus = smokingStatus;
     }
     
     public void setHolderHeight(double holderHeight) {
      this.holderHeight = holderHeight;
     }
     
     public void setHolderWeight(double holderWeight) {
      this.holderWeight = holderWeight;
     }
     
     
     public double calculateBMI() {
      if(holderHeight == 0) return 0;
      return(holderWeight * 703) / (holderHeight * holderHeight);
     }
     
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