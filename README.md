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

