fun main() {
    var myhippo = Hippo()
    myhippo.eat()
    myhippo.roam()
    myhippo.makeNoise()
    myhippo.sleep()


    var mycat = Cat()
    mycat.eat()
    mycat.roam()
    mycat.makeNoise()
    mycat.sleep()
}
open class animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10


    open fun makeNoise () {
        println("The Animal is making a noise")
    }

    open fun eat (){
        println("The Animal is eating")
    }

    open fun roam (){
        println("The Animal is roam")
    }

    fun sleep(){
        println("The Animal is sleeping")
    }
}

class Hippo : animal(){
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
         println("Grunt! Grunt!")
    }

    override fun eat (){
        println("The Hippo is eating $food")
    }
}

class Cat : animal(){
    override val image = "Cat.jpg"
    override val food = "rat"
    override val habitat = "House"

    override fun makeNoise() {
         println("เหมี๋ยว! เหมี๋ยว!")
    }

    override fun eat() {
         println("the Cat is eating $food")
    }
}