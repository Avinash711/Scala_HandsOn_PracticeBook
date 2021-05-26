class Global{
    def show(){
        println("This is companion class")
    }
}
object Global{
    def show(){
        println("This is global companion method")
    }
}
object MainObject{
    def main(args: Array[String]){
        var obj = new Global()
        obj.show()
        Global.show()

    }
}