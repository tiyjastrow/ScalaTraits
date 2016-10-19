/**
  * Created by joe on 10/19/16.
  */
trait EmployeeTrait {
  var name: String
  var title: String
}

class Employee extends EmployeeTrait{
  override val name: String = s"${name}"
  val title: String = s"${title}"
}

class Manager extends EmployeeTrait{
  override val name: String = s"${name}"
  val title: String = s"${title}"
}
