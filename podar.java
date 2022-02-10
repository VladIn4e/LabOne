import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Класс для подарков
class podar {
    public Image img;
    public int x, y;
    public Boolean act;
    private Timer timerUpdate;

    public podar(Image img)
    {
        // Создание и настройка таймера
        timerUpdate = new Timer(500,new ActionListener(){
            public void actionPerformed(ActionEvent e){
                vniz();
            }
        });

        // Передача изображения из круглых скобок Конструктора в переменную
        this.img = img;
        // Изначально подарок не октивен
        act = false;
    }

    // Мет. выполняющий активизацию подарка на игровом поле
    // и его вывод сверху поля
    public void start()
    {
        timerUpdate.start(); // Запуск таймера
        y = 0; // Отступ сверху
        // Отступ слева в пикселях получаем случайным образом от 0 до 700
        x = (int)(Math.random()*700);
        act = true; // Делаем подарок активным
    }

    // Мет. осущест. движение подарка в низ
    public void vniz()
    {
        if (act == true) {
            y += 6;// Увеличеваем отступ
        }
        if((y + img.getHeight(null)) >= 470){ // Если подарок достиг пола
            timerUpdate.stop();
        }
    }

    // Мет. отрисовующий подарок елси тот активен
    public void draw(Graphics gr)
    {
        if (act == true)
        {
            gr.drawImage(img, x, y, null); // Рисуем подарок
        }
    }
}