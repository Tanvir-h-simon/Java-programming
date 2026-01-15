public class C04Q03 {
    public static void main(String[] args){
        double x1 = 33.757222, y1 = -84.387917; // Latitude and Longitude (degree) of Atlanta
        double x2 = 28.538336, y2 = -81.379234; // Latitude and Longitude of Orland
        double x3 = 32.0749, y3 = -81.0983; // Latitude and Longitude of Savannah
        double x4 = 35.223789, y4 = -80.841141; // Latitude and Longitude of Charlotte

        final double RADIUS = 6371.01;

        // Convert coordinates to radians
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        x3 = Math.toRadians(x3);
        y3 = Math.toRadians(y3);
        x4 = Math.toRadians(x4);
        y4 = Math.toRadians(y4);

        // Triangle 1 => Atlanta-Orland-Savannah, Triangle 2 => Savannah-Charlotte-Atlanta

        // Calculate distances between cities
        double distanceAtlantaOrland = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        double distanceOrlandSavannah = RADIUS * Math.acos(Math.sin(x2) * Math.sin(x3) + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3));
        double distanceAtlantaSavannah = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x3) + Math.cos(x1) * Math.cos(x3) * Math.cos(y1 - y3));
        double distanceSavannahCharlotte = RADIUS * Math.acos(Math.sin(x3) * Math.sin(x4) + Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4));
        double distanceCharlotteAtlanta = RADIUS * Math.acos(Math.sin(x4) * Math.sin(x1) + Math.cos(x4) * Math.cos(x1) * Math.cos(y4 - y1));

        // Calculate semi-perimeters
        double s1 = (distanceAtlantaOrland + distanceOrlandSavannah + distanceAtlantaSavannah) / 2;
        double s2 = (distanceSavannahCharlotte + distanceCharlotteAtlanta + distanceAtlantaSavannah) / 2;

        // Calculate areas
        double area1 = Math.sqrt(s1 * (s1 - distanceAtlantaOrland) * (s1 - distanceOrlandSavannah) * (s1 - distanceAtlantaSavannah));
        double area2 = Math.sqrt(s2 * (s2 - distanceSavannahCharlotte ) * (s2 - distanceCharlotteAtlanta) * (s2 - distanceAtlantaSavannah));

        // Total enclosed area
        double area = area1 + area2;
        System.out.printf("The estimated area enclosed by four cities is %.2f km^2", area);
    }
}