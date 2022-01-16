package cz.lukynka.api;

import org.bukkit.Location;
import org.bukkit.util.Vector;

public abstract class LocationUtils {

    public static Location randomLocationInRadius(Location center, int min, int max, boolean sphere) {

        int rx = Maths.getRandomNumber(min, max);
        int rz = Maths.getRandomNumber(min, max);
        int ry = Maths.getRandomNumber(min, max);

        Location loc = null;

        if(sphere) {
            loc = center.clone().add(new Vector(rx, ry, rz));
        } else {
            loc = center.clone().add(new Vector(rx, 0, rz));
        }

        return loc;
    }


}
