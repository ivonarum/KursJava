package Podsumowanie.Telewizory.Samsung;

public class UE43EU7171 extends TelewizorSamsung {

      private String id;
    private String hdmi1;
    private String hdmi2;
    private String optyczne;
    private String usb1;
    private String usb2;

    public UE43EU7171(String id) {
        super(43);
    }

    @Override
    public void akcjaZasilania() {

    }

    public void setUsb2(String usb2) {
        this.usb2 = usb2;
    }

    public void setUsb1(String usb1) {
        this.usb1 = usb1;
    }

    public void setOptyczne(String optyczne) {
        this.optyczne = optyczne;
    }

    public void setHdmi2(String hdmi2) {
        this.hdmi2 = hdmi2;
    }

    public void setHdmi1(String hdmi1) {
        this.hdmi1 = hdmi1;
    }
}
