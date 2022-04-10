package com.example.composedemo.screens.compose.algebra

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
        ButtonExtendableAnswer(
            text = "8 - Обратимые элементы кольца многочленов.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "9 - Норма (функция высоты).",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "10 - Определение евклидова кольца. Примеры.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "11 - Определения левого, правого, двустороннего идеалов кольца.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "12 - Отсутствие собственных идеалов в поле.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "13 - Идеал, порожденный конечным множеством элементов.\n",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "14 - Главный идеал. Кольцо главных идеалов. Евклидово кольцо является кольцом главных идеалов. Примеры.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "15 - Определение делителя элемента в области целостности, связь между идеалами делителя и делимого",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "16 - Определение ассоциированных элементов, связь между их идеалами. Определение наибольшего общего делителя элементов кольца.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "17 - Теорема о существовании наибольшего общего делителя двух элементов и линейном выражении его через эти элементы в кольце главных идеалов. \n",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "18 - Определение взаимно простых элементов кольца.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "19 - Определение простого элемента. Простые элементы в кольцах многочленов – " +
                    "неприводимые многочлены. Примеры.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "20 - Определение факториального кольца. Теорема о том, что кольцо главных идеалов является факториальным. Примеры.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "21 - Выражение наибольшего общего делителя двух элементов через их простые делители в факториальном кольце.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "22 -  Определение факторкольца по двустороннему идеалу.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "23 - Гомоморфизм колец. Ядро и образ гомоморфизма. Ядро гомоморфизма – двусторонний идеал кольца. Ядро гомоморфного отображения поля. Изоморфизм колец. Теорема о гомоморфизме колец. Примеры.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "24 - Определение факторкольца по двустороннему идеалу.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "25 - Факторкольцо коммутативного ассоциативного кольца с единицей по идеалу является полем тогда и только тогда, когда идеал является максимальным.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "26 - Максимальные идеалы кольца главных идеалов. Примеры.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "27 - Факторкольцо многочленов над полем по идеалу, порожденному многочленом f, является полем тогда и только тогда, когда многочлен f неприводим.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "28 - Нильпотентные элементы кольца, нильрадикал. Нильрадикал кольца является его идеалом. Факторкольцо по нильрадикалу.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "29 - Определение внешней прямой суммы колец.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "30 - Определение внутренней прямой суммы подколец.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "31 - Эквивалентное определению утверждение.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "32 - Связь между понятиями внутренней и внешней прямой суммы колец.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "33 - Определение идемпотентного элемента, его свойства.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "34 - Критерий разложимости коммутативного ассоциативного кольца с единицей в прямую сумму подколец. Примеры.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "35 - Лемма о взаимно простых делителях элемента кольца главных идеалов.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "36 - Лемма о том, что в кольце главных идеалов элемент, взаимно простой с сомножителями, взаимно прост с их произведением.",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "37 - Китайская теорема об остатках в кольце главных идеалов. Её классическая формулировка. Примеры.",
            answerText = "",
        )
    }
}