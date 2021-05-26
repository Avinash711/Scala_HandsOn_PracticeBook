object MainObject{
    def func(a:Int=1, b:Int=1, c:Int=1, d:Int)={
        a+b+c
    }
    def main(args:Array[String]){
        val res1 = func(d=1);
        val res2 = func(a=2,b=3,c=4,1)
        val res3 = func(2,2,3,1)
        print(s"$res1 $res2 $res3")

    }
}