fun main(){
school()
   var h= sentence("julie",19)
    println(h)
    g()
    s()
}
fun school(){
    var name= "Dodoma"
    var n= name[1].toString()+name[3]+name[4]
    println(n)

}
fun sentence(name: String, age: Int): String{
    var j="Hi, my name is $name and i am $age years old"
    return j
}

fun g():Int{
    var j= "rehema"
    var m=j.length
    return m

}
fun s(){
    var name1 = "juliet"
    if (name1 == "juliet") {
        println("That me!")
    }
      else{
          println("i don't know who that is")

        }
