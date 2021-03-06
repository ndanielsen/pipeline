val globalSettings = Seq(
  version := "1.0",
  scalaVersion := sys.env("SCALA_VERSION") 
)

lazy val settings = (project in file("."))
                    .settings(name := "spring")
                    .settings(globalSettings:_*)
                    .settings(libraryDependencies ++= deps)
		    .settings(javaOptions += "-Xmx10G")

val sparkVersion = sys.env("SPARK_VERSION") 
val scalaTestVersion = sys.env("SCALATEST_VERSION") 
val finagleVersion = sys.env("FINAGLE_VERSION")
val jblasVersion = sys.env("JBLAS_VERSION")
val hystrixVersion = sys.env("HYSTRIX_VERSION")
val betterFilesVersion = sys.env("BETTER_FILES_VERSION")
val breezeVersion = "0.11.2"
val dynoVersion = sys.env("DYNO_VERSION")
val json4sVersion = sys.env("JSON4S_VERSION")
val springBootVersion = sys.env("SPRINGBOOT_VERSION")

lazy val deps = Seq(
  "com.github.pathikrit" %% "better-files"                 % betterFilesVersion,
  "org.jblas" 	         % "jblas"          		   % jblasVersion,
  "com.netflix.hystrix"  % "hystrix-core"                  % hystrixVersion,
  "com.netflix.hystrix"  % "hystrix-request-servlet"       % hystrixVersion,  
  "com.netflix.hystrix"  % "hystrix-metrics-event-stream"  % hystrixVersion,
  "org.springframework.boot" % "spring-boot-starter-web"   % springBootVersion,
  "org.json4s"           % "json4s-jackson_2.10"           % json4sVersion,
  "org.scalanlp"         %% "breeze"                       % breezeVersion % "provided",
  "com.netflix.dyno"     % "dyno-jedis"                    % dynoVersion
)
