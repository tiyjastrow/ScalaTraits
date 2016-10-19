/**
  * Created by joshuakeough on 10/19/16.
  */
trait EmployeeTrait {
  val name: String
  val title: String

  override def toString: String = s"My name is: $name $title"

  def worker() = {
    println(s"My name is $name $title")
  }
}

class Manager(val name:String) extends EmployeeTrait {
  val title = "Manager"
}

class Worker(val name: String) extends EmployeeTrait {
  val title = "Worker"
}
