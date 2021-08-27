/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
package megamek.common.weapons.missiles;

import megamek.common.AmmoType;
import megamek.common.BattleForceElement;
import megamek.common.Mounted;

/**
 * @author Sebastian Brocks
 */
public class ISThunderBolt5 extends ThunderBoltWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 5295837076559643763L;

    /**
     *
     */
    public ISThunderBolt5() {
        super();
        name = "Thunderbolt 5";
        setInternalName(name);
        addLookupName("IS Thunderbolt-5");
        addLookupName("ISThunderbolt5");
        addLookupName("IS Thunderbolt 5");
        ammoType = AmmoType.T_TBOLT_5;
        heat = 3;
        minimumRange = 5;
        shortRange = 6;
        mediumRange = 12;
        longRange = 18;
        extremeRange = 24;
        shortAV = 5;
        medAV = 5;
        maxRange = RANGE_MED;
        tonnage = 3.0;
        criticals = 1;
        bv = 64;
        cost = 50000;
        flags = flags.or(F_LARGEMISSILE);
        this.missileArmor = 5;
        rulesRefs = "347,TO";
        techAdvancement.setTechBase(TECH_BASE_IS)
        	.setIntroLevel(false)
        	.setUnofficial(false)
            .setTechRating(RATING_E)
            .setAvailability(RATING_X, RATING_X, RATING_F, RATING_E)
            .setISAdvancement(3052, 3072, 3081, DATE_NONE, DATE_NONE)
            .setISApproximate(false, false, false,false, false)
            .setPrototypeFactions(F_FS)
            .setProductionFactions(F_FS,F_LC);
    }
    
    @Override
    public double getBattleForceDamage(int range, Mounted fcs) {
        if (range == BattleForceElement.SHORT_RANGE) {
            return 0.29;
        } else if (range == BattleForceElement.MEDIUM_RANGE) {
            return 0.5;
        } else if (range == BattleForceElement.LONG_RANGE) {
            return 0.5;
        } else {
            return 0;
        }
    }
}
