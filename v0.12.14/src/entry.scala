import db.*

enum Test {
  case A, B
}

@main()
def entry = {
  val a = Some("hello").map(_.nonEmpty).getOrElse(false)
  println("hello world")
}
