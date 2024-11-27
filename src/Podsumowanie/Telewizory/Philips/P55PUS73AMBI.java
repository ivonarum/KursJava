package Podsumowanie.Telewizory.Philips;

public class P55PUS73AMBI extends TelewizorPhilipsAmbilight {

    private String hdmi1;
    private String hdmi2;
    private String hdmi3;
    private String usb1;
    private String usb2;
    private String bluetooth;
    private String optyczne;
    private String wifi;
// konstruktor
    public P55PUS73AMBI(String id) {
        super(id, 55);
    }

    // metody
    public void setHdmi1(String hdmi1) {
        this.hdmi1 = hdmi1;
    }
    public void setHdmi2(String hdmi2) {
        this.hdmi2 = hdmi2;
    }
    public void setHdmi3(String hdmi3) {
        this.hdmi3 = hdmi3;
    }
    public void setUsb1(String usb1) {
        this.usb1 = usb1;
    }
    public void setUsb2(String usb2) {
        this.usb2 = usb2;
    }
    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }
    public void setOptyczne(String optyczne) {
        this.optyczne = optyczne;
    }
    public void setWifi(String wifi) {
        this.wifi = wifi;
    }
}
