/*
 * Copyright 2025 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid.ui.homeworks.homework15

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import com.google.samples.apps.nowinandroid.core.designsystem.C
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode

class MainHomeworkScreen(semanticsProvider: SemanticsNodeInteractionsProvider) : ComposeScreen<MainHomeworkScreen>(
    semanticsProvider
) {
    val topBarTitle = KNode(semanticsProvider) {
        hasTestTag(C.UPPER_TITLE_TEXT)
    }
    val navigationIconBar = KNode (semanticsProvider){
        useUnmergedTree=true
        hasTestTag(C.SEARCH_ICON)
    }

    val actionIconBar = KNode (semanticsProvider){
        useUnmergedTree=true
        hasTestTag(C.SETTINGS_ICON)
    }

    val title = KNode (semanticsProvider){
        hasTestTag("OnboardingTitle")
    }

    val subtitle = KNode (semanticsProvider){
        hasTestTag("OnboardingSubTitle")
    }

    val navIcon = KNode (semanticsProvider){
        hasTestTag("NiaNavItem")
    }
}