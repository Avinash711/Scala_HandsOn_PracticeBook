object MainObject {  
   def main(args: Array[String]) = {  
     var result1 = (a:Int, b:Int) => a+b        // Anonymous function by using => (rocket)  
     var result2 = (_:Int)+(_:Int)              // Anonymous function by using _ (underscore) wild card  
     var result3 = (_:String)+ (_:String)
     println(result1(10,10))  
     println(result2(10,10))  
     println(result3("Avinash ", "Gaurav"))
    }  
}  