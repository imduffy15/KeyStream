# KeyStream

This is most likely a terrible idea, but here goes.

An agent application will run on a computer and register back with an
eureka server. This agent will enable remote users to simulate mouse
movement, mouse clicks, mouse wheel and keystrokes.

Remote users will be able to access a listing of all available agents.
They can acquire a connection to an agent and take control of the machine
as they feel necessary.

Should probably just use VNC/RDP/TeamViewer/etc.

# Usage

The modules are all based of Spring-Boot, they must be started in a specific
order:

 1. configuration
 1. discovery
 1. agent

To start a module run `mvn spring-boot:run` from its directory.
