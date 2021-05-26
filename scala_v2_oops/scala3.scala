class DemoConstructor(id:Int,name:String ){
    def show(){
        print(id + " "+ name)
    }
}

object MainObject3{
    def main(args: Array[String]){
        var obj = new DemoConstructor(101, "Avinash gaurav")
        obj.show()

    }
}
