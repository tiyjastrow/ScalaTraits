/**
  * Created by Zach on 10/19/16.
  */
object Main {

  def main(args: Array[String]): Unit = {

    val mgr = new Manager("Sam")
    val wkr = new Worker("Zach")
    val wkr2 = new Worker("Jim")

    val employeeList = List[Employee](wkr, wkr2, mgr)

    val employeeMap = employeeList.map(i => i.name -> i.toString).toMap

    employeeMap.foreach(emp => println(emp._2))
  }
}

trait Employee {
  val name: String
  val title: String
  override def toString: String = s"My name is: $name ($title)."
}

class Manager(val name: String) extends Employee {
  override val title: String = "mgr"
}

class Worker(val name: String) extends Employee {
 override val title: String = "wkr"
}