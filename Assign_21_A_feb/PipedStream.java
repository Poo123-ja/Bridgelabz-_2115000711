import java.io.*;
class PipedStream {
public static void main(String[] args) {
PipedOutputStream pos = new PipedOutputStream();
PipedInputStream pis = new PipedInputStream();
try {
pos.connect(pis);
Thread writerThread = new Thread(new Writer(pos));
Thread readerThread = new Thread(new Reader(pis));
writerThread.start();
readerThread.start();
} catch (IOException e) {
System.out.println("Error connecting pipes: " + e.getMessage());
}
}
}

class Writer implements Runnable {
private PipedOutputStream pos;

public Writer(PipedOutputStream pos) {
this.pos = pos;
}

public void run() {
try {
for (int i = 1; i <= 5; i++) {
pos.write(("Message " + i + "\n").getBytes());
Thread.sleep(500);
}
pos.close();
} catch (IOException | InterruptedException e) {
System.out.println("Error writing data: " + e.getMessage());
}
}
}

class Reader implements Runnable {
private PipedInputStream pis;

public Reader(PipedInputStream pis) {
this.pis = pis;
}

public void run() {
try (BufferedReader br = new BufferedReader(new InputStreamReader(pis))) {
String line;
while ((line = br.readLine()) != null) {
System.out.println("Received: " + line);
}
} catch (IOException e) {
System.out.println("Error reading data: " + e.getMessage());
}
}
}
