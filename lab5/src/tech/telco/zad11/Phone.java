package tech.telco.zad11;

class Phone {

    private String manufacturer;
    private String  model;
    private String operatingSystem;

    {
        operatingSystem = "Android";
    }

    public Phone(String manufacturer, String model){
        this.manufacturer = manufacturer;
        this.model = model;
        this.operatingSystem = "iOS";
    }
}
