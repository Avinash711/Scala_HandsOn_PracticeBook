object MainObject{
    def main(args:Array[String]){
        var arr = new Array[Int](10)
        for(i<- 0 until arr.length){
            arr(i) = i
        }
        println(arr.mkString(""))
    }
}