package io.maslick.scalala

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.{GetMapping, RestController}

object HelloScala {
  def main(args: Array[String]) : Unit = SpringApplication.run(classOf[HelloScala], args :_ *)
}

@SpringBootApplication
class HelloScala {}


@RestController
class Contra {

  @GetMapping(name = "hello", produces = Array(MediaType.APPLICATION_JSON_VALUE))
  def asd(): String = "{\"hello\": \"world\"}"

}


class FooApi {
  def getFromApi(): String = {
    println("connecting to API...")
    Thread.sleep(2000)
    "OK"
  }
}

trait FooMocker extends FooApi {
  override def getFromApi(): String = {
    println("connecting to fake API...")
    "OK"
  }
}


object Yoyo {
  def main(args: Array[String]): Unit = {
    val a = (new FooApi).getFromApi()
    println(a)

    val foo = new FooApi with FooMocker
    val b = foo.getFromApi()
    println(b)
  }
}

