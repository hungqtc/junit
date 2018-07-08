public class SimCircle {  
   
   private double radius;
   
   
 
   public SimCircle() {
      radius = 1.0;
   }
   
   
   public SimCircle(double radius) {
      this.radius = radius;
      
   }   
   
   public double getRadius() {
     return radius; 
   }

    public void setRadius(double radius) {
     this.radius = radius;
   }

   public double getCircumference() {
     return Math.PI;
   }
   
   public double getArea() {
      return radius*radius*Math.PI;
   }

   public String toString() {
   return "Circle[radius=" + radius + "]";
}
}