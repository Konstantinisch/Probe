package de.telran.homework_22092024;

public class VehicleManager {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();


        Vehicle myCar = new Car("Toyota", 200);


        Vehicle myMotorvehicle = new Motorcycle("BMW", 240);


        Vehicle myBicycle = new Bicycle("Kama", 25);


        String marcName = "VW";
        switch (myCar.displayInfo()) { // return "Car "+name+ " has speed maximal "+speed+" km/h.";
            case "Toyota":
                manageVehicle(myCar);
                break;
            case "BMW":
                manageVehicle(myMotorvehicle);
                break;
            case "KAma":
                manageVehicle(myMotorvehicle);
                break;
            default:
                System.out.println("Do not exist");


        }

        int a = 10;
        int b = 20;
        int c = 15;
        int d = 25;
        int v = 5;
        //
        //String result = a < b
        //                ? (c > v
        //                   ? (d == 25 ? "d равно 25" : "d не равно 25")
        //                   : "c меньше или равно v")
        //                : "a больше или равно b";
        //[21:16]
        //System.out.println(result);

//        if(a<b) {
//            if (c > v) {
//                if (d == 25) {
//                    System.out.println("d ravno 25");
//                } else {
//                    System.out.println("d ne ravno");
//                }
//            } else {
//                System.out.println("c <= v");
//            }
//        }else{
//                    System.out.println("a>=b");
//                }
//            }
//

        String result;

        if (a < b) {
            if (c > v) {
                if (d == 25) {
                    result = "d равно 25";
                } else {
                    result = "d не равно 25";
                }
            } else {
                result = "c меньше или равно v";
            }
        } else {
            result = "a больше или равно b";

        }
        System.out.println(result);
    }




        public static void manageVehicle(Vehicle vehicle) {
        System.out.println(vehicle.displayInfo());

    }

}