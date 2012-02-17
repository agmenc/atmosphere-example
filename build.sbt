name := "cometd"

organization := "org.pettswood"

version := "0.0.1"

scalaVersion := "2.9.1"

retrieveManaged := true

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.0.0" withSources(),
  "com.sun.jersey" % "jersey-core" % "1.9.1" withSources(),
  "org.atmosphere" % "atmosphere-jersey" % "0.8.5" withSources() exclude("org.atmosphere", "atmosphere-compat-*"),
  "org.atmosphere" % "atmosphere-runtime" % "0.8.5" withSources() exclude("org.atmosphere", "atmosphere-compat-*"),
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.0.v20120127" withSources(),
  "org.eclipse.jetty" % "jetty-websocket" % "8.1.0.v20120127" withSources(),
  "org.specs2" %% "specs2" % "1.6.1" % "test" withSources(),
  "org.specs2" %% "specs2-scalaz-core" % "6.0.1" % "test" withSources(),
  "junit" % "junit" % "4.8.1" % "test" withSources(),
  "org.mockito" % "mockito-core" % "1.9.0-rc1" % "test" withSources(),
  "org.scala-tools.testing" % "test-interface" % "0.5"
)
