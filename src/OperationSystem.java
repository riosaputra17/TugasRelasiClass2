public class OperationSystem implements IOperationiSystem {
    public String operationSystem;
    public String OSVersion;

    @Override
    public void turnOnDevice() {
        System.out.println("Turning on device...");
    }

    @Override
    public void turnOffDevice() {
        System.out.println("Turning off device...");
    }

    @Override
    public void prepareHomeDisplay() {
        System.out.println("Preparing home display...");
    }
}
