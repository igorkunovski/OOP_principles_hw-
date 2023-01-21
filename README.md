**HW2**

Программа при запуске предварительно создает несколько животных и помещает их в зоопарк.
Далее появляется меню пользователя (рисунок 1), и с помощью выбора предлагает пользователю следующие действия:

1. Добавление животного в зоопарк. После выбора данной опции откроется новое меню пользователя для выбора типа животного 
и далее для ввода характеристик нового животного (рисунок 2).
2. Удаление животного из зоопарка по номеру.
3. Информация о животном по номеру.
4. Показать всех животных зоопарка
5. Издавание звука животного под выбранным номером
6. Издавание звуков всех находящихся в данный момент в зоопарке животных
7. Выход из меню и программы.

*Номер животного присваевается динамически при добавлении его в зоопарк. Перед выбором выводится список всех животных с
номерами на данный момент.*

При выборе или вводе некорректных данных обрабатывается InputMismatchException и пользователь перенаправляется на начало 
текущей операции.

- Классы для удобства обработки кода и добавления новых данных (например тип животного) распределены по тематическим папкам. 
- Использованы основные принципы ООП: инкапсуляция, наследование, полиморфизм и абстракция с помощью абстрактных 
классов и интерфейсов.
- Класс для запуска *Main_hw2.java*
