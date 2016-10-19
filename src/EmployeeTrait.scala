/**
  * Created by joe on 10/19/16.
  */
trait EmployeeTrait {
  var name: String
  var title: String
  override def toString: String = s"My name is ${name} and I am a (${title})"
}

class Worker extends EmployeeTrait{
  override val name: String = s"${name}"
  val title: String = "Wkr"
}

class Manager extends EmployeeTrait{
  override val name: String = s"${name}"
  val title: String = "Mgr"
}
