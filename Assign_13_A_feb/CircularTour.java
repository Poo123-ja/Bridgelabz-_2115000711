import java.util.*;
public class CircularTour {
static class PetrolPump {
int petrol;
int distance;

PetrolPump(int petrol, int distance) {
this.petrol = petrol;
this.distance = distance;
}
}

public static int findStartingPoint(PetrolPump[] pumps) {
int n = pumps.length;
int start = 0, end = 1;
int currentPetrol = pumps[start].petrol - pumps[start].distance;

while (end != start || currentPetrol < 0) {
while (currentPetrol < 0 && start != end) {
currentPetrol -= pumps[start].petrol - pumps[start].distance;
start = (start + 1) % n;
if (start == 0) {
return -1;
}
}
currentPetrol += pumps[end].petrol - pumps[end].distance;
end = (end + 1) % n;
}
return start;
}

public static void main(String[] args) {
PetrolPump[] pumps = {
new PetrolPump(6, 4),
new PetrolPump(3, 6),
new PetrolPump(7, 3)
};
int startingPoint = findStartingPoint(pumps);
if (startingPoint == -1) {
System.out.println("Not valid starting point.");
} else {
System.out.println("Starting point for the circular tour is: " + startingPoint);
}
}
}
