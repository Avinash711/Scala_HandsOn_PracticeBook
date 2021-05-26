abstract class Bike{  
    def run()  
}  
  
class Hero extends Bike{  
    def run(){ 
        println("running fine...")  
    }  
}  
  
object MainObject{  
    def main(args: Array[String]){  
        var h = new Hero()  
        h.run()  
    }  
}  