public class Volume {
    public static void main(String[] args) {
        double radiusKm = 6378.0;
        double kmToMiles = 0.621371;

        // Calculate volume of Earth in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert the volume to cubic miles
        double volumeMiles3 = volumeKm3 * Math.pow(kmToMiles, 3);

        // Output the results
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3);
        System.out.println("The volume of Earth in cubic miles is " + volumeMiles3);
    }
}

