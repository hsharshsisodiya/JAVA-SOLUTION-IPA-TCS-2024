import java.util.*;
public class Ipa40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] car = new Car[4];
        for (int i = 0; i < car.length; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();

            car[i] = new Car(a,b,c,d);
        }
        String make = sc.nextLine();
        String model = sc.nextLine();
        Car res1 = findMostExpensiveCar(car);
        if(res1 == null)
        System.out.println("Sorry - No car is available");
        else{
            System.out.println(res1.getMake());
            System.out.println(res1.getModel());
            System.out.println(res1.getPrice());
            System.out.println(res1.getYear());
        }

        Car res2 = getCarByMakeAndModel(car, make, model);
        if(res2 == null)
        System.out.println("Sorry - No car is available");
        else{
            System.out.println(res2.getYear());
            System.out.println(res2.getPrice());
        }
    }
    public static Car getCarByMakeAndModel(Car []arr,String make, String model){
        for(int i=0;i<arr.length;i++){
            if(arr[i].getMake().equalsIgnoreCase(make) && arr[i].getModel().equalsIgnoreCase(model)){
                return arr[i];
            }
        }
        return null;
    }
    public static Car findMostExpensiveCar(Car []arr){
        double high = 0;
        Car highPrice = null;
        for(int i=0;i<arr.length;i++){
            if(high < arr[i].getPrice()){
                high = arr[i].getPrice();
                highPrice = arr[i];
            }
        }
        return highPrice;
    }
}
class Car
{
    private String make;
    private String model;
    private int year;
    private double price;
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}