object Global{
    def show(){
        print("This is global function")
    }
}
object MainObject3{
    def main(args: Array[String]){
        Global.show()

    }
}