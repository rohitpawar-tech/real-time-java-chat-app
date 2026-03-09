import java.io.*;
import java.net.*;
import java.util.*;
import java.text.SimpleDateFormat;


public class ChatApplication {

    static List<ClientHandler> clients = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========= JAVA CHAT APPLICATION =========");
        System.out.println("1. Start Server");
        System.out.println("2. Start Client");
        System.out.print("Choose option: ");
        

        int option = scanner.nextInt();

        if(option == 1){
            startServer();
        } else {
            startClient();
        }
    }
 // ================= SERVER =================

    public static void startServer() {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started on port 5000...");
            System.out.println("Waiting for clients...\n");

   

            while(true){
                Socket socket = serverSocket.accept();

                ClientHandler client = new ClientHandler(socket);
                clients.add(client);

                Thread thread = new Thread(client);
                thread.start();
            }
