object MainObject{
    def func(name:String, id:Int) = {
        var result = List(name, id)
        result
    }
    def main(args: Array[String]){
        var res = func("Avinash Gaurav", 10019)
        println(res)
        for(data <- res){
            print(data+ " ")
        }

    }
}