public abstract class Engine {
    protected int ps;
    protected Class suitableFor;
    protected final double FAIL_RATE;

    protected Engine(double _failRate, int _ps) {
        this.FAIL_RATE = _failRate;
        this.ps = _ps;
    }

    public abstract String startEngine() throws Exception;

    public boolean isSuitable(Vehicle _v) {
        return this.suitableFor == _v.getClass();
    }
}
