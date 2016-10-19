import scala.collection.mutable

/**
  * Created by jeremypitt on 10/19/16.
  */
trait Employee {
  val name:String
  val title:String

  override def toString: String = s"My name is $name ($title)"

}

class Manager(val name: String) extends Employee {
  override val title: String = "Mgr"
}

class Worker(val name: String) extends Employee {
  override val title: String = "Wkr"
}

object doSomething {
  def main(args: Array[String]): Unit = {
    val mgr = new Manager("Jim")
    val wkr = new Worker("Bob")
    val wkr2 = new Worker("Jimbob Cooter")

    val employees = List(mgr, wkr, wkr2)
    val employeeMap = employees.map(i => i.name -> i.toString).toMap

    println(employeeMap + "\n")

    employeeMap.foreach(emp => println(emp._2))

  }
}
