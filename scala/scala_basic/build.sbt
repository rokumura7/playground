name         := "scala_basic"
version      := "0.1"
scalaVersion := "2.13.4"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest"    % "3.2.3" % Test,
  "org.mockito"   %  "mockito-core" % "3.7.0" % Test
)
