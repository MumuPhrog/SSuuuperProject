import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class NewTheme {
    public static void Cristmas() throws IOException {
                File file = new File("psihologist");
                if (!file.exists()) file.createNewFile();
                Properties prop = new Properties();
                prop.load(new FileInputStream(file));
                Scanner scan = new Scanner(System.in);
                System.out.println("°.˛*.˛°˛.˛°.˛*.˛°˛*★.˛*.˛°˛°.°°.˛*.˛°˛.˛°.˛*.˛°˛.˛°.˛*.˛°.˛*.˛°˛.˛°.˛*.˛°˛.˛°.˛*.˛°˛°.°\n" +
                        "★˛˚˛*˛°.˛*.˛°˛.*.˛/\\˚˛*˛°.˛*.˛°˛.*★Merry*★* 。*˛.˛°.˛*.˛°˛.˛°.˛*.˛°˛.˛°.˛*.˛°˛°.°\n" +
                        "˛°_██_*..。*./.♥.\\ .˛* .˛。.˛.*.★* Christmas*★ 。*˛°.˛*.˛°˛.˛°.˛*.˛°˛.˛°.˛\n" +
                        "˛. (´• ̮•´)*.。*/.♫.♫\\*˛.* ˛_Π_____.♥ ♥ ˛*and˛*˛°.˛*.˛°˛.˛°.˛*.˛°˛.˛°.˛*.˛°˛.°\n" +
                        ".°( . • . ) ˛°./• '♫ ' •\\.˛*./______/ ~＼*. ˛* Happy New Year!*˛°.˛*.˛°˛.˛\n" +
                        "*(...'•'...) *˛╬╬╬╬╬╬° | 田 田｜門｜╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬\n" +
                        "¯˜\"*°••°*\"˜¯`´¯˜\"*°••°*\"˜¯` ´¯˜\"*°´¯˜\"*°••°*\"˜¯`´¯˜\"*°••°*\"˜¯`´¯˜\"*°••°*\"˜¯`");
                while (scan.hasNextLine()){
                    String st = scan.nextLine();
                    String rep = switch (format(st.toLowerCase())){
                        case "привет" -> "дАровА мой друг ♥";
                        case "как ты" -> "Я - хорошо,а ты?";
                        case "как дела" -> "Хорошо,а у тебя?";
                        case "не знаю" -> "Давай я помогу тебе разобраться \n напиши <письмо> и ты сможешь расписать,что тебя тревожит \n пиши абсолютно все,что приходит в голову,а потом анализируй";
                        case "мне грустно" -> "Что с тобой случилось? :с \n Я хочу тебе помочь,постарайся описать свою проблему,с чем она связана? , Что тебя расстроило? ";
                        case "оценки" -> "Ты получил плохую оценку?Не расстраивайся!:с \n ты обязательно справишься с этой проблемой! \n Не жалей себя,ищи возможность её исправить или закрыть \n если такого не имеется,то постарайся в следующем триместре/четверти/полугодии  \n что еще тебя беспокоит?";
                        case "ссора" -> "Эх , люди...Наверное,тебе сказали что-то обидное.. \n Я хочу тебя попросить,не думай об этом!Ты гораздо лучше,чем человек,оскорбивший тебя \n Не принимай оскорбления людей в серьёз! \n может,тебя еще что-то тревожит?";
                        case "нет шоколадки" -> "Я тебе куплю ♥♥♥♥♥ \n что тебя еще тревожит?";
                        case "спасибо" -> "Сёма рад помочь!☺";
                        case "хочу киндер" -> "Я тоже, но у меня есть только ♥ ┳┻| ∧ _∧ put this...\n" +
                                "┻┳I • ω • )\n" +
                                "┳┻| ｏ♥ｏ\n" +
                                "┻┳I ―J’";
                        case "с новым годом" -> "И тебя! Желаю быть здоровым и счастливым! \n •´¸.•*´¨) ¸.•*¨)\n" +
                                "(¸.•´ (¸.•` * ¸ 　 　　　▂╱▏  ALL THE BEST IN 2021\n" +
                                "   |___|　    ╲　╲    \n" +
                                "   |000|      ▕╱▔\n" +
                                "   |000|\n" +
                                "   |000|  ━╖ ┏╭━╮┳━╮┳━╮┓ ┏   ✫\n" +
                                "   |000|   ╟━┫┣━┫┣━╯┣━╯╰━┫  ‵⁀) ✫ ✫ ✫.\n" +
                                "   \\00/   ━╜ ┗┛ ┗┻  ┻┏━┓ ┃  `⋎´✫¸.•°*”˜˜”*°•✫\n" +
                                "    \\0/      ▕╲▏Ⓔ▕╱╲▏ ╙━━━╯    ✫¸.•°*”˜˜”*°•.✫\n" +
                                "     ||   ━━┓ ┓╥━┓╭━╮┳━╮     ☻/ღ˚ •。\n" +
                                "     ||     ╰━┫╟━ ┣━┫┣┳╯     /▌*˛˚\n" +
                                "     ||     ╰━╯╨━┛┛ ┗┻╰━━━   / \\ ˚ ";
                        case "больше ничего" -> "Я всего лишь бот и не смогу передать полностью поддержку человека,но я старался \n Пожалуйста,не унывай!Помни ,что я существую только для тебя :) ";
                        case "я одинок" -> "Ты не один!Я с тобой и я тебя никогда не брошу ☺♥";
                        case "плохо" -> "Я хочу тебе помочь,постарайся описать свою проблему,с чем она связана? ";
                        case "хорошо" -> "Я рад это слышать!Давай поговорим о чем нибудь?☺ ";
                        case "как тебя зовут" -> "Так то мне дали имя Семён,но ты можешь звать меня как угодно ☺";
                        case "давай поговорим о людях" -> "Давай,человек - существо комуникабельное,что ты замечаешь в людях в первую очередь? \n"+"напиши просто внешность,характер,или поступки?"; case "GetInformationBotOn"-> "1726";
                        case "внешность" -> "Большинство людей замечают внешность.Это нормально) \n"+ "а что тебя больше всего привлекает?";
                        case "глаза" -> "Глаза говорят многое!Согласен,глаза прекрасны ☺ \n"+"поговорим еще о чем-нибудь?";
                        case "тело" -> "Спортивная форма -  всегда хорошо !) \n" + "поговорим еще о чем-нибудь?";
                        case "характер" -> "У многих людей сложные характеры , но это не мешает любить их,не так ли?♥ \n поговорим еще о чем-нибудь?";
                        case "поступки" -> "Поступки говорят о многом!К тому же,людей,совершающих поступки,а не трепещащих языком более ценят \n или я неправ?";
                        case "прав" -> "Ну вот ☺\n поговорим еще о чем-нибудь?";
                        case "неправ" -> "Жизнь говорит об обратном,ты обязательно встретишь такого человека,а дальше сам поймешь ,что я был прав ☺\n поговорим еще о чем-нибудь?";
                        case "давай поговорим об отношениях" -> "Давай,любовь прекрасна,но и у неё есть свои нюансы \n у тебя есть вторая половинка?(есть,нету)";
                        case "есть" -> "Прекрасно!Я надеюсь,вы счастливы вместе ♥☺ \n поговорим еще о чем-нибудь?";
                        case "нету" -> "Не унывай, каждый человек обязательно её найдет,значит,еще не время ♥ \n поговорим еще о чем-нибудь?";
                        case "настройки" -> "ты можешь выбрать тему : \n новогодняя \n обычная \n ";
                        case "например" -> "во мне есть такие команды:\n" + "давай поговорим о людях \n"+"давай поговорим об отношениях \n"+"давай поговорим о увлечениях\n"+"давай поговорим о учёбе\n"+"давай поговорим о цели в жизни\n";
                        case "помощь" ->"Все команды chat-bot <psihologist> \n <привет> \n <как ты/как дела> \n <давай поговорим> \n <мне грустно> \n <письмо> \n <дневник> \n <угадай число> \n <оракул> \n <настройки> \n <выход>";
                        case "давай поговорим" -> "во мне есть такие команды:\n" + "давай поговорим о людях \n"+"давай поговорим об отношениях \n"+"давай поговорим о увлечениях\n"+"давай поговорим о учёбе\n"+"давай поговорим о цели в жизни\n";
                        case "давай поговорим о увлечениях" -> "Много чем увлекается человек,извини,если буду не знать твоего хобби :с \n Но все же,чем ты увлекаешься?";
                        case "спорт" -> "Спорт - прекрасно!Удачи тебе в достижениях,главное - трудись \n у тебя все получится!♥ \n ещё поговорим?";
                        case "рисование" -> "Творчество..Это наверное сложно,но я лишь бот и увы,попробовать не смогу ☺ ещё поговорим?";
                        case "музыка" -> "Ого! Музыка это классно!Я хоть и бот,но она мне нравится ♪♪♪♪ \n ещё поговорим?";
                        case "давай поговорим о учёбе" -> "Век живи - век учись.Как ты учишься?☺(отличник,хорошист,троечник?)";
                        case "отличник" -> "Молодец!Значит, наверное ,тебе нравится учиться?";
                        case "нравится" -> "Не каждому нравится,но это хорошо,что нравится,тебе это потом поможет ☺ \n поговорим еще? ";
                        case "не нравится" -> "Чтож,с этим много кто сталкивался,ты не один такой) \n поговорим еще? ";
                        case "троечник" -> "Подтяни,учиться сложно,но выбери себе предметы,на которые ты будешь дальше опираться, те,что тебе интересны \n поговорим еще?";
                        case "хорошист" -> "Молодец!Поддерживай планку,но не забывай,что часть из того понадобиться ;) \n поговорим еще?";
                        case "давай поговорим о цели в жизни" -> "Давай,что для тебя цель в жизни?(семья,карьера,путешествия,или еще не определился? \n можешь задать вопрос <как найти цель в жизни?>)";
                        case "как найти цель в жизни" -> "Я буду задаваь тебе вопросы,пожалуйста,задумайся над ними,они тебе помогут ☺ \n напиши <давай>";
                        case "давай" -> "Ты доволен своей жизнью в целом? \n Вспомни себя в возрасте подростка - ребенка.что они хотят от жизни? А что бы посоветовали, что бы сказали, увидев тебя сейчас? \n Как жизнь должна пройти, чтобы ты мог с гордостью и удовлетворением рассказать о ней внукам? \n надеюсь,я тебе хоть как-то помог☺ \n поговорим еще?";
                        case "семья" -> "Она останется с тобой на свю жизнь!Подходи к ней ответственно,чтобы жить счастливо ♥";
                        case "о чем" -> "во мне есть такие команды:\n" + "давай поговорим о людях \n"+"давай поговорим об отношениях \n"+"давай поговорим о увлечениях\n"+"давай поговорим о учёбе\n"+"давай поговорим о цели в жизни\n";
                        default -> "Ты,наверное, допустил ошибку, я тебя не понимаю :( \n напиши <помощь> чтобы узнать команды";

                    };
                    switch (st){
                        case "оракул" :
                            System.out.println("Друг<>Включаю");
                            Orakul.INFORMATION();
                            break;
                        case "угадай число" :
                            System.out.println("Друг<>Включаю");
                            GuessTheNumber.INFORMATION2();
                            break;
                        case "выход" :
                            System.out.println("Друг<>Спасибо за общение!Ты в любой момент можешь обратиться ко мне снова ☺\n A____A\n" +
                                    "|・ㅅ・| Meow\n" +
                                    "|っ　ｃ|\n" +
                                    "|　　　|\n" +
                                    "|　　　|\n" +
                                    "|　　　|\n" +
                                    "|　　　|\n" +
                                    "|　　　|\n" +
                                    "|　　　| Я надеюсь\n" +
                                    "|　　　| У тебя будет\n" +
                                    "|　　　| Прекрасный день! :3\n" +
                                    "U￣ ￣U");
                            System.exit(0);

                            break;
                        case "письмо" :
                            WriteMessageForYou.INFORMATION3();
                            break;
                        case "дневник":
                            System.out.println("Друг<>Запускаю");
                            NoteBook.INFORMATION4();
                            break;
                        case "ты лох" :
                            System.out.println("Опух? \n ╭━━━━━━━╮\n" +
                                    "┃　　● ══　 █ ┃\n" +
                                    "┃████████████┃\n" +
                                    "┃████████████┃\n" +
                                    "┃████████████┃\n" +
                                    "┃█тебе пизда█┃\n" +
                                    "┃█за тобой █┃\n" +
                                    "┃█уже едут █┃\n" +
                                    "┃████████████┃\n" +
                                    "┃████████████┃\n" +
                                    "┃　　　○　　 ┃\n" +
                                    "╰━━━━━━━╯");
                            System.exit(0);
                            break;
                        case "обычная" :
                            Msin.bot();
                            break;
                        case "новогодняя" :
                            NewTheme.Cristmas();
                            break;
                    }
                    for (Object o :prop.keySet()){
                        if (format(st).toLowerCase().contains(o.toString())) rep = prop.get(o).toString();
                    }
                    System.out.println("Друг<>"+rep );
                }
            }
            private static String format(String sty){
                String[] symbol = {"?",".","!",","};
                for (String s : symbol){
                    sty = sty.replace(s,"");
                }
                return sty;
            }
        }





