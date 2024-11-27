package Podsumowanie.Telewizory.Philips;

public class P43PUS6523 extends TelewizorPhilips {

    public void setHdmi(String hdmi) {
        this.hdmi = hdmi;
    }

    public void setUsb(String usb) {
        this.usb = usb;
    }

    private String hdmi;
    private String usb;


    public P43PUS6523(String id) {
        super(id, 43);
    }
}
