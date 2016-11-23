package org.elasticmq.server

import org.scalatest.FunSuite
import org.scalatest.Matchers
import com.typesafe.config.ConfigFactory

class ElasticMQServerConfigTest extends FunSuite with Matchers {
  test("load the default config") {
    // No exceptions -> good :)
    new ElasticMQServerConfig(ConfigFactory.load("conf/elasticmq"))
  }
}
