//inspired by args and kwargs in python

def add(args: Int*) = {  
    var sum = 0;  
    for(a <- args) sum += a  
    sum  
}  
var sum = add(1,2,3,4,5,6,7,8,9);  
println(sum);  