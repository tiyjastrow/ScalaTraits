import scala.collection.immutable.HashMap.HashMap1

/**
  * Created by joshuakeough on 10/19/16.
  */
object ScalaTraits {
  def main(args: Array[String]): Unit = {
    val wrkr = new Worker("Josh")
    val mngr = new Manager("James")
    val wrkr2 = new Worker("Joe")

    val workerList = List(wrkr, mngr, wrkr2)
    val workerMap = workerList.map(i => i.name -> i.toString).toMap

    workerMap.foreach(x => println(x._2)+"\n")




  }

}
