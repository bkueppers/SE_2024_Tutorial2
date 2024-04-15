public class Motorbike extends Vehicle{
    public Motorbike(int _weight, String _brand, String _model, int _ps) throws Exception {
        super(_weight, 2, _brand, _model, new MotorbikeEngine(_ps));
    }

    @Override
    public String getVehicleType() {
        return "Motorbike";
    }
}
