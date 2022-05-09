package com.example.composedemo.screens.compose.mcomplexa

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import com.example.composedemo.screens.utils.ExtImage

@Composable
fun ComplexAQuestionList() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Column(modifier = Modifier.align(Alignment.End)) {
            Image(
                imageVector = ImageVector.vectorResource(R.drawable.ic_orbit),
                modifier = Modifier
                    .width(180.dp)
                    .height(180.dp)
                    .padding(top = 20.dp)
                    .align(Alignment.CenterHorizontally),
                contentDescription = "App theme",
            )
            Text(
                text =  "Вопросы к зачету",
                modifier = Modifier.align(Alignment.CenterHorizontally).fillMaxWidth(),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                fontSize = 25.sp,
            )
            Text(
                text = "Нажми на вопрос, чтобы посмотреть ответ",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 13.sp,
                textAlign = TextAlign.Center
            )
        }

        Text(
            modifier = Modifier.padding(top = 50.dp),
            text = "Вопросы для устного/письменного опроса по разделу 1. Несобственные интегралы",
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
        )

        ButtonExtendableAnswer(
            text = mapOf("1 - Несобственные интегралы с бесконечными пределами интегрирования и от\n" +
                    "неограниченных функций" to null),
            answerText = mapOf(
                "ИНТЕГРАЛЫ С БЕСКОНЕЧНЫМИ ПРЕДЕЛАМИ \n" to null,
                "Пусть функция f (x) непрерывна на промежутке [a; +inf), тогда по определению " to ExtImage(path = R.drawable.ca_answer_1, height = 150),
                "Если существует конечный предел в правой части этого равенства, то несобственный интеграл в левой части указанного равенства называется\n" +
                        "СХОДЯЩИМСЯ, если такой предел не существует, то – РАСХОДЯЩИМСЯ." to null,
                "\n" to null,
                "ИНТЕГРАЛЫ ОТ НЕОГРАНИЧЕННЫХ ФУНКЦИЙ \n" to null,
                "Пусть функция f(x) непрерывна на промежутке [a;b) и lim f(x) при x->b-0 = inf. Тогда по определению " to ExtImage(path = R.drawable.ca_answer_2,
                    height = 150),
                "Если существует конечный предел в правой части этого равенства, то несобственный интеграл в левой части указанного равенства называется\n" +
                        "сходящимся, если такой предел не существует, то – расходящимся." to null
            )
        )

        ButtonExtendableAnswer(
            text = mapOf("2 - Признаки сходимости несобственных интегралов" to null),
            answerText = mapOf()
        )
        ButtonExtendableAnswer(
            text = mapOf("3 - Критерий Коши" to null),
            answerText = mapOf()
        )

        Text(
            text = "Вопросы для устного/письменного опроса по разделу 2. Собственные интегралы, зависящие от параметра",
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
        )

        ButtonExtendableAnswer(
            text = mapOf("1 - Непрерывность и равномерная непрерывность функций одной и двух переменных. Теорема Кантора о равномерной непрерывности." to null),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "2 - Непрерывность собственного интеграла " to ExtImage(path = R.drawable.ca_title_1, height = 100),
                "по параметру" to null
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "3 - Непрерывность интеграла " to ExtImage(path = R.drawable.ca_title_2, height = 100),
                "по параметру" to null
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "4 - Дифференцирование " to ExtImage(path = R.drawable.ca_title_1, height = 100),
                "по параметру. Правило Лейбница" to null
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "5 - Дифференцирование " to ExtImage(path = R.drawable.ca_title_2, height = 100),
                "по параметру" to null
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "6 - Интегрирование собственного интеграла" to ExtImage(path = R.drawable.ca_title_1, height = 100),
                "по параметру" to null
            ),
            answerText = mapOf()
        )

        Text(
            text = "Вопросы для устного/письменного опроса по разделу 3. Несобственные интегралы, зависящие от параметра",
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "1 - Сходимость и равномерная сходимость несобственного интеграла, зависящего от\n" +
                        "параметра. Примеры равномерно и неравномерно сходящихся несобственных интегралов." to null
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "2 - Признак Вейерштрасса равномерной сходимости несобственных интегралов" to null
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "3 - Критерий Коши равномерной сходимости несобственных интегралов. Отрицание\n" +
                        "критерия Коши." to null
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "4 - Непрерывность несобственного интеграла по параметру" to null
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "5 - Интегрирование несобственного интеграла по параметру" to null
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "6 - Дифференцирование несобственного интеграла по параметру" to null
            ),
            answerText = mapOf()
        )
        //!!! ca_title _3 skipped
        ButtonExtendableAnswer(
            text = mapOf(
                "7 - Интеграл Дирихле " to ExtImage(path = R.drawable.ca_title_4, height = 100),
                " Интеграл Эйлера-Пуассона " to ExtImage(path = R.drawable.ca_title_5, height = 100),
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "8 - Интегралы Фруллани " to ExtImage(path = R.drawable.ca_title_6, height = 100),
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "9 - Интеграл Лапласа " to ExtImage(path = R.drawable.ca_title_7, height = 100),
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "10 - Теорема о перестановке двух несобственных интегралов" to null
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "11 - Интегралы Френеля" to ExtImage(path = R.drawable.ca_title_8, height = 100),
            ),
            answerText = mapOf()
        )

        Text(
            text = "Вопросы для устного/письменного опроса по разделу 4. Интеграл Фурье.\n" +
                    "Интегральное преобразование Фурье.",
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "1 - Интеграл Фурье как предельный случай ряда Фурье" to null
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "2 - Признак Дини сходимости интеграла Фурье" to null
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "3 - Преобразование Фурье. Свойства преобразования Фурье. Косинус-преобразование\n" +
                        "Фурье. Синус-преобразование Фурье" to null
            ),
            answerText = mapOf()
        )

        Text(
            text = "Вопросы для устного/письменного опроса по разделу 5. Эйлеровы интегралы.",
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "1 -  Определение гамма-функции как несобственного интеграла. Область сходимости\n" +
                        "соответствующего интеграла. Свойства гамма-функции: частные значения, формула\n" +
                        "понижения, формула дополнения. Производная от гамма-функции и область сходимости\n" +
                        "соответствующего ей несобственного интеграла." to null
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "2 - Бета-функция. Определение и основные свойства. Связь между гамма и бета функциями" to null
            ),
            answerText = mapOf()
        )

        Text(
            text = "Вопросы для устного/письменного опроса по разделу 6. Эллиптические интегралы",
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "1 - Эллиптические интегралы 1-го и 2-го рода в форме Лежандра. Полные эллиптические\n" +
                        "интегралы. Задачи, приводящие к эллиптическим интегралам (задача о математическом\n" +
                        "маятнике, задача о вычислении длины дуги эллипса)." to null
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "2 - Представление полных эллиптических интегралов в виде степенных рядов.\n" +
                        "Преобразование Ландена" to null
            ),
            answerText = mapOf()
        )

        Text(
            text = "Вопросы для устного/письменного опроса по разделу 7. Функции Бесселя.",
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "1 - Дифференциальное уравнение Бесселя. Функции Бесселя 1-го рода" to null
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "2 - Линейная зависимость функций " to ExtImage(path = R.drawable.ca_title_9, height = 100),
                "Определение функций Бесселя 2-го рода" to null
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "3 - Свойства функций Бесселя 1-го рода: частные значения, рекуррентные соотношения" to null
            ),
            answerText = mapOf()
        )

        Text(
            text = "Вопросы для устного/письменного опроса по разделу 8. Ортогональные многочлены",
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "1 - Ортогональные многочлены. Определение. Линейная независимость многочленов.\n" +
                        "Процесс ортогонализации Грамма-Шмидта. Общие свойства ортогональных многочленов.\n" +
                        "Формула Родрига. Рекуррентное соотношение между последовательными\n" +
                        "ортогональными многочленами. Дифференциальное уравнение, которому удовлетворяют\n" +
                        "ортогональные многочлены" to null
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "2 - Многочлены Лежандра. Многочлены Лежандра как собственные функции задачи\n" +
                        "Штурма-Лиувилля. Свойства многочленов Лежандра: частные значения, ортогональность,\n" +
                        "единственность. Производящая функция многочленов Лежандра. Рекуррентные\n" +
                        "соотношения" to null
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "3 - Многочлены Эрмита. Определение, основные свойства. Производящая функция\n" +
                        "многочленов Эрмита. Рекуррентные соотношения" to null
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "4 - Многочлены Чебышева. Определение, основные свойства. Производящая функция.\n" +
                        "Рекуррентные соотношения" to null
            ),
            answerText = mapOf()
        )

        ButtonExtendableAnswer(
            text = mapOf(
                "5 - Многочлены Лагерра. Определение, основные свойства. Производящая функция.\n" +
                        "Рекуррентные соотношения" to null
            ),
            answerText = mapOf()
        )
    }
}