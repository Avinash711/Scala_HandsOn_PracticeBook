class Constructor(id:Int){
    def this(id:Int, name:String)={
        this(id)
        println(id+ " "+ name)
    }
    def show(){
        println(id)
    }
    //println(id)
}
object MainObject{
    def main(args:Array[String]){
        var obj=  new Constructor(100).show()
        new Constructor(101, "Avinash")

    }
}