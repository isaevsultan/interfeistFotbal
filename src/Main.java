import java.io.PrintStream;
import java.lang.management.GarbageCollectorMXBean;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/**Задача  которая  будет  выводить  информацию  о  футбольной  команде.  В  команде  должны
 быть  игроки  разных  позиций  (нападающие,  защитники,  вратарь)  и  тренер.  Каждый  игрок
 должен  иметь  имя,  фамилию,  Localdate  возраст  с  помощь  класса  Period,  рост  и  вес.
 Тренер должен иметь только имя и фамилию.
 Программа  должна  использовать  полиморфизм  и  интерфейсы  для  создания  объектов
 игроков и тренера. Интерфейс должен иметь метод для каждого игрока
 Также  программа  должна  использовать  абстракцию  для  создания  абстрактного  класса
 "Спортсмен",  от  которого  будут  наследоваться  все  игроки.  В  абстрактном  классе  должны
 быть  определены  методы  для  получения  и  установки  имени,  фамилии,  возраста,  роста  и
 веса игрока.
 Для  хранения  игроков  и  тренера  нужно  использовать  обычный  массив.  Программа
 должна выводить информацию о каждом игроке и тренере в отдельной строке.
 .**/


        Trainer trainer = new Trainer("Haver", "Endraes");
        System.out.println(trainer.getName()+" "+trainer.getSurName());
        System.out.println("-----------------------------------------");
        PlayAble[] sportsmen = new PlayAble[3];
        sportsmen[0] = new Defender("Pike","Jerar",LocalDate.of(1987,2,2),190.1f,84f);
        sportsmen[1] =  new MidfielderAttacker("Messi","Leonel",LocalDate.of(1987,6,24),170f,80f);
        sportsmen[2] = new GoalKeeper("Bufon","Erdavaer",LocalDate.of(1985,4,9),183.5f,92f);
        System.out.println(trainer.toString());
        for (PlayAble playAble:sportsmen){
            System.out.println(playAble);
            System.out.println(playAble.play());
        }



    }

}


