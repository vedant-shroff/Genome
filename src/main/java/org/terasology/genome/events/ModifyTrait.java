// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0

package org.terasology.genome.events;

import org.terasology.entitySystem.Component;
import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.event.Event;

public class ModifyTrait implements Event {
    private Class<? extends Component> componentType;
    String traitName;

    public ModifyTrait(Class<? extends Component> componentType, String traitName) {
        this.componentType = componentType;
        this.traitName = traitName;
    }

    public Class<? extends Component> getComponentType() {
        return componentType;
    }

    public String getTraitName() {
        return traitName;
    }
}
