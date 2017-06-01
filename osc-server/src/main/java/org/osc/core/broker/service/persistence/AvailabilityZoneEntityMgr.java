/*******************************************************************************
 * Copyright (c) Intel Corporation
 * Copyright (c) 2017
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.osc.core.broker.service.persistence;

import javax.persistence.EntityManager;

import org.osc.core.broker.model.entities.virtualization.openstack.AvailabilityZone;
import org.osc.core.broker.service.dto.openstack.AvailabilityZoneDto;

public class AvailabilityZoneEntityMgr {
    public static void fromEntity(AvailabilityZone entity, AvailabilityZoneDto dto) {
        dto.setId(entity.getId());
        dto.setZone(entity.getZone());
        dto.setRegion(entity.getRegion());
    }

    public static AvailabilityZone findById(EntityManager em, Long id) {
        // Initializing Entity Manager
        OSCEntityManager<AvailabilityZone> emgr = new OSCEntityManager<AvailabilityZone>(AvailabilityZone.class, em);
        return emgr.findByPrimaryKey(id);
    }
}