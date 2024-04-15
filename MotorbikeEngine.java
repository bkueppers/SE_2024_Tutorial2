public class MotorbikeEngine extends Engine {
    public MotorbikeEngine(int _ps) {
        super(0.3, _ps);
        this.suitableFor = Motorbike.class;
    }    

    @Override
    public String startEngine() throws Exception {
        if(Math.random() > this.FAIL_RATE) {
            return "Vrooming in a motorbike with" + this.ps + " ps.";
        } else {
            throw new Exception("Engine could not be started.");
        }
    }
}
