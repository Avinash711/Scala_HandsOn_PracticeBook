object MainObject {  
   def main(args: Array[String]) {  
        search ("Hello")   
    }  
    def search (a:Any):Any = a match{  
        case 1  => println("One")  
        case "Two" => println("Two")  
        case "Hello" => println("Hello")  
        case _ => println("No")  
              
        }  
}  