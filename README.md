---

# Real-Time Java Chat Application
## Overview
The Real-Time Java Chat Application is a console-based 
messaging system developed using Java Socket Programming.
The application demonstrates the implementation of a 
lient-server architecture where multiple clients can 
connect to a central server and exchange messages in real 
time.
This project focuses on core networking concepts such as socket communication, multithreading, and real-time message broadcasting. Each connected client can send messages that are instantly delivered to all other users connected to the server.
The application is designed as a learning project to understand how real-time communication systems work at a fundamental level using Java.

---
## Objectives

The primary objectives of this project are:

* To understand Java networking concepts
* To implement client-server architecture
* To learn socket programming
* To handle multiple clients using multithreading
* To implement real-time communication between users
* To practice object-oriented programming principles

---
## Key Features

* Real-time messaging between multiple clients
* Multi-client support using multithreading
* Username-based message identification
* Automatic broadcasting of messages to all connected users
* Join and leave notifications when users connect or disconnect
* Timestamped messages for better message tracking
* Command support to exit the chat
* Console-based lightweight interface
* Single-file implementation for simplicity

---
## System Architecture

This application follows a **Client-Server Architecture**.
### Server Responsibilities

* Listens for incoming client connections
* Accepts multiple client connections
* Manages active client sessions
* Broadcasts messages to all connected clients
* Handles client disconnections
* ### Client Responsibilities

* Connects to the chat server
* Sends messages to the server
* Receives broadcasted messages from other users
* Allows the user to exit the chat session

The server runs continuously while clients can join or leave at any time.

---
---

## Technologies Used

| Technology                  | Purpose                                  |
| --------------------------- | ---------------------------------------- |
| Java                        | Core programming language                |
| Socket Programming          | Network communication                    |
| Multithreading              | Handling multiple clients simultaneously |
| Networking                  | Client-server communication              |
| Object-Oriented Programming | Application design structure             |

---
---

## Project Structure

```
real-time-java-chat-app
│
├── ChatApplication.java
└── README.md
```


The project is intentionally kept minimal with a single Java file to make it easier for beginners to understand the networking and communication logic.

---

## How the Application Works

1. The server starts and begins listening on port **5000**.
2. Clients connect to the server using the provided client option.
3. Each client enters a username to join the chat.
4. Messages sent by any client are forwarded to the server.
5. The server broadcasts the message to all connected clients.
6. When a client leaves the chat, the server notifies other users.

This workflow enables real-time group communication.

---

## Installation and Setup

### Prerequisites

* Java JDK 8 or later
* Command Line Interface (Terminal or Command Prompt)

  Navigate to the project folder.

```
cd real-time-java-chat-app
```

---
### Step 2: Compile the Application

```
javac ChatApplication.java
```

---
### Step 1: Clone the Repository

```
git clone :https://github.com/rohitpawar-tech/real-time-java-chat-app/tree/main
```
---

### Step 3: Run the Application

```
java ChatApplication
```


You will be prompted to choose an option:

```
1 - Start Server
2 - Start Client
```


---

### Starting the Server

Select option:

```
1
```


The server will start listening on port **5000**.

---

### Connecting as a Client

Open another terminal and run:

```

java ChatApplication
```

Select:

```
2
```


## Commands

| Command | Description                     |
| ------- | ------------------------------- |
| /exit   | Disconnect from the chat server |

Typing `/exit` will close the client connection and notify other users in the chat.

---


## Learning Outcomes

This project helps in understanding the following concepts:

* Java Networking APIs
* Socket Communication
* Client-Server System Design
* Multithreading in Java
* Real-Time Message Broadcasting
* Handling Concurrent Client Connections

It is a good beginner project for developers interested in networking and distributed systems.

---


Enter your username and begin chatting.

You can run multiple client instances to simulate multiple users.

---


## Future Improvements

Possible enhancements for this project include:

* Graphical user interface using Java Swing or JavaFX
* Private messaging between users
* Chat rooms or group channels
* Message encryption for secure communication
* Persistent chat history using a database
* WebSocket based implementation

---


## Use Cases

This project can be used for:

* Learning Java networking fundamentals
* Demonstrating socket programming in interviews
* Academic networking assignments
* Understanding real-time communication systems
* Portfolio and GitHub projects

---

