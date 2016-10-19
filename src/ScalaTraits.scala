import scala.collection.mutable

/**
  * Created by lee on 10/19/16.
  */
object ScalaTraits {

  trait Employee {
    val name: String
    val title: String
    override def toString: String = s"My name is: $name, $title."
  }

  class Worker (val name: String, val title: String) extends Employee {
    def this(n: String) = this(n, "Wkr")
  }

  class Manager (val name: String, val title: String) extends Employee {
    def this(n: String) = this(n, "Mgr")
  }

  def main(args: Array[String]): Unit = {

    val list = List(new Worker("Dave"), new Worker("Jim"), new Manager("Ben"), new Manager("Karl"))

    val map = list.map( e => e.name -> e )

    for ((k, v) <- map) println(v)
  }
}
