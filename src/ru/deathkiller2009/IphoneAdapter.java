package ru.deathkiller2009;

public class IphoneAdapter implements TypeC{
    private OldIphoneCharger oldIphoneCharger;

    public IphoneAdapter(OldIphoneCharger oldIphoneCharger) {
        this.oldIphoneCharger = oldIphoneCharger;
    }

    @Override
    public void insertChargeCable() {
        oldIphoneCharger.insert();
        oldIphoneCharger.charge();
    }
}
