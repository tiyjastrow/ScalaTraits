import scala.collection.mutable.ListBuffer
import scala.collection.mutable

object ScalaTraits {

  trait Employee {
    val name: String
    val title: String

    override def toString: String = s"My name is: $name($title)."

  }

  class Manager(n: String) extends Employee {
    override val name: String = n
    val title: String = "Mgr"

  }

  class Worker(n: String) extends Employee {
    override val name: String = n
    val title: String = "Wkr"

  }

  def main(args: Array[String]): Unit = {

    val wkr = new Worker("Bob")
    val wkr2 = new Worker("Helen")
    val mgr = new Manager("Frank")

    val employeeList = List(wkr, wkr2, mgr)
    val employeeMap = employeeList.map(i => i.name -> i.toString).toMap

    employeeMap.foreach(x => println((x._2)))


  }

}
