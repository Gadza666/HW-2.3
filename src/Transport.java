public abstract class Transport {

    protected final String modelName;
    protected final int wheelsCount;

    public void check() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }
}
