object MainObject{
    def main(args:Array[String]){
        var option = 1
        option match{
            case 1 => print("One")
            case 2 => print("two")
            case _ => print("default when no match")
        }
    }
}