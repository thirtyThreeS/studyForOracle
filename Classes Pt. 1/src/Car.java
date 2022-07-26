public class Car
{
    private int doors;
    private int wheels;
    private String color;
    private String model;
    private String engine;

    public void setModel(String model)
    {
        String validModel = model.toLowerCase();
        if (validModel.equals("porsche") || validModel.equals("commodore")) this.model = model;
        else this.model = "Unknown";
    }

    public String getModel()
    {
        return this.model;
    }
}
