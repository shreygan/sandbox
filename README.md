[//]: # (# My Personal Project)

[//]: # (## A subtitle)

<h1 style="text-align: center;"> Personal Project </h1>

Shrey Gangwar  
c2p3p


<br/>

### What will my application do?
The goal for my project is to create a 2d sandbox environment.
For example, I want to be able to create shapes and objects in the window,
where the objects will fall and bounce according to their characteristics.
In addition to objects interacting with the "ground" and "walls" of the sandbox,
I want to the objects to also be able to interact with each other in a realistic
manner.

<br/>

### Why does this project interest me?
This project interests me because initially I wanted to create a game of some sort,
but I settled on this project as it provides a level of freedom for the user 
in how they interact
with the program.

<br/>

### User Stories

- As a user, I want to be able to add any number of circles to the sandbox while the simulation is running
- As a user, I want the circles to initially move in random directions, but still fall with gravity and bounce off all the boundaries of the sandbox
- As a user, I want to be able to pause and play the simulation
- As a user, I want to be able to delete all circles in the sandbox, or relaunch all of them again in random directions


- As a user, I want to be able to save the current state of the sandbox
- As a user, I want to be able to load a sandbox from a file

- As a user, I want to be able to drag my mouse to create a circle
- As a user, I want to be able to add a circle with specific position, speed, and size variables
- As a user, I want to be able to pick up, move, and "throw" the circles using my mouse
- As a user, I want the circles to bounce off of each other as well
- As a user, I want to be able to have the option of deleting a specific circle
- As a user, I want to be able to move forwards and backwards frame by frame when paused

<br/>

### Instructions for Grader

- You can generate the first required action related to adding a circle to a sandbox by
  - dragging and releasing your mouse
  - pressing the plus button on the jpanel
  - pressing c
- You can generate the second required action related to adding a circle to a sandbox by
  - double-clicking where you want a circle to specify the circle's attributes
- You can locate my visual component by running Main.java
- You can save the state of my application by
  - pressing the save button on the jpanel
  - pressing s
- You can load the state of my application by
  - pressing the load button on the jpanel
  - pressing l

### Phase 4: Task 2

Thu Apr 06 20:13:08 PDT 2023
circle added v1 (id: 1)

Thu Apr 06 20:13:09 PDT 2023
circle added v1 (id: 2)

Thu Apr 06 20:13:10 PDT 2023
relaunched circles

Thu Apr 06 20:13:13 PDT 2023
deleted one circle (id: 1)

Thu Apr 06 20:13:13 PDT 2023
circle added v1 (id: 3)

Thu Apr 06 20:13:16 PDT 2023
deleted all circles

### Phase 4: Task 3

One aspect of refactoring that I think would improve my project design is further modifying the SandboxPanel, 
GraphicsHandler, and ActionHandler classes. Intitially the functionality of all three classes was just in SandboxPanel,
however I refactored the GraphicsHandler and ActionHandler classes out in order to increase cohesion. That did 
work as now SandboxPanel handles aspects only related to the game iteself, and the other two classes perform the 
tasks they are named for. However, that increased the coupling of these classes quite a bit. I think that the bidirectional 
relationship between SandboxPanel and the two classes is alright, however there are dependencies between ActionHandler 
and GraphicsHandler. One of them is the paint method in GraphicsHandler using and calling aspects of ActionHandler. 
To solve this, I think the best way would be to push the paint method, and any others that utilize both classes, 
up to the SandboxPanel class.

Another aspect of refactoring I think could be benefitial for my project is modifying the methods in the Circle class.
Currently, for the tick forward and backword functionality, there are two seperate methods for each difference. For 
example there is tickPos(), untickPos(), tickXVel(), untickXVel(), and so on. However, the differences in between the tick 
and untick classes is often just whether a value is added or subtracted. One refactoring that could condense this 
code down is each pairing of methods having a boolean parameter that determines if it should tick or untick (add or 
subtract). Overall, this would decrease the use of code that is mostly duplicated, and increase readability.