
fun main () {

/*



//TODO-1: if...else loop in kotlin


    val a = 1
    val b = 2
    val c = 3

    // used when we want to execute according to some condition
    // only runs once

    if (b>c /* condition */ ){
        println("b is greater than c ")
    }
    else if (a >c){
        println("a is greater than c ")
    }
    else {
        println("c is greatest ")
    }

    val time = 12
    val greeting = if (time < 18) "Good day. " else "Good evening. "
    /* above example shows that the if...else block can also be used for assigning value to the variable
      its a shorhand for if...else block   */
    println(greeting)



//TODO-2: when loop in kotlin


    // when
    val day = 7
    val result = when (day) { // day is used in condition checking
      //  condition -> (code if condition comes true  )
        1-> "sunday"
        2-> "monday"
        3-> "tuesday"
        4-> "wednesday"
        5-> "thursday"
        6-> "friday"
        7-> "saturday"
        else -> "invalid number given" // else is mandatory, its executed WHEN all the condition fails s
    }
    // example of 'when' WHEN we use it as value to assign to some variable

    print(result)

    val dayInString = "Saturday"

    when (dayInString) {
     //  condition -> ( code for the condition )
        "Sunday"-> println(" dw, its sunday")
        "Monday"-> println("Party's over, get up do some work ")
        "Tuesday"-> println("its only been 3 days since weekends")
        "Wednesday"-> println(" work you dummy ")
        "Thursday"-> println(" work , tomorrow is friday ")
        "Friday"-> println(" yay, you made it through a whole week")
        "Saturday"-> println(" ready to party again ??")

    }
    // simple 'when' block



//TODO-3: while & do...while loop in kotlin

    // while
    var i = 0
    while (i<10){           // loops runs for i less than 10
        println(i)
        i++                 // short-hand for i = i+1

    }
    print("\n \n \n \n \n ") // for new lines


    // do...while
     var j = 0
    do {
        println(j)
        j++
    } while (j<10)

    print("\n \n \n \n \n ")

    // break
    var k  = 0
    while (k <10){
        if (k == 5){
            k++
            continue
        }
        println(k)
        k++
    }

    print("\n \n \n \n \n ")

    // break
    var m  = 0
    while (m <10){
        if (m == 5) {
            m++
            continue
        }
        println(m)
        m++
    }




    //TODO-4: array and for loop in kotlin

    val array1 = arrayOf("yasier", 12, true, null, 12.34f, 1223455L, "istrue_exist") // we can have different data types

    for ( array in array1){
        println(array)
    }

    println(array1.size)
    println(array1[5])

    if(null in array1){
        println(" null exist in array1")
    }



    //TODO-5:range is kotlin

    // kinda similar to for loop

    for ( t in 1..5){  // t ranges from 1 to 5 (both included )
        println(12)
    }

    for ( a in 'a'..'z'){ // a ranges from "a" to "z"
        println(a)
    }



*/


    //TODO-6:function in kotlin

    // function is a reusable code that helps use code faster
    /*    fun functionName(arguments/parameter){
           code goes here
          }         */



    fun hello(){                // function with no argument
        println("hello")
    }
    hello()


    fun yourNamePlease(name: String,age: Int, Salary: Long ){    // function with argument
        println(" $name , $age years old makes a whooping $$Salary per month")
    }
    yourNamePlease("mark Zuckerberg", 31, 12233434343)
    yourNamePlease("bill gates", 63, 432432443422)
    yourNamePlease("elon musk", 44, 8776634234)


    fun name(name:String) =  println("hello $name")  // shorthand for creating function
    name("yasier")
}



