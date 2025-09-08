package frontend

import org.scalajs.dom
import typings.capacitorApp.mod.App as CapacitorApp
import scala.util.Failure
import scala.util.Success
import scalatags.JsDom.all._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.scalajs.js.annotation.JSExportTopLevel
import shared.helloWorld

object Main extends App {
  // helloWorld

  @JSExportTopLevel("main")
  def main(): Unit = {
    CapacitorApp.getInfo().toFuture.onComplete {
      case Failure(exception) =>
        println(exception)
      case Success(value) =>
        println(value.build)
    }

    dom.document.body.appendChild {
      div(color.red)("hello world").render
    }
  }
}
