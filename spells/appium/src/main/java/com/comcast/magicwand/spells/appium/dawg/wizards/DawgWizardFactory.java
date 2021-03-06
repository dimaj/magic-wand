/**
 * Copyright 2015 Comcast Cable Communications Management, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.comcast.magicwand.spells.appium.dawg.wizards;

import com.comcast.magicwand.builders.PhoenixDriverIngredients;
import com.comcast.magicwand.drivers.PhoenixDriver;
import com.comcast.magicwand.spells.appium.AbstractAppiumPhoenixDriver;
import com.comcast.magicwand.exceptions.FlyingPhoenixException;
import com.comcast.magicwand.wizards.WizardFactory;

/**
 * A wizard factory for Dawg. This factory is in charge of getting
 * list of devices from Dawg-House and trying to create an {@link AbstractAppiumPhoenixDriver} from it
 * @author Trent Schmidt
 *
 */
public class DawgWizardFactory implements WizardFactory {

    /**
     * {@inheritDoc}
     * @throws FlyingPhoenixException If there was a problem creating a driver
     * @throws DeviceProviderException If there was a problem getting list of reserved devices
     */
    @Override
    public PhoenixDriver create(PhoenixDriverIngredients ingredients) throws FlyingPhoenixException {
        PhoenixDriver rv = null;
        DawgWizard wizard = new DawgWizard(ingredients);

        rv = wizard.createDriver();

        return rv;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getWizardFactoryName() {
        return "DawgWizardFactory";
    }
}
