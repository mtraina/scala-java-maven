package com.mtraina

import org.scalatest.{FlatSpec, Matchers}
import scala.collection.JavaConverters._

class BookSpec extends FlatSpec with Matchers{

  "A Book" should "return the expected title" in {
    val book = new Book("The Odyssey", List(Chapter("chapter 1")).asJava)
    book.getTitle shouldBe "The Odyssey"
    book.getChapters shouldBe List(Chapter("chapter 1")).asJava
  }
}
