package com.awesomeness

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class TestAwesome extends AnyFlatSpec with should.Matchers {

  "Awesome" should "work" in {
    assert(Awesome.square(1) == 1)
    assert(Awesome.multiple(2,3) == 6)
  }

}
