
// ####################Demo File#######################################
// Author: Avi
class Student{  
    var id:Int = 0;                         // All fields must be initialized  
    var name:String = null;  
}
// main method
object MainObject{  
    def main(args:Array[String]){  
        var s = new Student()               // Creating an object  
        println(s.id+" "+s.name);  
    }  
} 
