fun main(){
   printName("Brenda")
   var result = getModulus(15, 2)
    println(result)
    var sum = getSum(3, 4, 6, 20)
    println(sum)
    printFunFact("swimming")
}
fun printName(name: String){
    println("Hello" + " " + name)
}
fun getModulus(num1:Int, num2:Int):Int {
    var modulus = num1 % num2
    return modulus
}

fun getSum(a:Int, b:Int, c:Int, d:Int):Int{
    var sum = a + b + c + d
    return sum
}

fun printFunFact(fact: String){
    println("I love" + " " + fact)
}