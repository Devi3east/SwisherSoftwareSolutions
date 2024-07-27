package com.example.swishersoftwaresolutions.styles

import com.example.swishersoftwaresolutions.util.Res
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

val ButtonStyle by ComponentStyle {
    base {
        Modifier
            .padding(12.px)
    }
    hover {
        Modifier
            .padding(leftRight = 20.px)
            .border(
                width = 1.px,
                style = LineStyle.Solid,
                color = Res.Theme.MY_LIGHT_BLUE.color
            )
    }
}