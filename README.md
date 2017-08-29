Application uses Springboot, Hazelcast and Gradle for dependency management.

Run the command "./gradlew clean build" in the project folder to build the project.

Run the application as Java application with Applicaion.java as the main class.

You have started first node in the cluster.

Now go to application.properties and increment the server.port. Let's say 8085, make sure nothing is running on that port.

Hazelcast, auto-increment is set as true. So it will automatically pick-up the next port in your local machine.

Run the application again as Java application.

Your cluster is ready.

Try changing settings and values in Config class. 
# HazelcastLocalCluster
