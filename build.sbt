name := "cometd"

organization := "org.pettswood"

version := "0.0.1"

scalaVersion := "2.9.1"

retrieveManaged := true

libraryDependencies ++= Seq(
  "org.cometd.java" % "cometd-java-server" % "2.4.0" withSources(),
  "org.cometd.java" % "cometd-java-annotations" % "2.4.0" withSources(),
  "org.cometd.java" % "cometd-websocket-jetty" % "2.4.0" withSources(),
  "org.cometd.javascript" % "cometd-javascript-jquery" % "2.4.0" from "http://repo1.maven.org/maven2/org/cometd/javascript/cometd-javascript-jquery/2.4.0/cometd-javascript-jquery-2.4.0.war",
  "com.sun.jersey" % "jersey-core" % "1.9.1" withSources(),
  "org.atmosphere" % "atmosphere-jersey" % "0.8.5" withSources(),
  "org.atmosphere.samples" % "atmosphere-jquery-pubsub" % "0.8.5" from "http://repo1.maven.org/maven2/org/atmosphere/samples/atmosphere-jquery-pubsub/0.8.5/atmosphere-jquery-pubsub-0.8.5.war" withSources(),
  "org.atmosphere" % "atmosphere-jquery" % "0.8.5" from "http://repo1.maven.org/maven2/org/atmosphere/atmosphere-jquery/0.8.5/atmosphere-jquery-0.8.5.war",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.0.v20120127" withSources(),
  "org.specs2" %% "specs2" % "1.6.1" % "test" withSources(),
  "org.specs2" %% "specs2-scalaz-core" % "6.0.1" % "test" withSources(),
  "junit" % "junit" % "4.8.1" % "test" withSources(),
  "org.mockito" % "mockito-core" % "1.9.0-rc1" % "test" withSources(),
  "org.scala-tools.testing" % "test-interface" % "0.5"
)
