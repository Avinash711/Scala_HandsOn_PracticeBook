object MainObject {  
    def add2(a:Int, b:Int) = {  
        a+
        b  
    }  
    def add3(a:Int, b:Int) = {  
        (a  
        +b)  
    }  
    def main(args: Array[String]) = {  
        var result2 = add2(10,10)  
        var result3 = add3(10,10)  
        println(result2+"\n"+result3)  
    }  
}  