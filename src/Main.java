import ru.deathkiller2009.IphoneAdapter;
import ru.deathkiller2009.OldIphoneCharger;
import ru.deathkiller2009.TypeC;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        OldIphoneCharger oldIphoneCharger = new OldIphoneCharger();
        TypeC charger = new IphoneAdapter(oldIphoneCharger);
        charger.insertChargeCable();
    }

}