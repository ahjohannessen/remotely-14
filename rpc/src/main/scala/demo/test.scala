package demo

import remotely.Field._
import remotely.{Type, Protocol}
import remotely.codecs._
import shapeless.{HNil, ::}

object test {

  val protocol: Protocol[Int :: HNil] = Protocol.empty.codec[Int].specify1("test", strict[Int]("in1"), Type[Int])

}
