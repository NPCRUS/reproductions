package utils

import utest.*

class CustomFramework extends utest.runner.Framework {

  override def setup(): Unit = {
    println("SETTING UP FRAMEWORK")
  }

  override def teardown(): Unit = {
    println("TEARDOWN")
  }
}
