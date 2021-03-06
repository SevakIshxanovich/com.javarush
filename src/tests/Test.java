package tests;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import jdk.jfr.internal.StringPool;

import java.lang.management.GarbageCollectorMXBean;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        Child child = new Child();
        child = null;
        System.gc();

    }
}

/*
Поиск и замена

Ctrl + F	        Поиск
F3	                Поиск вперед
Shift + F3	        Поиск назад
Ctrl + R	        Замена
Ctrl + Shift + F	Поиск в проекте
Ctrl + Shift + R	Замена в проекте
Ctrl + Shift + S	Поиск используя шаблон
Ctrl + Shift + M	Замена используя шаблон


Редактирование/генерация кода

Ctrl + Space	        Компоненты (классы, методы, переменные)
Ctrl + Shift + Space	«Смарт Код» — фильтрует по списку методов и переменных ожидаемого типа
Ctrl + Alt + Space  	Название класса в проекте независимо от импортируемых классов
Ctrl + Shift + Enter	Завершаем оператор
Ctrl + P	            Данные о параметрах (в пределах сигнатуры вызываемого метода)
Ctrl + F1	            Показать описания ошибки или предупреждения
Alt + Insert	        Генерируем код (Getters, Setters, Constructors, hashCode/equals, toString)
Ctrl + O            	Переопределяем метод
Ctrl + I	            Реализуем метод
Ctrl + Alt + T	        Помещаем часть кода в (if..else, try..catch, for, synchronized, etc.)
Ctrl + /	            Однострочный комментарий / убрать комментарий
Ctrl + Shift + /	    Много строчный комментарий / убрать комментарий
Ctrl + W	            Выбирает последовательность возрастающих блоков кода
Alt + Enter	            Показать исправление
Ctrl + Alt + L	        Форматируем код
Ctrl + Alt + O	        Удаляем лишние/неиспользуемые import
Ctrl + Alt + I	        Авто-отступ линии
Tab / Shift + Tab	    Отступ или удаление отступа выбранной части кода
Ctrl + X or Shift + Delete	Вырезать часть кода
Ctrl + C or Ctrl + Insert	Копировать часть кода
Ctrl + V or Shift + Insert	Вставить фрагмент кода из буфера обмена
Ctrl + Shift + V	        Вставить последний фрагмент кода из буфера обмена
Ctrl + D	                Дублировать строку
Ctrl + Y	                Удалить строку
Ctrl + Shift + J	        Объединить строку
Ctrl + Enter	            Разделить строки
Shift + Enter	            Начать с новой строки
Ctrl + Shift + U	        Переключить стоящее слово рядом с кареткой в нижний / верхний регистр
Ctrl + Shift + ] / [	    Выделить код до конца / начала блока
Ctrl + Delete	            Удалить слово после каретки
Ctrl + Backspace	        Удалить слово перед каретки
Ctrl + NumPad+/-	        Развернуть / свернуть блок кода
Ctrl + Shift + NumPad+	    Развернуть все
Ctrl + Shift + NumPad-	    Свернуть все
Ctrl + F4	                Операция «закрыть активное окно редактора»


Поиск использования кода

Alt + F7 / Ctrl + F7	Найти использования / Найти использования в файле
Ctrl + Shift + F7	    Выделить используемое в файле
Ctrl + Alt + F7	        Показать использования


Компиляция/выполнение/отладка

Ctrl + F9	        Структурировать проект и собрать измененные файлы
Ctrl + Shift + F9	Компилируем выбранный файл пакета или модуля
Alt + Shift + F10	Выбираем конфигурацию и запускаем
Alt + Shift + F9	Выбираем конфигурацию и запускаем в debug режиме
Shift + F10     	Запускаем
Shift + F9	        Запускаем в debug режиме
Ctrl + Shift + F10	Выполняем в контексте конфигурации из редактора
F8	                Шаг обхода
F7	                Шаг
Shift + F7	        «Умный» шаг
Shift + F8	        Выход
Alt + F9	        Запуск до курсора
Alt + F8	        Вычислить выражение
F9              	«Резюме» программы
Ctrl + F8	        Переключаем точку остановки
Ctrl + Shift + F8	Показываем точки остановки


Навигации

Ctrl + N	            Переход к классу
Ctrl + Shift + N	    Переход к файлу
Ctrl + Alt + Shift + N	Переход к символу
Alt + Right/Left	    Перейти к следующей / предыдущей вкладки редактора
F12                 	Вернуть предыдущее окно инструмента
Esc	                    Переход к редактору
Shift + Esc	            Скрываем активное или последнее активное окно
Ctrl + Shift + F4	    Закрыть активное run/messages/find/…-окно
Ctrl + G	            Переход к определенной строки
Ctrl + E	            Показать последние файлы
Ctrl + Alt + Left/Right	    Переход назад / вперед
Ctrl + Shift + Backspace	Переход в последнее местоположение Редактора
Ctrl + B or Ctrl + Click	Переход к объявлению
Ctrl + Alt + B	            Переход к реализации
Ctrl + Shift + I	        Открыть быстрый поиск по определению
Ctrl + Shift + B	        Переход к объявления типа
Ctrl + U	                Переход к суперметоду или классу
Alt + Up/Down	            Перейти к предыдущему / следующему методу
Ctrl + ] / [	            Переход в конец / начало блока
Ctrl + F12	                Показать файловую структуру
Ctrl + H	                Показать иерархии типа
Ctrl + Shift + H	        Показать иерархии метода
Ctrl + Alt + H	            Показать иерархии вызовов
F2 / Shift + F2         	Выделение следующей / предыдущей ошибки
F4 / Ctrl + Enter	        Произвести редактирование исходника / Просмотр
Alt + Home	                Показывать панель навигации
Ctrl + #[0-9]	            Переход к номеру закладки


Рефакторинг

F5	            Копировать
F6	            Перемещение
Alt + Delete	Безопасно удалить
Shift + F6	    Переименование
Ctrl + F6	    Изменение сигнатуры
Ctrl + Alt + N	Встраивание
Ctrl + Alt + M	Помещение в метод
Ctrl + Alt + V	Помещение в переменную
Ctrl + Alt + F	Помещение в поле
Ctrl + Alt + C	Помещение в константу
Ctrl + Alt + P	Помещение в параметр


Live template

Ctrl + Alt + J	Окружить с «живым шаблоном»
Ctrl + J	    Вставьте живой шаблон
iter	        Итерация как в SDK 1.5
inst	        Проверка типа объекта через InstanceOf
itco	        Итерирование элементов java.util.Collection
itit	        Итерирование элементов java.util.Iterator
itli	        Итерирование элементов java.util.List
psf	            Развертывание до public static final
thr	            Развертывание до throw new
sout	        Развертывание до System.out.println()


Работа с интерфейсом IDE

Alt + #[0-9]	        Открыть соответствующее окно инструмента
Ctrl + S	            Сохраняем все
Ctrl + Alt + Shift + S	Открываем окно Структура проекта
Ctrl + Shift + A	    Находим нужное действие
Ctrl + Tab	            Переключает вкладки и окна

 */