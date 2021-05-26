object MainObject{
    def main(args: Array[String]){
        for(i:Int <- 1 to 10){
            print(s"$i ")
        }
        println()
        for(i <- 1 until 10){
            print(s"$i ")
        }
    }
}