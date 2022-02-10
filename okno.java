//Импорт
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.PortUnreachableException;

//Класс окна ы котором размещенно игровое поле
class okno extends JFrame
{
    private pole gameP; // Закрытая Переменная класса - игровое поле
    private int slogn; // Закрытая переменная сложности

    private class myKey implements KeyListener
    {
        public void keyPressed(KeyEvent e)
        {
            int key_ = e.getKeyCode();
            if(key_ == 27)System.exit(0);
            else if(key_ == 37)
            {
                if(gameP.x - 30 > -48)gameP.x -= 30;
                else gameP.x = 752;
            }
            else if(key_ == 39)
            {
                if(gameP.x + 30 < 752)gameP.x += 30;
                else gameP.x = -48;
            }
        }

        public void keyReleased(KeyEvent e){}
        public void keyTyped(KeyEvent e){}
    }

    //Конструктор класса
    public okno(int slogn)
    {
        //Подключение обработчика событий для клав. к окну
        addKeyListener(new myKey());
        //Устоновка октивности окна
        setFocusable(true);

        //Задание размеров и полоения окна
        setBounds(0,0,800,600);
        //Задание заголовка окна
        setTitle("Игра: Новогодний дождь");

        //Создание объекта инровое поле
        gameP = new pole(slogn);
        Container con = getContentPane();
        con.add(gameP);

        setVisible(true);
    }
}