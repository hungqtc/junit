package hung.java.ex8;
public class  Time  {  
   
   private int hour;
   private int minute;
   private int second; 


   public  Time(int hour, int minute, int second) {
      this.hour = hour;
      this.minute = minute;
      this.second = second;     
   }
   public int getHour() {
   	return hour;
   }
   public int getMinute() {
   	return minute;
   }
   public int getSecond() {
   	return second;
   }

  public void setHour(int hour) {
    this.hour = hour;
    if (hour < 0 && hour > 23) {
      System.out.println("Sai");
    }
  }
   public void setMinute(int minute) {
    this.minute = minute;
    if (minute < 0 && minute > 59) {
      System.out.println("Sai");
  }
}
   public void setSecond(int second) {
    this.second = second;
    if (second < 0 && second > 59) {
      System.out.println("Sai");
  }
}
  public void setTime(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }
  public Time nextSecond (){
    this.second++;
    return this;
  }
  public String toString() {
   return hour + "/" + minute + "/" +second ;
}

}