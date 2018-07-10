scalaVersion := "2.12.6"


organization := "io.maslick"
name := "scalala"
version := "0.1"


libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % "2.0.3.RELEASE",
  "org.springframework.boot" % "spring-boot-configuration-processor" % "2.0.3.RELEASE"
)

mainClass in Compile := Some("io.maslick.scalala.HelloScala")