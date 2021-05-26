class Demo{
    var id:Int = 0
    var name:String = ""
}

object MainObject2{
    def main(args:Array[String]){
        var demo = new Demo()
        demo.id = 100
        demo.name = "Avinash"
        println(demo.id + " "+ demo.name)
    }
}
