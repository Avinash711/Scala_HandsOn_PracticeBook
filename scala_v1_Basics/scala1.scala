// demo class scala practice set
object Demo{
    val name:String = "Scala coder"
    var count:Int = 0
    def scalaFunctional{
        println(s"Function approach is simmillar to python: $name")
    }
    def main(args:Array[String]){
        scalaFunctional
        print(name + count + count.getClass)
    }
}
