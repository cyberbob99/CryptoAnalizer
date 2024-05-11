package ru.zudilov.cryptoanalizer.constans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Constants {
    private Constants(){  }
    //Алфавит для шифрования
    public static final List<Character> ALPHABET = new ArrayList<>(Arrays.asList('А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
            'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ',
            'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я', 'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
            'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'ю', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ';', '-', ' ', '0', '1', '2', '3', '4','5', '6', '7', '8', '9',
            '\\', '/', '+', '=', '%', '(', ')', '*', '№', '<', '>'));
    //500 самых распространенных слов для выбора наболее качественной расшифровки
    public static final String DICTIONARY = "И в не он на я что тот быть с а весь это как " +
            "она по но они к у ты из мы за вы так же от сказать этот который мочь человек " +
            "о один еще бы такой только себя свое какой когда уже для вот кто да говорить " +
            "год знать мой до или если время рука нет самый стать большой даже другой наш " +
            "свой ну под где дело есть сам раз чтобы два там чем глаз жизнь первый день тута во " +
            "ничто потом очень со хотеть ли при голова надо без видеть идти теперь тоже стоять друг дом " +
            "сейчас можно после слово здесь думать место спросить через лицо что тогда ведь хороший каждый " +
            "новый жить должный смотреть почему потому сторона просто нога сидеть понять иметь конечный делать " +
            "вдруг над взять никто сделать дверь перед нужный понимать казаться работа три ваш уж земля конец " +
            "несколько час голос город последний пока хорошо давать вода более хотя всегда второй куда пойти" +
            " стол ребенок увидеть сила отец женщина машина случай ночь сразу мир совсем остаться об вид " +
            "выйти дать работать любить старый почти ряд оказаться начало твой вопрос много война снова ответить " +
            "между подумать опять белый деньги значить про лишь минута жена посмотреть правда главный страна свет " +
            "ждать мать будто никогда товарищ дорога однако лежать именно окно никакой найти писать комната " +
            "Москва часть вообще книга маленький улица решить далекий душа чуть вернуться утро некоторый " +
            "считать сколько помнить вечер вечер пол таки получить народ плечо хоть сегодня бог вместе " +
            "взгляд ходить зачем советский русский бывать полный прийти палец Россия любой история " +
            "наконец мысль узнать назад общий заметить словно прошлый уйти известный давно слышать слушать " +
            "бояться сын нельзя прямо долго быстро лес похожий пора пять глядеть оно сесть имя ж разговор " +
            "тело молодой стена красный читать право старик ранний хотеться мама оставаться высокий путь поэтому " +
            "совершенно кроме тысяча месяц брать написать целый огромный начинать спина настоящий пусть язык точно " +
            "среди чувствовать сердце вести иногда мальчик успеть небо живой смерть продолжать девушка образ ко " +
            "забыть вокруг письмо власть черный пройти появиться воздух разный выходить просить брат собственный " +
            "отношение затем пытаться показать вспомнить система четыре квартира держать также любовь солдат откуда " +
            "чтоб называть третий хозяин вроде уходить подойти поднять особенно спрашивать начальник оба " +
            "бросить школа парень кровь двадцать солнце неделя послать находиться ребята поставить встать например " +
            "шаг мужчина равно нос мало внимание капитан ухо туда сюда играть следовать рассказать великий " +
            "действительно слишком тяжелый спать оставить войти длинный чувство молчать рассказывать отвечать " +
            "становиться остановиться берег семья искать искать генерал момент десять начать следующий личный " +
            "труд верить группа немного впрочем видно являться муж разве движение порядок ответ тихо знакомый " +
            "газета помощь сильный скорый собака дерево снег сон смысл смочь против бежать двор форма простой " +
            "приехать иной кричать возможность общество зеленый грудь угол открыть происходить ладно черный век " +
            "карман ехать немец наверное губа дядя приходить часто домой огонь писатель армия состояние зуб очередь " +
            "кой подняться камень гость показаться ветер собираться попасть принять сначала либо поехать услышать " +
            "уметь случиться странный единственный рота закон короткий море добрый темный гора врач " +
            "край стараться лучший";



    //входящие данные для демонстрации
    public static final String DEMO_INPUT = "У лукоморья дуб зелёный Златая цепь на дубе том:";
    //ключ для демонстрации
    public static final String DEMO_KEY = "2";



}
