/*
 *  Copyright 2020 ZUP IT SERVICOS EM TECNOLOGIA E INOVACAO SA
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package br.com.zup.beaglescaffold.initialConfig.essential

import br.com.zup.beagle.analytics.Analytics
import br.com.zup.beagle.android.action.Action
import br.com.zup.beagle.android.action.FormLocalActionHandler
import br.com.zup.beagle.android.components.form.core.ValidatorHandler
import br.com.zup.beagle.android.data.serializer.adapter.generic.TypeAdapterResolver
import br.com.zup.beagle.android.imagedownloader.BeagleImageDownloader
import br.com.zup.beagle.android.logger.BeagleLogger
import br.com.zup.beagle.android.navigation.BeagleControllerReference
import br.com.zup.beagle.android.navigation.DeepLinkHandler
import br.com.zup.beagle.android.networking.HttpClient
import br.com.zup.beagle.android.networking.urlbuilder.UrlBuilder
import br.com.zup.beagle.android.operation.Operation
import br.com.zup.beagle.android.setup.BeagleConfig
import br.com.zup.beagle.android.setup.BeagleSdk
import br.com.zup.beagle.android.setup.DesignSystem
import br.com.zup.beagle.android.store.StoreHandler
import br.com.zup.beagle.android.view.BeagleActivity
import br.com.zup.beagle.android.widget.WidgetView


object BeagleScaffold {
    fun scaffold(beagleSdk: BeagleSdk) : BeagleSdk {
        val newSdkInstance = object : BeagleSdk {
            override val analytics: Analytics?
                get() = beagleSdk.analytics
            override val config: BeagleConfig
                get() = beagleSdk.config
            override val controllerReference: BeagleControllerReference? = beagleSdk.controllerReference
            override val deepLinkHandler: DeepLinkHandler? = beagleSdk.deepLinkHandler
            override val designSystem: DesignSystem?
                get() = TODO("Not yet implemented")
            override val formLocalActionHandler: FormLocalActionHandler?
                get() = TODO("Not yet implemented")
            override val httpClient: HttpClient?
                get() = TODO("Not yet implemented")
            override val imageDownloader: BeagleImageDownloader?
                get() = TODO("Not yet implemented")
            override val logger: BeagleLogger? = BeagleLoggerDefault()
            override val serverDrivenActivity: Class<BeagleActivity>
                get() = TODO("Not yet implemented")
            override val storeHandler: StoreHandler?
                get() = TODO("Not yet implemented")
            override val typeAdapterResolver: TypeAdapterResolver?
                get() = TODO("Not yet implemented")
            override val urlBuilder: UrlBuilder?
                get() = TODO("Not yet implemented")
            override val validatorHandler: ValidatorHandler?
                get() = TODO("Not yet implemented")

            override fun registeredActions(): List<Class<Action>> {
                TODO("Not yet implemented")
            }

            override fun registeredOperations(): Map<String, Operation> {
                TODO("Not yet implemented")
            }

            override fun registeredWidgets(): List<Class<WidgetView>> {
                TODO("Not yet implemented")
            }

        }
        return newSdkInstance
    }

}