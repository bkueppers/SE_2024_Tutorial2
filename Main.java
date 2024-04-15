public class Main {
    public static void main(String[] args) {
        Vehicle v1 = null, v2 = null;
        try {
            v1 = new Car(1736, "Ford", "Mustang", 100);
            v2 = new Motorbike(134, "Harley Davidson", "XR750", 100);
        } catch(Exception e) {
            e.printStackTrace();
        }

        if(v1 != null) {
            System.out.println(v1.getBrand() + ": " + v1.getModel());
            System.out.println(v1.getNumberOfTyres());
            System.out.println(v1.getWeight());
            try {
                System.out.println(v1.startEngine());
                v1.stopEngine();
                System.out.println(v1.startEngine());
                v1.stopEngine();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(v2 != null) {
            System.out.println(v2.getBrand() + ": " + v2.getModel());
            System.out.println(v2.getNumberOfTyres());
            System.out.println(v2.getWeight());
            try {
                System.out.println(v2.startEngine());
                v2.stopEngine();
                System.out.println(v2.startEngine());
                v2.stopEngine();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(v1 != null && v2 != null) {
            try {
                v1.setEngine(v2.getEngine());
            } catch(Exception e) {
                e.printStackTrace();;
            }
        }
    }
}
