// abstract class
abstract class Bike{  
    def run()  
}  

// class extends 
class Hero extends Bike{  
    def run(){ 
        println("running fine...")  
    }  
}  

// main method
object MainObject{  
    def main(args: Array[String]){  
        var h = new Hero()  
        h.run()  
    }  
}  
