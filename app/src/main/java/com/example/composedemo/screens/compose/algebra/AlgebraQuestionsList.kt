package com.example.composedemo.screens.compose.algebra

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.R
import com.example.composedemo.screens.utils.ButtonExtendableAnswer

@Composable
fun AlgebraQuestionsList() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Row(modifier = Modifier.align(Alignment.Start)) {

            Column(modifier = Modifier.weight(2.5f)) {
                Text(
                    text = "Вопросы к экзамену",
                    modifier = Modifier
                        .offset(y = 20.dp, x = 10.dp)
                        .align(Alignment.CenterHorizontally),
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                )
                Text(
                    text = "Нажми на вопрос, чтобы посмотреть ответ",
                    modifier = Modifier
                        .offset(y = 50.dp, x = 30.dp)
                        .width(200.dp),
                    fontSize = 13.sp,
                    textAlign = TextAlign.Center
                )
            }
            Image(
                imageVector = ImageVector.vectorResource(R.drawable.ic_orbit),
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
                    .padding(top = 30.dp, end = 20.dp)
                    .weight(1f),
                contentDescription = "App theme",
            )
        }

        ButtonExtendableAnswer(
            text = "1 - Определения кольца, ассоциативного кольца, коммутативного кольца, кольца с\n" +
                    "единицей.",
            answerText = "КОЛЬЦО R – это абелева группа (в аддитивной записи, т.е. с операцией +, называемой сложением, и нейтральным элементом 0), в которой имеется вторая " +
                    "операция – умножение. \n \n Причем операции сложения и умножения связаны дистрибутивностью: \n" +
                    "\n a(b + c) = ab + ac,\n" +
                    "(b + c)a = ba + ca." +
                    "\n \n " +
                    "Кольцо называется АССОЦИАТИВНЫМ, если операция умножения ассоциативна, т.е.\n \n" +
                    "a(bc) = (ab)c, ∀ a, b, c ∈ R" +
                    "\n \n" +
                    "Кольцо называется КОММУТАТИВНЫМ, если умножение коммутативно, т.е. \n \n " +
                    "ab = ba, ∀ a, b ∈ R" +
                    "\n \n" +
                    "Если по отношению к умножению имеется в кольце нейтральный элемент,\n" +
                    "который называют единицей и обозначают как 1, то такое кольцо называют КОЛЬЦОМ\n" +
                    "С ЕДИНИЦЕЙ."
        )

        ButtonExtendableAnswer(
            text = "2 - Тела, поля, подкольца, подполя.",
            answerText = "Ассоциативное кольцо с единицей, в котором каждый ненулевой элемент обратим, называется ТЕЛОМ." +
                    "\n \n" +
                    "Коммутативное тело называется ПОЛЕМ" +
                    "\n \n" +
                    " Подмножество M кольца К называется ПОДКОЛЬЦОМ, если оно само является кольцо относительно операций сложения и умножения на M, определенных." +
                    "\n \n " +
                    "Подмножество M поля Р называется ПОДПОЛЕМ, если оно само является полем относительно операций сложения и умножения на М, определенных в Р.",
        )
        ButtonExtendableAnswer(
            text = "3 - Обратимые элементы кольца. Множество обратимых элементов кольца является группой. Делители нуля. Отсутствие делителей\n" +
                    "нуля в поле.",
            answerText = "Пусть K – кольцо с единицей. Элемент a ∈ K называется ОБРАТИМЫМ, если\n" +
                    "существует b ∈ K такой, что ab = ba = 1. В этом случае b называется обратным к " +
                    "a, и его часто обозначают как a^−1. " +
                    "\n \n МНОЖЕСТВО всех ОБРАТИМЫХ элементов кольца обычно обозначается как K∗.\n \n" +
                    " Элемент a кольца называется \n \n" +
                    "Левым делителем нуля, если существует ненулевое b такое, что ab=0 \n \n" +
                    "Правым делителем нуля, если существует ненулевое b такое, что ba=0 \n \n" +
                    "Элемент, который одновременно является и правым, и левым делителем нуля, называется ДЕЛИТЕЛЕМ НУЛЯ" +
                    "\n \n" +
                    "Поскольку в поле любой отличный от нуля элемент обратим, в поле нет делителей нуля.",
        )
        ButtonExtendableAnswer(
            text = "4 - Область целостности. Конечная область целостности является полем. Поле отношений (частных) целостного кольца.",
            answerText = "Ассоциативное и коммутативное кольцо с единицей без делителей нуля называется ОБЛАСТЬЮ ЦЕЛОСТНОСТИ или целостным кольцом." +
                    "\n \n " +
                    "Целостное кольцо, содержащее конечное число элементов является ПОЛЕМ." +
                    "\n \n" +
                    "Поле частных, называемое также полем отношений, – это наименьшее поле, в которое погружается область целостности. " +
                    "\n Пусть R – область целостности. \n \n" +
                    " Если R содержится в поле L как подкольцо так, что единицы 1 ∈ R и 1 ∈ L совпадают," +
                    " то определены элементы b^(−)1a = ab^(−1). " +
                    "\n \n" +
                    " Если эти элементы записывать как дроби a/b, то правила сложения, умножения и деления не будут отличаться от тех же правил обращения с обычными дробями" +
                    " (отношениями целых чисел, многочленов и пр.)",
        )
        ButtonExtendableAnswer(
            text = "5 - Кольцо многочленов. Степень многочлена. Кольцо многочленов над областью целостности является областью целостности.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "6 - Алгоритм Евклида.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "7 - Теорема Безу и следствия из нее.",
            answerText = "",
        )
    }
}