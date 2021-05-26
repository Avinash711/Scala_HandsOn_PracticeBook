trait Printable{  
    def print()  
}  
  
abstract class Showable{  
    def show()  
}  
  
class A6 extends Showable with Printable{            // First one is abstract class second one is trait  
    def print(){                                        // Trait print  
        println("print sheet")  
    }  
    def show(){                                      // Abstract class printA4  
        println("Print A4 Sheet")  
    }  
}  
  
object MainObject{  
    def main(args:Array[String]){  
        var a = new A6()  
        a.print()  
        a.show()  
    }  
}  