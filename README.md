requirement:
Maven and Java 11
How to run:
run mvn clean package first to install dependency and create jar file
1. If using IDE. It can simply be run using your preferably IDE.

2. Run from command line
  run command "mvn clean package" to build jar file
  move to where jar file generated, usually it in target directory
  run this command "java -jar technicaltest-0.0.1-SNAPSHOT.jar"

Both method will run the service in port 8080 and can be accessed via http://localhost:8080
