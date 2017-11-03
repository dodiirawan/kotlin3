import dodi.github.Person

/**
 * Created by dodi on 02/11/17.
 */
fun main(x:Array<String>) {
    println("Hello Kotlin")
    var d = `2Alien`()
    d.name = "Dodi Irawan"
    println("Name is : " + d.name)
    println("Name 2 is : ${d.name}")

    println("Address : ${d.address}")

    var g = Person()
    g.gender = "Laki-Laki"
    println("Jenis Kelamin : ${g.gender}")
}