class Vehicle{  
     val speed:Int = 60  
  
}  
class Bike extends Vehicle{  
   override val speed:Int = 100     // Override keyword  only val is overriden
    def show(){  
        println(speed)  
    }  
}  
object MainObject{  
    def main(args:Array[String]){  
        var b = new Bike()  
        b.show()  
    }  
}  