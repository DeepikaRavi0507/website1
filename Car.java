public abstract class Car {
    abstract void accelerate();
}
//concrete class
class Suzuki extends Car{
    void accelerate(){
        System.out.println("Suzuki::accelerate");

    }
}
class Major{
    public static void main(String args[]){
        Car obj = new Suzuki();    //Car object =>contents of Suzuki
        obj.accelerate();          //call the method
    }

}
