public class CarEngine extends Engine {
    public CarEngine(int _ps) {
        super(0.1, _ps);
        this.suitableFor = Car.class;
    }    

    @Override
    public String startEngine() throws Exception {
        if(Math.random() > this.FAIL_RATE) {
            return "Vrooming in a car with" + this.ps + " ps.";
        } else {
            throw new Exception("Engine could not be started.");
        }
    }
}
