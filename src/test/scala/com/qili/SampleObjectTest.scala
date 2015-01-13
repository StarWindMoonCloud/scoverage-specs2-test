package com.qili

import com.qili.SampleObject.Format
import org.specs2.mutable.Specification

/**
 * Created by qili on 1/13/15.
 */
class SampleObjectTest extends Specification {
  "test SampleObject" should {
    "test Format" in {
      Format.JSON mustEqual "json"
      Format.PROTOBUF mustEqual "protobuf"
    }
  }
}
