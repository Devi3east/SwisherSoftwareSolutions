package com.example.swishersoftwaresolutions.components

import androidx.compose.runtime.Composable
import com.example.swishersoftwaresolutions.styles.ButtonStyle
import com.example.swishersoftwaresolutions.styles.SocialIconStyle
import com.example.swishersoftwaresolutions.util.Res
import com.stevdza.san.kotlinbs.components.BSAccordion
import com.stevdza.san.kotlinbs.models.AccordionItem
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import kotlinx.browser.window
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun LeftSide(
    breakpoint: Breakpoint
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(left = 15.px, right = 15.px),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = if (breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally else Alignment.Start
    ) {
        SpanText(
            text = Res.String.NAME,
            modifier = Modifier
                .margin(bottom = 12.px)
                .fontFamily(Res.String.ROBOTO_CONDENSED)
                .color(Colors.White)
                .fontSize(50.px)
                .fontWeight(FontWeight.Bold)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center else TextAlign.Start
                )
        )
        SpanText(
            text = Res.String.PROFESSION,
            modifier = Modifier
                .margin(bottom = 36.px)
                .fontFamily(Res.String.ROBOTO_REGULAR)
                .color(Colors.White)
                .fontSize(18.px)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center else TextAlign.Start
                )
        )
        Surface(
            modifier = Modifier
                .height(4.px)
                .fillMaxWidth()
                .margin(bottom = 24.px)
                .background(Res.Theme.BLUE.color)
                .align(
                    if (breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally else Alignment.Start
                )
        ) {}
        SpanText(
            modifier = Modifier
                .fontFamily(Res.String.ROBOTO_REGULAR)
                .fontSize(18.px)
                .color(Colors.White)
                .opacity(75.percent)
                .lineHeight(2)
                .margin(bottom = 12.px)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center else TextAlign.Start
                ),
            text = Res.String.ABOUT_ME
        )
        BSAccordion(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 36.px),
            alwaysOpen = false,
            items = listOf(
                AccordionItem(
                    title = "Development",
                    content = {
                        SpanText(
                            text = "Building robust and scalable applications tailored to your specific needs."
                        ) }
                ),
                AccordionItem(
                    title = "Web Design & Development",
                    content = {
                        SpanText(
                            text = "Creating visually captivating and highly functional websites that engage users and drive results."
                        ) }
                ),
                AccordionItem(
                    title = "Consulting & Strategy",
                    content = {
                        SpanText(
                            text = "Offering expert advice and strategies to optimize your digital presence and ensure your projects succeed."
                        ) }
                ),
            )
        )
        SpanText(
            modifier = Modifier
                .fontFamily(Res.String.ROBOTO_REGULAR)
                .fontSize(18.px)
                .color(Colors.White)
                .opacity(75.percent)
                .lineHeight(2)
                .margin(bottom = 12.px)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center else TextAlign.Start
                ),
            text = Res.String.MY_APPROACH
        )
        BSAccordion(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 36.px),
            alwaysOpen = false,
            items = listOf(
                AccordionItem(
                    title = "Personalized Service",
                    content = {
                        SpanText(
                            text = "Every project is treated with the utmost care and attention, tailored to fit your specific requirements."
                        ) }
                ),
                AccordionItem(
                    title = "Cutting-Edge Solutions",
                    content = {
                        SpanText(
                            text = "Leveraging the latest technologies and design trends to provide modern and effective solutions."
                        ) }
                ),
                AccordionItem(
                    title = "Commitment to Excellence",
                    content = {
                        SpanText(
                            text = "A dedication to delivering top-notch quality and ensuring your satisfaction with every aspect of the project."
                        ) }
                ),
            )
        )
        SpanText(
            modifier = Modifier
                .fontFamily(Res.String.ROBOTO_REGULAR)
                .fontSize(18.px)
                .color(Colors.White)
                .opacity(75.percent)
                .lineHeight(2)
                .margin(bottom = 36.px)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center else TextAlign.Start
                ),
            text = Res.String.ABOUT_ME_END
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .gap(12.px)
                .margin(bottom = 36.px),
            horizontalArrangement = Arrangement.Center
        ) {
            SocialIcon.entries.forEach {
                IconButton(
                    modifier = SocialIconStyle.toModifier(),
                    icon = it.icon,
                    link = it.link
                )
            }
        }
    }
}