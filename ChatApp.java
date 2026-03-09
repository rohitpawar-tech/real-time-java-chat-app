import java.io.*;
import java.net.*;
import java.util.*;
import java.text.SimpleDateFormat;


public class ChatApplication {

    static List<ClientHandler> clients = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
