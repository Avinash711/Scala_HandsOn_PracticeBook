object MainObject{
    def multiplyBy2(x:Int):Int = {
        x*2
    }
    def decorator(a:Int, f:Int=>AnyVal):Unit={
        println(f(a))
    }
    def main(args:Array[String]){
        decorator(2, multiplyBy2)


    }
}