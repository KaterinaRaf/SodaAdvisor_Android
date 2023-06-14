package com.example.sodaadvisor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {

    private SodaExpert expert = new SodaExpert(); // здесь мы обьявили поле - класс SodaExpert, в котором есть нужный нам метод рекомендаций

    @Override  // значит что мы используем метод, который уже реализован за нас в классе Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // здесь сообщается о том, что эта активность(MainActivity) использует макет activity_main.xml
        // R - специальный класс в Java, который позволяет получать ссылки на ресурсы в приложении
    }


    // Наш метод должен быть объявлен public и void, и иметь в аргументе класс View view
    public void onClickFindSoda(View view) {
        TextView brands = (TextView) findViewById(R.id.brands); // получили ссылку на обьект класса TextView с именем brands. После этого мы можем вызывать методы объекта TextView

        Spinner color = (Spinner) findViewById(R.id.color); // получили ссылку на объект типа Spinner(выпадающий список)

        String sodaType = String.valueOf(color.getSelectedItem()); // Получили вариант выбранный в Sprinner(они возвращают объекты)

        // brands.setText(sodaType); // выводим выбранный вариант

        // получаем рекомендацию по газировке
        List<String> brandsList = expert.getBrands(sodaType);
        StringBuilder brandsFormatted = new StringBuilder(); // обьявили этот класс, для удобной работы со строками

        for (String brand : brandsList) { // итерируемся по нашему списку рекомендаций, и записываем каждый элемент в коллекцию строк
            brandsFormatted.append(brand).append('\n');
        }

        // задаёт текст компонента (выводим сорт газировки)
        brands.setText(brandsFormatted);
    }
}