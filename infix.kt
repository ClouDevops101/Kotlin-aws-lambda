fun main() {

  infix fun Int.times(str: String) = str.repeat(this)        //  Repeat it 10 time
  println( 10 times "Hello world ")                  

}
