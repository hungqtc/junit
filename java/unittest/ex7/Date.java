public class  Date  {  
   
   private int day;
   private int month;
   private int year; 


   public  Date(int day, int month, int year) {
      this.day = day;
      this.month = month;
      this.year = year;     
   }
   public int getDay() {
   	return day;
   }
   public int getMonth() {
   	return month;
   }
   public int getYear() {
   	return year;
   }

  public void setDay(int day) {
    this.day = day;
    if (day < 1 && day > 31) {
      System.out.println("Sai");
    }
  }
   public void setMonth(int month) {
    this.month = month;
    if (day < 1 && day > 12) {
      System.out.println("Sai");
  }
   public void setYear(int year) {
    this.year = year;
    if (day < 1900 && day > 9999) {
      System.out.println("Sai");
  }
  public void setDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }
   
   public String toString() {
   return day + "/" + month + "/" +year ;
}
}