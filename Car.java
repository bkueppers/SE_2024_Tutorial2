public class Car extends Vehicle{
    public Car(int _weight, String _brand, String _model, int _ps) throws Exception {
        super(_weight, 4, _brand, _model, new CarEngine(_ps));
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }
}
