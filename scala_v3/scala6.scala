class ExceptionExample{  
    def divide(a:Int, b:Int) = {  
        try{  
            a/b  
            var arr = Array(1,2)  
            arr(10)  
        }catch{  
            case e: ArithmeticException => println(e)  
            case ex: Throwable =>println("found an unknown exception"+ ex)  
        }  
        println("Rest of the code is executing...")  
    }  
}  
object MainObject{  
    def main(args:Array[String]){  
        var e = new ExceptionExample()  
        e.divide(100,10)  
   
    }  
}