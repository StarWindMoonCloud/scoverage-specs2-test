package com.qili

/**
 * Created by qili on 11/21/14.
 */
import org.specs2.mutable._
class SampleTest extends Specification {
  val instance = new Sample
  "test sample" should {
    "test print" in {
      instance.print("test input")
      true
    }
  }
}

trait clean extends After {
  def cleanAction() = {
    println("clean action")
  }
  def after = cleanAction()
}