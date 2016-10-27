/**
  * Created by joe on 10/19/16.
  */

object ScalaTraits {

  trait Employee {
    val name: String
    val title: String
    override def toString: String = s"My name is: ${name} (${title})"
  }

  class Worker(val name: String, val title: String) extends Employee{
    def this(m: String) = this(m, "Wkr")
  }

  class Manager(val name: String, val title: String) extends Employee{
    def this(m: String) = this(m, "Mgr")
  }

  def main(args: Array[String]): Unit = {

    val list = List(new Worker("John"), new Manager("Bob"), new Manager("Alice"))
    val employeeMap = list.map(employee => employee.name -> employee.toString).toMap
    employeeMap.foreach(employee => println(employee._2))
  }
}
