# Selenium-WebDriver-on-Java

И наконец-то мы добрались до тестировки. :grinning:

Это был долгий путь :tired_face:

Я хочу поблагодарить мою маму, бабушку и девушку за помощь, теперь я могу называть себя **Java automated tester**  :loudspeaker:

Модель можно назвать побежденным после выполнения следующих заданий, которые поделены на 4 уровня сложности: 

* I Can Win

* Bring It On

* Hurt Me Plenty

* Hardcore

## Условия I Can Win

При выполнении задания необходимо использовать возможности Selenium WebDriver, юнит-тест фреймворка и концепцию Page Object.

Автоматизировать следующий сценарий:

Открыть [https://pastebin.com](https://pastebin.com) или аналогичный сервис в любом браузере

Создать New Paste со следующими деталями:

* Код: "Hello from WebDriver"

* Paste Expiration: "10 Minutes"

* Paste Name / Title: "helloweb"

## Условия Bring It On

При выполнении задания необходимо использовать возможности Selenium WebDriver, юнит-тест фреймворка и концепцию Page Object. 

Автоматизировать следующий сценарий:

Открыть [https://pastebin.com](https://pastebin.com)  или аналогичный сервис в любом браузере

Создать New Paste со следующими деталями:

* Код:

      git config --global user.name  "New Sheriff in Town"

      git reset $(git commit-tree HEAD^{tree} -m "Legacy code")

      git push origin master --force

* Syntax Highlighting: "Bash"

* Paste Expiration: "10 Minutes"

* Paste Name / Title: "how to gain dominance among developers"

======================================================================

Сохранить paste и проверить следующее:

* Заголовок страницы браузера соответствует Paste Name / Title

* Синтаксис подвечен для bash

* Проверить что код соответствует введенному в поле **код**

## Условия Hurt Me Plenty

При выполнении задания необходимо использовать возможности Selenium WebDriver, юнит-тест фреймворка и концепцию Page Object. Автоматизировать следующий сценарий:

1. Открыть [https://cloud .google.com/]( https://cloud.google.com/)

2. Нажав кнопку поиска по порталу вверху страницы, ввести в поле поиска"Google Cloud Platform Pricing Calculator"

3. Запустить поиск, нажав кнопку поиска.

4. В результатах поиска кликнуть "Google Cloud Platform Pricing Calculator" и перейти на страницу калькулятора.

5. Активировать раздел COMPUTE ENGINE вверху страницы

6. Заполнить форму следующими данными:

    * Number of instances: 4

    * What are these instances for?: оставить пустым

    * Operating System / Software: Free: Debian, CentOS, CoreOS, Ubuntu, or other User Provided OS

    * VM Class: Regular

    * Instance type: n1-standard-8    (vCPUs: 8, RAM: 30 GB)

    * Выбрать Add GPUs:

      -Number of GPUs: 1

      -GPU type: NVIDIA Tesla V100

    * Local SSD: 2x375 Gb

    * Datacenter location: Frankfurt (europe-west3)

    * Commited usage: 1 Year

7. Нажать Add to Estimate

8. Проверить соответствие данных следующих полей: VM Class, Instance type, Region, local SSD, commitment term

9. Проверить что сумма аренды в месяц совпадает с суммой получаемой при ручном прохождении теста.

## Условия Hardcore

При выполнении задания необходимо использовать возможности Selenium WebDriver, юнит-тест фреймворка и концепцию Page Object. Автоматизировать следующий сценарий:

1. Открыть [https://cloud .google.com/]( https://cloud.google.com/)

2. Нажав кнопку поиска по порталу вверху страницы, ввести в поле поиска"Google Cloud Platform Pricing Calculator"

3. Запустить поиск, нажав кнопку поиска.

4. В результатах поиска кликнуть "Google Cloud Platform Pricing Calculator" и перейти на страницу калькулятора.

5. Активировать раздел COMPUTE ENGINE вверху страницы

6. Заполнить форму следующими данными:

    * Number of instances: 4

    * What are these instances for?: оставить пустым

    * Operating System / Software: Free: Debian, CentOS, CoreOS, Ubuntu, or other User Provided OS

    * VM Class: Regular

    * Instance type: n1-standard-8    (vCPUs: 8, RAM: 30 GB)

    * Выбрать Add GPUs:

      -Number of GPUs: 1

      -GPU type: NVIDIA Tesla V100

    * Local SSD: 2x375 Gb

    * Datacenter location: Frankfurt (europe-west3)

    * Commited usage: 1 Year

7. Нажать Add to Estimate

8. Выбрать пункт EMAIL ESTIMATE

9. В новой вкладке открыть [https://yopmail.com /](https://yopmail.com ) или аналогичный сервис для генерации временных email'ов

10. Скопировать почтовый адрес сгенерированный в yopmail.com

11. Вернуться в калькулятор, в поле Email ввести адрес из предыдущего пункта

12. Нажать SEND EMAIL

13. Дождаться письма с расчетом стоимости и проверить что Total Estimated Monthly Cost в письме совпадает с тем, что отображается в калькуляторе

## Установка

Т.к. это чистая Java, вам не нужно прибегать к каким-то сложным действиям. :trophy:

Для начала вам лучше использовать Java 8.

![This is an image](https://i.ibb.co/LNW93hG/javaversion.png)

Также важно использовать правильную версию WebDriver.

Во время разработки проекта я использовал версию **99.0.4844.51**. Это последний стабильный релиз на **17.03.2022**.

Dependency:

   <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->

        <dependency>
             <groupId>org.seleniumhq.selenium</groupId>
             <artifactId>selenium-java</artifactId>
             <version>4.1.1</version>
        </dependency>

[Посмотреть на мой POM.xml полностью](https://i.ibb.co/2s0jGRn/dependency-final.png).

Используйте правильную версию maven.

![This is an image](https://i.ibb.co/kSLL33z/image.png)

Далее алгоритм действий прост:

* git clone Selenium-WebDriver-on-Java

* Открыть этот проект в вашей IDE

## Работа с проектом

Работа с проектом также не требует никаких хитростей.

Как я уже сказал, вам достаточно открыть проект в вашей IDE и запустить его.

[Это структура моего проекта, надеюсь, что она поможет вам разобраться что да как.](https://ibb.co/album/Gs0wXN)

Убедитесь, что все dependency подключены.

Немного про запуск тестов.

Зависит от вас, как запускать тесты, но я бы порекомендовал использовать специальный testng.xml файл, который уже содержит нужный код для запуска hurt_me_plenty задания. Конечно, тесты можно запускать и по отдельности.

## "Особенности"

1. Я не знаю почему, но когда я запускаю программу (hurt_me_plenty and hardcore), она иногда багается и, при открытии второй страницы (search results), выдает неправильные результаты поиска. В 90% случаев программа работает как часы, но иногда случаются эти подлые 10% и я получаю [вот это](https://i.ibb.co/d7brPLR/error.png). :cry: Как я понял, это из-за того, что Selenium реализует автоматизацию очень быстро и браузер просто путается в ссылках и иногда дает не то, что нужно.

## Прочее

Все материалы были взяты из курса [EPAM Automated Testing course](https://training.epam.com/#!/Training/3044?lang=en). :test_tube:

Резервную копию заданий вы можете найти [тут](https://github.com/vitalliuss/automation-training.git), файл называется "backup.md". :file_folder: