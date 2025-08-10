package day5_assignment;

//Nested Interface for Callback Handling
//•	Create a class TimeServer which declares a public static nested interface named Client with void updateTime(LocalDateTime now).
//•	The server class should have method registerClient(Client client) and notifyClients() to pass current time.
//•	Implement at least two classes implementing Client, registering them, and simulate notifications.

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class TimeServer {

    public static interface Client {
        void updateTime(LocalDateTime now);
    }

    private List<Client> clients = new ArrayList<>();

    public void registerClient(Client client) {
        clients.add(client);
        System.out.println("Client registered: " + client.getClass().getSimpleName());
    }

    public void notifyClients() {
        LocalDateTime now = LocalDateTime.now();
        for (Client client : clients) {
            client.updateTime(now);
        }
    }
}

// Client implementation 1
class DesktopClock implements TimeServer.Client {
    @Override
    public void updateTime(LocalDateTime now) {
        System.out.println("DesktopClock updated: " + now);
    }
}

// Client implementation 2
class MobileClock implements TimeServer.Client {
    @Override
    public void updateTime(LocalDateTime now) {
        System.out.println("MobileClock updated: " + now);
    }
}

public class example6 {
    public static void main(String[] args) throws InterruptedException {
        TimeServer server = new TimeServer();
        server.registerClient(new DesktopClock());
        server.registerClient(new MobileClock());
        System.out.println("\nSending first update...");
        server.notifyClients();

        Thread.sleep(2000); 

        System.out.println("\nSending second update...");
        server.notifyClients();
    }
}


//Client registered: DesktopClock
//Client registered: MobileClock
//
//Sending first update...
//DesktopClock updated: 2025-08-09T22:10:16.216057200
//MobileClock updated: 2025-08-09T22:10:16.216057200
//
//Sending second update...
//DesktopClock updated: 2025-08-09T22:10:18.220713100
//MobileClock updated: 2025-08-09T22:10:18.220713100
