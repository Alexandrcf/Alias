package com.example.alias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class GameActivityAlias extends AppCompatActivity {

    private ArrayList<String> arrayListWords = new ArrayList<>();
    private Button buttonPositive, buttonNegative, buttonStart;
    private TextView tvQuestion, tvPlus, tvMinus, tvTime, tvTeam1, tvTeam2;
    private int countTeam1 = 0;
    private int countTeam2 = 0;
    private int countPlus = 0;
    private int countMinus = 0;
    private int mCurrentIndex = 0;
    private double teamIndex = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_alias);

        initView();
        initArray();
        buttonActions();
    }

    private void initView() {
        buttonPositive = (Button) findViewById(R.id.button_positive);
        buttonNegative = (Button) findViewById(R.id.button_negative);
        buttonStart = (Button) findViewById(R.id.button_start);
        tvPlus = (TextView) findViewById(R.id.tv_plus);
        tvMinus = (TextView) findViewById(R.id.tv_minus);
        tvQuestion = (TextView) findViewById(R.id.tv_question);
        tvTime = (TextView) findViewById(R.id.tv_time);
        tvTeam1 = (TextView) findViewById(R.id.tv_team1);
        tvTeam2 = (TextView) findViewById(R.id.tv_team2);

        tvPlus.setVisibility(View.INVISIBLE);
        tvMinus.setVisibility(View.INVISIBLE);
        buttonPositive.setEnabled(false);
        buttonNegative.setEnabled(false);

        tvPlus.setText("+" + countPlus);
        tvMinus.setText(countMinus + "");
    }

    private void buttonActions() {
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonPositive.setVisibility(View.VISIBLE);
                buttonNegative.setVisibility(View.VISIBLE);
                buttonPositive.setEnabled(true);
                buttonNegative.setEnabled(true);
                tvPlus.setVisibility(View.INVISIBLE);
                tvMinus.setVisibility(View.INVISIBLE);
                countPlus = 0;
                countMinus = 0;
                tvPlus.setText("+" + countPlus);
                tvMinus.setText("" + countMinus);
                timer();
                shuffleArray();
                tvQuestion.setText(arrayListWords.get(mCurrentIndex));
            }
        });
        buttonPositive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentIndex++;
                if (mCurrentIndex >= arrayListWords.size()){
                    mCurrentIndex = 0;
                }
                tvQuestion.setText(arrayListWords.get(mCurrentIndex));
                tvPlus.setVisibility(View.VISIBLE);
                tvMinus.setVisibility(View.VISIBLE);
                countPlus++;
                tvPlus.setText("+" + countPlus);
            }
        });
        buttonNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentIndex++;
                tvQuestion.setText(arrayListWords.get(mCurrentIndex));
                tvPlus.setVisibility(View.VISIBLE);
                tvMinus.setVisibility(View.VISIBLE);
                //count--
                countMinus--;
                tvMinus.setText(countMinus + "");
                //вывод count в TV
            }
        });

    }

    private void timer() {
        buttonStart.setEnabled(false);
        CountDownTimer countDownTimer = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millis) {
                tvTime.setText("Время: " + (int) (millis / 1000) +" сек");
            }

            @Override
            public void onFinish() {
                buttonPositive.setVisibility(View.INVISIBLE);
                buttonNegative.setVisibility(View.INVISIBLE);
                buttonStart.setEnabled(true);
                if (teamIndex % 2 == 0){
                    countTeam1 = countTeam1 + (countPlus + countMinus);
                    tvTeam1.setText("Команда 1: " + countTeam1);
                }
                else {
                    countTeam2 = countTeam2 + (countPlus + countMinus);
                    tvTeam2.setText("Команда 2: " + countTeam2);
                }
                teamIndex++;
            }
        }.start();
    }

    private void shuffleArray(){
        Collections.shuffle(arrayListWords);
    }

    private void initArray() {
        arrayListWords.add("Дом");
        arrayListWords.add("Яблоко");
        arrayListWords.add("Аквариум");
        arrayListWords.add("Комар");
        arrayListWords.add("Спортсмен");
        arrayListWords.add("Монитор");
        arrayListWords.add("Акула");
        arrayListWords.add("Мост");
        arrayListWords.add("Лупа");
        arrayListWords.add("Солнце");
        arrayListWords.add("Звезда");
        arrayListWords.add("Чеснок");
        arrayListWords.add("Провод");
        arrayListWords.add("Перец");
        arrayListWords.add("Шарик");
        arrayListWords.add("Страус");
        arrayListWords.add("Мотор");
        arrayListWords.add("Город");
        arrayListWords.add("Пластилин");
        arrayListWords.add("Расстояние");
        arrayListWords.add("Жена");
        arrayListWords.add("Сок");
        arrayListWords.add("Лень");
        arrayListWords.add("Ведро");
        arrayListWords.add("Морж");
        arrayListWords.add("Пират");
        arrayListWords.add("Начальник");
        arrayListWords.add("Дым");
        arrayListWords.add("Береза");
        arrayListWords.add("Море");
        arrayListWords.add("Пылесос");
        arrayListWords.add("Укус");
        arrayListWords.add("Ваза");
        arrayListWords.add("Рыба");
        arrayListWords.add("Лопата");
        arrayListWords.add("Месяц");
        arrayListWords.add("Скелет");
        arrayListWords.add("Лодка");
        arrayListWords.add("Котенок");
        arrayListWords.add("Качели");
        arrayListWords.add("Занятие");
        arrayListWords.add("Соловей");
        arrayListWords.add("Страх");
        arrayListWords.add("Конфета");
        arrayListWords.add("Остров");
        arrayListWords.add("Озеро");
        arrayListWords.add("Сумка");
        arrayListWords.add("Праздник");
        arrayListWords.add("Браслет");
        arrayListWords.add("Кошелек");
        arrayListWords.add("Окно");
        arrayListWords.add("Сон");
        arrayListWords.add("Хлеб");
        arrayListWords.add("Луна");
        arrayListWords.add("Собака");
        arrayListWords.add("Кресло");
        arrayListWords.add("Курица");
        arrayListWords.add("Крыша");
        arrayListWords.add("Нога");
        arrayListWords.add("Друзья");
        arrayListWords.add("Дед");
        arrayListWords.add("Календарь");
        arrayListWords.add("Ребенок");
        arrayListWords.add("Шайба");
        arrayListWords.add("Жилет");
        arrayListWords.add("Дневник");
        arrayListWords.add("Телефон");
        arrayListWords.add("Нос");
        arrayListWords.add("Лев");
        arrayListWords.add("Град");
        arrayListWords.add("Трава");
        arrayListWords.add("Гроза");
        arrayListWords.add("Мусор");
        arrayListWords.add("Автомобиль");
        arrayListWords.add("Скрепка");
        arrayListWords.add("Варежки");
        arrayListWords.add("База");
        arrayListWords.add("Девочка");
        arrayListWords.add("Радость");
        arrayListWords.add("Швабра");
        arrayListWords.add("Ноты");
        arrayListWords.add("Туфли");
        arrayListWords.add("Мел");
        arrayListWords.add("Парник");
        arrayListWords.add("Парик");
        arrayListWords.add("Радиация");
        arrayListWords.add("Вафли");
        arrayListWords.add("Бумага");
        arrayListWords.add("Карандаш");
        arrayListWords.add("Посуда");
        arrayListWords.add("Донор");
        arrayListWords.add("Мышка");
        arrayListWords.add("Лекарство");
        arrayListWords.add("Кондиционер");
        arrayListWords.add("Парад");
        arrayListWords.add("Юбка");
        arrayListWords.add("Зубы");
        arrayListWords.add("Семечки");
        arrayListWords.add("Чашка");
        arrayListWords.add("Брюки");
        arrayListWords.add("Штраф");
    }
}