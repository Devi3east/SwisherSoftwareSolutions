package com.example.swishersoftwaresolutions.pages

import androidx.compose.runtime.*
import com.example.swishersoftwaresolutions.components.ProfileCard
import com.example.swishersoftwaresolutions.util.Res
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundImage
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage() {
    Box(
        Modifier
            .fillMaxSize()
            .backgroundImage(
                linearGradient(
                    dir = LinearGradient.Direction.ToRight,
                    from = Res.Theme.LIGHT_GRAY.color,
                    to = Res.Theme.DARK_GRAY.color
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        ProfileCard()
    }
}
