fun main() {
val human= Human("Angela",24,60)
    human.eat(4)
    human.weight
    println(human.weight)
    human.speak("ma-ma-ma")
    human.birthday()
    println(human.age)
    val myUser= User("Angela","Adisa","ambengeangela@gmail.com","0713030706","adisa2023!")
    println(myUser.email)
    println(myUser.lastName)

}

class Human(var name:String, var age:Int, var weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        weight+=foodWeight
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
    age++
    }

}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String)