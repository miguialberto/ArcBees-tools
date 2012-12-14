/**
 * Copyright 2012 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.arcbees.myproject.server.service.impl;

import com.arcbees.myproject.server.business.MyEntity;
import com.arcbees.myproject.server.service.MyService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MyServiceImpl implements MyService {
    @Override
    public MyEntity loadMyEntity(String firstName, String lastName) {
        return new MyEntity(firstName, lastName, new Date());
    }
}
