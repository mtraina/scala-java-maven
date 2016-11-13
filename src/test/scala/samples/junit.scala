package samples

import com.mtraina.{Book, Chapter}
import org.junit._
import Assert._

import scala.collection.JavaConverters._

class AppTest {

    @Test
    def testBook() = {
        val book = new Book("test", List(Chapter("Chapter 3")).asJava)
        assertEquals(book.getTitle, "test")
    }
}


