abstract class Vehicle {
    protected int weight = 0, numberOfTyres = 0;
    protected String brand = "",  model = "";
    protected Engine engine;
    protected boolean running;

    public Vehicle(int _weight, int _numberOfTyres, String _brand, String _model, Engine _engine) throws Exception {
        this.weight = _weight;
        this.numberOfTyres = _numberOfTyres;
        this.brand = _brand;
        this.model = _model;
        this.setEngine(_engine);
    }

    public int getNumberOfTyres() {
        return this.numberOfTyres;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int _weight) throws Exception  {
        if(_weight > 0) {
            this.weight = _weight;
        } else {
            throw new Exception("A vehicle must weight something!");
        }
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void setEngine(Engine _engine) throws Exception {
        if(_engine.isSuitable(this)) {
            this.engine = _engine;
        } else {
            throw new Exception("An engine suitable for a " + _engine.suitableFor.getName() + " cannot be put into a " + this.getClass().getName());
        }
    }

    abstract public String getVehicleType();
    
    public String startEngine() throws Exception {
        if(this.running) {
            throw new Exception("Vehicle is already running.");
        }

        String se = this.engine.startEngine();
        this.running = true;
        return se;
    }

    public void stopEngine() throws Exception {
        if(!this.running) {
            throw new Exception("Vehicle is not running.");
        }

        this.running = false;
    }
}