import sbt._
import sbt.Keys._

scalaVersion in Global := "2.11.7"

val remotelySettings = Seq(
	resolvers           ++= Seq("bintray/remotely" at "http://dl.bintray.com/oncue/releases"),
	libraryDependencies ++= Seq(
		"oncue.remotely" %% "core" % "1.4.0",
		"org.scala-lang" % "scala-reflect" % scalaVersion.value,
		compilerPlugin("org.scalamacros" % "paradise" % "2.1.0-M5" cross CrossVersion.full)
	)
)

lazy val rpc	     = project.settings(remotelySettings)
lazy val `rpc-gen` = project.dependsOn(rpc).settings(remotelySettings)