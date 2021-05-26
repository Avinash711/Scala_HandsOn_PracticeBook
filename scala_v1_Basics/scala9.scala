import scala.util.control.Breaks._
object MainObject{
    def main(args: Array[String]){
        val lis = List(1,2,3,4,5,100,100,8)
        breakable{
             for (i<-0 until lis.length by 2){ // by eq i+=2
                print(lis(i)+ " ")
                if(lis(i) == 100){
                    break
                }
            }

        }
       
    }

}