package com.kh.chap01_beforeVdafter.before.model.vo;

public class Desktop {
   
   private String brand;
   private String pCode;
   private String pName;
   private int price;
   private boolean allInOne;
   
   public Desktop() {}
   
   public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
      this.brand = brand;
      this.pCode = pCode;
      this.pName = pName;
      this.price = price;
      this.allInOne = allInOne;
      
   }
   
   public void setBrand(String brand) {
      this.brand = brand;
   }
   
   public void setpCode(String pCode) {
      this.pCode = pCode;
   }
   
   public void setpName(String pName) {
      this.pName = pName;
   }
   
   public void setPrice(int price) {
      this.price = price;
   }
   
   public void setAllInOne(boolean allInOne) {
      this.allInOne = allInOne;
   }
   
   public String getBrand() {
      return "";
   }
   
   public String getpCode() {
      return "";
   }
   
   public String getpName() {
      return "";
   }
   
   public int getPrice() {
      return 1;
   }
   
   public boolean getAllInOne() {
      return true;
   }
   
   public String information() {
      return brand+", "+pCode+", "+pName+", "+price+", "+allInOne;
   }

   

}