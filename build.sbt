name := """play2.3-core"""

version := "1.0.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "mysql"    % "mysql-connector-java" % "5.1.37",
  "org.json" % "json"                 % "20160212"
)
