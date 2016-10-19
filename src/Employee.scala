trait Employee {
  val name:String
  val title:String
  override def toString: String = s"My name is: $name ($title)"
}

class Manager(val name: String) extends Employee {
  val title = "Mgr"
}

class Worker(val name: String) extends Employee {
  val title = "Worker"
}

object createEmployees {
  def main(args: Array[String]) {

    def prompt(s: String) = {println(s);io.StdIn.readLine()}

    val employee1 = new Manager("Sam")
    val employee2 = new Worker("Jennifer")
    val employee3 = new Manager("Addison")
    val employee4 = new Worker("Jackson")

    val employees: List[Employee] = List(employee1,employee2,employee3,employee4)
    val userInput = prompt("Please enter either [Mgr] to see a list of managers or [Worker] to see a list of workers ")

    def returnEmployeesByType (s:String) = {
      val employeesByType = employees.filter(_.title.equalsIgnoreCase(s))
      val employeeMap = employeesByType.map(i => i.name -> i.toString).toMap
      employeeMap.map(x => println(s"${x._2}"))
      ""
    }
    returnEmployeesByType(userInput)
  }
}





