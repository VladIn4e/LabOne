import javax.swing.*;

//Главный клас игры
public class game {

    //Главный метод запускающий игру
    public static void main(String[] args){

        // Вызов диалогового окна для ввода сложности игры
        String rez = JOptionPane.showInputDialog(null, "Введите сложность игры от 1 до 7:", "Сложность игры", 1);

        // Помещение результата выбора в переменную
        int slogn = rez.charAt(0) - '0';

        if((slogn >= 1) && (slogn <= 7))
        {
            //Создание ,окна, в котором находится игровое поле
            okno window = new okno(slogn);
        }
    }
}
//