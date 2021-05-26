


























trait SuperTrait  
case class CaseClass1(a:Int,b:Int) extends SuperTrait  
case class CaseClass2(a:Int) extends SuperTrait         // Case class  
case object CaseObject extends SuperTrait    //case object when no argument

object MainObject{
    def caseCall(f:SuperTrait)=f match{
        case CaseClass1(f,g) => println(s"a: $f b $g\n")
        case CaseClass2(f) => println(s"a: $f \n")
        case CaseObject => println(s"no argument case object\n")
        case _ => print(s"default case")

    }
    def main(args:Array[String]){
        caseCall(CaseClass1(10, 20))
        caseCall(CaseClass2(30))
        caseCall(CaseObject)



    }
}