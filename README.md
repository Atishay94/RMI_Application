# RMI_Application
 Remote Mathod Invocation is a application that allows the client to send messages to server by  providing security.

 This project based on Java Application.
 
 This section explains the Compute interface, which provides the connection between the client and the server. You will also learn about the RMI API, which supports this communication.
 
 RMI provides the mechanism by which the server and the client communicate and pass information back and forth. Such an application is sometimes referred to as a distributed object application.
 
 The compute engine server accepts tasks from clients, runs the tasks, and returns any results. The server code consists of an interface and a class. The interface defines the methods that can be invoked from the client. Essentially, the interface defines the client's view of the remote object. The class provides the implementation.
 
Using RMI to develop a distributed application involves these general steps:
Designing and implementing the components of your distributed application.
Compiling sources.
Making classes network accessible.
Starting the application.
