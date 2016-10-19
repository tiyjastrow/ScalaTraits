trait EmployeeTrait {
  val name: String; val title: String
  override def toString: String = s"Hi my name is : ${name} (${title})"}

class Manager(val name : String) extends EmployeeTrait {val title = "Mgr"}

class Worker(val name: String) extends EmployeeTrait {val title = "Wkr"}

object Employee {
  def main(args: Array[String]): Unit = {
    def prompt (s: String) = {println(s); io.StdIn.readLine()}
    val wrk1 = new Worker("Wes")
    val wrk2 = new Worker("Stevie")
    val man = new Manager("Janelle")

    val employeeList = List(wrk1, wrk2, man)

    val input = prompt("Search for Managers(Mgr) or Workers(Wkr)")
    def search(input: String) = {
      val employeeListOutput = employeeList.filter(_.title.equalsIgnoreCase(input))
      val employeeMap = employeeListOutput.map(x => x.name -> x.toString).toMap
      employeeMap.foreach(x => println(x._2))
    }
    search(input)
  }
}
