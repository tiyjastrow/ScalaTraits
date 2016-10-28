import com.sun.tools.javac.comp.Annotate.Worker

import scala.collection.immutable.HashMap
import scala.collection.mutable

/**
  * Created by jakefroeb on 10/28/16.
  */
trait Employee {
  val name : String
  val title : String

  override def toString: String = s"My name is :$name ($title)"

}
class Manager(n : String) extends Employee{
  override val name: String = n
  override val title: String = "Mgr"
}

class Worker(n: String) extends Employee{
  override val name: String = n
  override val title: String = "Wkr"
}

object Main{
  def main(args: Array[String]): Unit = {
    var employeeList = List[Employee](new Worker("joe"),new Manager("josh"), new Worker("jake"))

    var employeeHash = employeeList.map(i=>i.name ->i.toString).toMap
    employeeHash.foreach(e => println(e._2))

    }
  }
