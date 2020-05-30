object Hello extends App {

  println("Merhaba, Dünya! Bu benim ilk Scala kodum")

  var num1: Int = 8          //> num: Int = 8
  var num2: Int = 7          //> num: Int = 7

  //> in Scala we don't need semicolon!

  println(num1 + num2)        //> 15

  num1 = 23                   // we can update value but

  val num3: Int = 3
  num3 = 27                   // It will cause an error because val = final int in Java.


  var result = num1 + num2    // result :Int = 30 -> In Scala,  everything is object. So there, "+" is not operator it is a method. (def)
  var result2 = num1.+(num2)  // result2 :Int = 15 because 8 is an object and (7) is a parameter.

}
object DemoClass{
  case class Student(var rollNo: Int =1, var name: String ="Nida", var marks: Int=90){   //It is a class with constructors
    def show() =              // It is a method
      println("Merhabaa")

    def >(s2: Student): Boolean = marks > s2.marks  //It is also a method

    /* Creating student object */

  var s1= Student()
  var s2= Student(4,"Mehmet", 80)
  var s3= Student(3)          // It becomes rollNo:3, name:Nida, marks:90

  s1.show()                   // Merhabaa
  s1.>(s2)                    // true


}
  object Demo{
     var nums = List(4,7,2,3)      //> nums : List[Int] = List(4,7,2,3)

    for(n <- nums) println(n)            //> 4 7 2 3   -> for loop

    nums.foreach {i:Int => println(i)}    //> lambda expression

    nums.foreach {i:Int => println(i)}

    /* reverse the list */
    var reverseNumbers = nums.reverse


    var smtg = List(7,8, "Nida", false)   //> smtg: List[Any] = List(7,8,false don't need for create list as object.)


  }
case class Studen(rollNo: Int, Name: String, Marks: Int)

  val studenList = List(Studen(2,"Nida", 60), Studen(1,"Ceyda", 70))

  /*val first gives first element of studenList*/
  val first = studenList.head


  /*val rest gives us all the other elements except head element*/
  val rest = studenList.tail

  /*with tail.tail gives us last element for this list*/
  val last  = studenList.tail.tail

  /*which gives us middle element for this list*/
  val middle = studenList.tail.head

  /*function that show us mark is greater or equal than 80*/
  val toppers = studenList.filter(s => s.Marks >= 80)

}
