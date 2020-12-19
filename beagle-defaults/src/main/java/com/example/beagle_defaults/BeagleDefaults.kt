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

package com.example.beagle_defaults

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
import com.example.beagle_defaults.httpclient.HttpClientDefault


object BeagleDefaults {
    fun defaults(beagleSdk: BeagleSdk): BeagleSdk {
        return object : BeagleSdk {
            override val analytics: Analytics?
                get() = beagleSdk.analytics
            override val config: BeagleConfig
                get() = beagleSdk.config
            override val controllerReference: BeagleControllerReference? =
                beagleSdk.controllerReference
            override val deepLinkHandler: DeepLinkHandler? = beagleSdk.deepLinkHandler
            override val designSystem: DesignSystem?
                get() = beagleSdk.designSystem
            override val formLocalActionHandler: FormLocalActionHandler?
                get() = beagleSdk.formLocalActionHandler
            override val httpClient: HttpClient?
                get() = HttpClientDefault()
            override val imageDownloader: BeagleImageDownloader?
                get() = beagleSdk.imageDownloader
            override val logger: BeagleLogger? = BeagleLoggerDefault()
            override val serverDrivenActivity: Class<BeagleActivity>
                get() = beagleSdk.serverDrivenActivity
            override val storeHandler: StoreHandler?
                get() = beagleSdk.storeHandler
            override val typeAdapterResolver: TypeAdapterResolver?
                get() = beagleSdk.typeAdapterResolver
            override val urlBuilder: UrlBuilder?
                get() = beagleSdk.urlBuilder
            override val validatorHandler: ValidatorHandler?
                get() = beagleSdk.validatorHandler

            override fun registeredActions(): List<Class<Action>> {
                return beagleSdk.registeredActions()
            }

            override fun registeredOperations(): Map<String, Operation> {
                return beagleSdk.registeredOperations()
            }

            override fun registeredWidgets(): List<Class<WidgetView>> {
                return beagleSdk.registeredWidgets()
            }
        }
    }
}