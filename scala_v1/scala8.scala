
object MainObject {  
   def main(args: Array[String]) {  
        var result = for( a <- 1 to 10) yield a  
        println(s"$result is and type is ${result.getClass}")
        for(i<- 0 until result.length){  
            print(s"index is $i and element is: ${result(i)}\n")  
        }  
        var list = List(1,2,3,4,5,6,7,8)
        for(ele<- list){
            print(ele+ " ")
        }
   }  
} 