package au.id.ah.config

import java.io.{IOException, InputStream}
import java.util.Properties

import org.junit.runner.RunWith
import org.specs2._
import org.specs2.runner.JUnitRunner

/**
 * Specification of behaviour for PropertiesFromInputStream.
 */
@RunWith(classOf[JUnitRunner])
class PropertiesFromInputStreamSpec extends mutable.Specification {
  val streamToProperties: au.id.ah.function.Function[InputStream, Properties, IOException] =
    new PropertiesFromInputStream

  def emptyInputStream = new InputStream {
    override def read(): Int = -1
  }

  "Applying PropertiesFromInputStream to an InputStream" should {
    "not be exceptional when the InputStream is empty" in {
      streamToProperties(emptyInputStream).should(not(throwAn[Exception]))
    }
    "produce an empty Properties object from an empty InputStream" in {
      streamToProperties(emptyInputStream).size() should_== 0
    }
  }
}
