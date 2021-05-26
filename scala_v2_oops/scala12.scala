class Company{
    var bonus: Float = 5000.0f
}
class Employee extends Company{
    var salary:Float = 10000.0f
    println(salary+ " " + bonus)
    
}
object MainObject{
    def main(args:Array[String]){
        new Employee()

    }
}