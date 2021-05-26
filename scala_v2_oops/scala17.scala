class Vehicle{  
     final def show(){  
         println("vehicle is running")  
     }  
}  
class Bike extends Vehicle{  
   //override val speed:Int = 100  
    override def show(){  
        println("bike is running")  
    }  
}  
object MainObject{  
    def main(args:Array[String]){  
        var b = new Bike()  
        b.show()  
    }  
}  