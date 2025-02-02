name := "pdal-jni"
version := "0.1.0-SNAPSHOT"
scalaVersion := "2.12.8"
crossScalaVersions := Seq("2.12.8", "2.11.12")
organization := "com.azavea"
scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions",
  "-language:reflectiveCalls",
  "-language:higherKinds",
  "-language:postfixOps",
  "-language:existentials",
  "-feature"
)

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots")
 )

fork := true

val pdalVersion = "1.9.0"

libraryDependencies ++= Seq(
  "io.pdal" %% "pdal"        % pdalVersion,
  "io.pdal" %% "pdal-scala"  % pdalVersion,
  "io.pdal" %  "pdal-native" % pdalVersion,
  "org.scalatest"  %% "scalatest" % "3.0.7" % Test
)
