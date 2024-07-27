package com.example.swishersoftwaresolutions.components

import androidx.compose.runtime.Composable
import com.example.swishersoftwaresolutions.util.Res
import com.example.swishersoftwaresolutions.util.Res.Dimens.BORDER_RADIUS
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

@Composable
fun IconButton(
    modifier: Modifier = Modifier,
    link: String = "",
    icon: String,
    iconSize: CSSSizeValue<CSSUnit.px> = Res.Dimens.ICON_SIZE.px,
    onClick: (() -> Unit)? = null
) {
    Link(
        path = link
    ) {
        Box(
            modifier = modifier
                .padding(all = 8.px)
                .borderRadius(r = BORDER_RADIUS.px)
                .cursor(Cursor.Pointer)
                .border(
                    width = 1.px,
                    style = LineStyle.Solid,
                    color = Res.Theme.MY_LIGHT_BLUE.color
                )
                .onClick { onClick?.invoke() }
        ){
            Image(
                modifier = Modifier
                    .size(iconSize),
                src = icon
            )
        }
    }
}

enum class SocialIcon(
    val icon: String,
    val link: String
) {
    FacebookLightBlue(
        icon = Res.Icon.FACEBOOK_LIGHT_BLUE,
        link = "https://www.facebook.com/fatbottomgrille"
    ),
    MailLightBlue(
        icon = Res.Icon.MAIL_LIGHT_BLUE,
        link = Res.String.MY_EMAIL
    )
}