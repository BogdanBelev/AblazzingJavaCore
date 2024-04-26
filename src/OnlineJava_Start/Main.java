package OnlineJava_Start;

public class Main
{
    public static void main(String[] args) {
        // System.out.print("OnlineJava.Hello World!");

// -----------------------1. ПЕРЕМЕННЫЕ--------------------

        // int countApples;
        // countApples = 3;
        // // System.out.println(countApples);

// //------------------------2. Примитивные типы данных------------------

        // // ------логические значение true/false
        // boolean answerBogdan = true;
        // boolean answerDenis = false;

// //-----------------------3. Целые числа----------------------------

        // // ------byte -> байт - последовательность из 8ми битов; макс значение 127 (положительные), минимальное -128 (отрицательные)

        // byte maxByte = 127;
        // byte minByte = -128;

        // // ------Short -> состоит из 2х байтов (16 битов)
        // short maxShort = 32_767;
        // short minShort = -32_768;

        // // ------Integer -> из 32 битов
        // int maxInteger = 2_147_483_647;
        // int minInteger = -2_147_483_648;

        // // ------Long -> из 64 битов
        // long maxLong = 9_223_372_036_854_775_807l;
        // long minLong = -9_223_372_036_854_775_808l;

// -----------------------3.1 Практика -------------------------

        // long countPeople = 8_122_982_791L;
        // System.out.println("Count of people in the World: " + countPeople);

        // byte countHands = 2;
        // System.out.println("Count of hands a person has: " + countHands);

        // boolean signal = true;
        // System.out.println("Is there a signal or not: " + signal);

        // short countCountry = 195;
        // System.out.println("Count of countries in the World: " + countCountry);

        // int countResidentsMonako = 38_682;
        // System.out.println("Count of residents of Monako: " + countResidentsMonako);


// // -------------------------4. Дробные числа -----------------------------------------
//         // Double -> числа с плавающей точкой, 64 бит 
//         double myBottle = 1.5;
//         // Float -> тоже число сплавающей точкой, но 32 бита
//         float cola = 0.33f; 

//         double doubleNumber = 1.21452552345235277777;
//         float floatNamber = 1.214525523452352F;
//         System.out.println(doubleNumber);
//         System.out.println(floatNamber);

// ------------------------5. Математические операции ------------------------------
        // long x = 10L;
        // int y = 4;

        // int sum = x + y;
        // System.out.println(sum);

        // int diff = x - y;
        // System.out.println(diff);

        // int multiply = x * y;
        // System.out.println(multiply);

        // float divide = (float) x / y;
        // System.out.println(divide);

        // int ext_2 = x * x;
        // System.out.println(ext);

        // -----------Программа возведение числа в любую степень
        // int extent = 15;
        // long x1 = x;
        // for (int i = 1; i < extent; i++){
        //     x *= x1;
        // }
        // System.out.println(x);

        // -------Конец программы

        // ----------------Сокращенная форма записи операций
        // x++;
        // x+= 10;
        // x*= 5;

        // ------------ Остаток от деления
        // int modulo = 6 % 2;
        // System.out.println(modulo);

        // int z = (2 + 2) * 2;
        // System.out.println(z);


        // -----------Практика 

        // int weight = 60;
        // float hight = 1.8F;
        // float index = (float) weight / (hight * hight);

        // System.out.println(index);

// -------------------------6. Символы -----------------------------------------

        // Char - character (символ) -> 16 бит - числовое представление символов (у каждого символа есть своя кодировка)
        // char letter = 36;
        // System.out.println(letter);

        // char newLine = '\n';
        // char tab = '\t';
        // char escape = '\\';
        // System.out.print("a" + newLine + tab + escape);
        // System.out.println("b");

        // char sim = 177;
        // System.out.println(sim);

// ----------------------6.1 Тип данных var----------------------------------------

        // var num = 5;
        // var str = "fiowef";
        // System.out.println(num + " " + str);

// ----------------------7. Условные конструкции----------------------------------------

        // int x = 5;
        // int y = 5;

        // if (x > y){
        //     System.out.println("x is greater than y!"); 
        // }
        // else if (x == y){
        //     System.out.println("x equals y!"); 
        // }
        // else{
        //     System.out.println("y is greater than x!"); 
        // }

// ----------------------8. Булева логика----------------------------------------

        // boolean isBoughtBread = false;
        // boolean isBoughtMilk = false;
        // boolean isBoughtSweet = true;



        // if (isBoughtBread && isBoughtMilk && !isBoughtSweet){
        //     System.out.println("You are molodec!"); 
        // }
        // else if (isBoughtBread || isBoughtMilk || !isBoughtSweet){
        //     System.out.println("You are a little molodec!"); 
        // }
        // else {
        //     System.out.println("You aren't molodec!"); 
        // }

// ----------------------8.1 Практика----------------------------------------

// -----------В банке в зависимости от суммы вклада начисляемый процент по вкладу может отличаться. 
// -----------Напишите консольную программу, в которую пользователь вводит сумму вклада.        
// -----------Если сумма вклада меньше 100, то начисляется 5%. Если сумма вклада от 100 до 200, то начисляется 7%.        
// -----------Если сумма вклада больше 200, то начисляется 10%.        
// -----------В конце программа должна выводить сумму вклада с начисленными процентами.

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter your contribution amount: ");
        // float amountContribution = scan.nextFloat();
        // int amountCategory_1 = 100;
        // int amountCategory_2 = 200;
        // float percentContribution = 0F;

        // if (amountContribution > 0){
        //     if (amountContribution < amountCategory_1){
        //         amountContribution += amountContribution * 0.05;
        //     }
        //     else if (amountContribution >= amountCategory_1 && amountContribution < amountCategory_2){
        //         amountContribution += amountContribution * 0.07;
        //     }
        //     else if (amountContribution >= amountCategory_2){
        //         amountContribution += amountContribution * 0.1;
        //     }

        //     System.out.print("Your contribution amount with percent: " + amountContribution);
        // }
        // else {
        //     System.out.print("Enter the correct contribution amount!");

        // }

// ----------------------9.Зоны видимости----------------------------------------

        // double priceCar = 10_000;

        // if(priceCar > 9_000){
        //     priceCar *= 0.95;

        // }
        // System.out.print(priceCar);

// ----------------------9. Тернарный оператор----------------------------------------

        // int money = 100;
        // int breadPrice = 20;
        // int moneyAfterShopping = money - breadPrice;
        // int childMoney = moneyAfterShopping >= 50 ? 10 : 5;
        // moneyAfterShopping -= childMoney;

        // System.out.println(childMoney);
        // System.out.println(moneyAfterShopping);

// ----------------------9.1 Практика----------------------------------------

        // int ageUser = 17;

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter your age: ");
        // int ageUser = scan.nextInt();

        // String entryAllowed = "Entry allowed! Wellcome!";
        // String entryNo = "No entry! You are not the right age!";


        // String resEntry = ageUser >= 18 ? entryAllowed : entryNo;

        // System.out.println(resEntry);

// ----------------------10. Switch----------------------------------------

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter number of day (from 1 to 7): ");
        // int numDay = scan.nextInt();

        // switch (numDay){
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;  
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("There is no such day! Enter number from '1' to '7'!");
        // }

        // ---------- в Java 17 можно использовать switch в сокращенном варианте: 

        // switch (numDay){
        //     case 1 -> System.out.println("Monday");
        //     default - >System.out.println("There is no such day! Enter number from '1' to '7'!");
        // }

// ----------------------10.1. Практика----------------------------------------

        // boolean isWorkEngine = true;
        // boolean isWorkTransmission = true;
        // boolean isFineWheel1 = true;
        // boolean isFineWheel2 = true;
        // boolean isFineWheel3 = true;
        // boolean isFineWheel4 = true;
        // int countFineWheels = 0; 

        // countFineWheels += isFineWheel1 ? 1 : 0;
        // countFineWheels += isFineWheel2 ? 1 : 0;
        // countFineWheels += isFineWheel3 ? 1 : 0;
        // countFineWheels += isFineWheel4 ? 1 : 0;

        // if(isWorkEngine && isWorkTransmission && countFineWheels >= 3) {
        //     System.out.println("The car is working!");
        // }
        // else {
        //     System.out.println("The car isn't working!");
        // }

// ----------------------11. Массив-------------------------------------

//         int x = 5;
//         int y = 10;

//         int[] array = new int[2]; 

//         array[0] = x;
//         array[1] = y;
//     ----- это первый вариант создания массива

//         int[] array = new int[] {x, y}; // ------- второй вариант 

//         int[] array = {x, y}; // третий вариант 


//         System.out.println(Arrays.toString(array));

//         System.out.println(array[1]);

// ----------------------11.1 Массивы и примитивные типы данных-------------------------------------

//         int x = 5;
//         int y = 10;

//         int[] array = {x, y};
//         int[] array_2 = array;

//         array_2[0] = 13;

//         System.out.println(Arrays.toString(array));
//         System.out.println(Arrays.toString(array_2));
//     ------ массивы при изменении элементов меняются везде, в отличие от простых переменных

// ----------------------11.2 Практика-------------------------------------

//         int[] array_1 = new int[5];
//         int[] array_2 = new int[5];


//         for(int i = 0; i < 5; i++){
//             array_1[i] = (int) (Math.random() * 6);
//             array_2[i] = (int) (Math.random() * 6);
//         }

//         System.out.println(Arrays.toString(array_1));
//         System.out.println(Arrays.toString(array_2));

//         float average_1 = 0F;
//         float average_2 = 0F;

//         for(int i = 0; i < 5; i++){
//             average_1 += array_1[i];
//             average_2 += array_2[i];
//         }

//         average_1 /= 5;
//         average_2 /= 5;

//         System.out.println("Среднее 1-е: " + average_1);
//         System.out.println("Среднее 2-е: " + average_2);
//         System.out.println("");

//         if(average_1 > average_2){
//             System.out.println("Среднее 1-е больше");
//         }
//         else if (average_2 > average_1){
//             System.out.println("Среднее 2-е больше");
//         }
//         else {
//             System.out.println("Равны");
//         }


// ----------------------12. For Each-------------------------------------

//         int[] nums = {1, 2, 3, 4};

//         // for(int num : nums){
//         //     System.out.println(num);
//         // }
//     //----- перебирает весь массив

//         for(int i = 0; i <3; i++){
//             System.out.println(nums[i]);
//         }

// ----------------------12.1 Практика-------------------------------------

//         int[] nums = {3, 2, 10, 5, 8};

//         for(int num : nums ){
//             if(num % 2 == 0){
//                 System.out.println(num);
//             }
//         }

//         System.out.println("-----------------");

//         for(int i = 0; i < nums.length; i++){
//             if(i % 2 == 0 && i != 0){
//                 System.out.println(nums[i]);
//             }
//         }

// ----------------------13. While-------------------------------------

        // int count = 0;

        // while(count < 100){
        //     System.out.println(count);
        //     count += 2;
        // }

        // while(true){
        //     count++;
        //     System.out.println(count);
        //     if(count == 10_000){
        //         break;
        //     }

        // }

// ----------------------13.1. Do While-------------------------------------

        // int count = 0;
        // do {
        //     System.out.println(count);
        //     count++;
        // }
        // while(count < 0);

        //------ отличие от обычного while - сначала выполняется действие, а потом проверка, то есть в любом случае 0 один раз выведется

// ----------------------13.2. Практика. Таблица умножения-------------------------------------


        // for(int i = 1; i < 10; i++){
        //     for(int j = 1; j < 10; j++){
        //         System.out.printf("%d\t", i * j);
        //     }
        //   System.out.println(); 
        // }

        // ----- хрен знает, что это, потом пойму)

// ----------------------14. Вложенные массивы + Практика (писал 3 часа, хз как, но это работает)------------------------------------


        // int[] group_1 = {143, 187, 190};
        // int[] group_2 = {165, 195, 180};
        // int criminalHeight = 180;
        // int[][] multiArray = {group_1, group_2};
        // int i = 0;
        // System.out.println("list of suspects: ");
        // int el_1; 

        // int[] myArray = new int[group_1.length + group_2.length];

        // int a = 0;
        // int b = 0;

        // el_1 = 0;
        // int c = 0;
        // for(int el_2 = 0; el_2 < multiArray.length; el_2++){

        //     while(el_1 < myArray.length){

        //         if(i > 2){
        //             a = 1;
        //         }
        //         if(c == 3){
        //             b = 0;
        //         }
        //         else if(c == 4){
        //             b = 1;
        //         }
        //         else if(c == 5){
        //             b = 2;
        //         }
        //         myArray[c] =  multiArray[a][b];

        //         if(a == 0){
        //             b++;
        //         }

        //         i++;
        //         System.out.print(i);
        //         System.out.print(")");
        //         System.out.print(myArray[el_1]);
        //         System.out.print(" ");
        //         el_1++;
        //         c++;
        //         if(c > 5){
        //             c--;
        //         }    
        //     }  
        // }
        // for(int k = 0; k < myArray.length; k++)
        //     if(myArray[k] == criminalHeight){
        //         System.out.println();
        //         int number = k + 1;
        //         System.out.println("Criminal №" + number + ": " + myArray[k]);
        //     }

// ----------------------15. Continue цикл------------------------------------

        // int[] results = {3, 5, 6, 2, 1};
        // for(int numResults : results){
        //     System.out.print(numResults  + " - ");
        //     if(numResults == 6){
        //         System.out.println("Rest!");
        //         continue;
        //     }
        //     System.out.println("Push up!");
        // }
        //------------ continue нужно тогда, когда мы хотим пропустить итерацию

// ----------------------15.1 Continue цикл. Практика (доработать). Ps. Я это сделаал!!!) ------------------------------------

        // String[] daysWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // int numDay = 0;
        // System.out.println("All days: " + Arrays.toString(daysWeek));
        // System.out.println("");
        // String noCommunicationDays_2;

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter count of days you won't communication: ");
        // int countNoCommunicationDays = scan.nextInt();
        // String noCommunicationDays;

        // String[] arrayNoCommunicationDays = new String[countNoCommunicationDays];

        // for(int i = 0; i < countNoCommunicationDays; i++){
        //     System.out.print("Enter the day number №" + (i+1) + ": ");
        //     if(i == 0){
        //         noCommunicationDays = scan.nextLine();
        //     }
        //     noCommunicationDays = scan.nextLine();
        //     arrayNoCommunicationDays[i] = noCommunicationDays;
        // }
        // System.out.println("");
        // System.out.println("Your days without communication: " + Arrays.toString(arrayNoCommunicationDays));



        // upperFor:
        // for(String day : daysWeek){

        //     for(int i = 0; i < arrayNoCommunicationDays.length; i++)
        //         if(day.equals(arrayNoCommunicationDays[i])){
        //             numDay++;
        //             continue upperFor;
        //         }

        //     numDay++;
        //     System.out.println(numDay + ". " + day);


        // }


        //------ upperFor: - метка для цикла, чтобы пропустить итерацию помеченного цикла continue upperFor;

        //------ daysWeek[i_1].equals(arrayNoCommunicationDays - не могу сравнить строку из массива и
        //------ строку, полученную от пользователя (вроде строки одинаковые, а выводится false)

// ----------------------16. String------------------------------------

        // Scanner scan = new Scanner(System.in);
        // String text = scan.nextLine();

        // // char symbol = 'a';
        // // String text = new String ("hey");
        // String text2 = new String ("hey");

        // System.out.println(text.equals(text2));



        //------  "hey" и "hey" равны, как данные переменных, храняться в String Pool под одним значением, поэтому при сравнении True
        //------ new String ("hey") и new String ("hey") - неравны, так как объекты хранятся в Heap в качестве ссылок, при сравнении False
        //------ .equals - нужен для сравнения текста String, выдает True

        // ----------------------17. Методы класса String------------------------------------

        // String text = "OnlineJava.Hello World!";

        // //  ----- Перевод в верхний регистр - .toUpperCase()
        // String textUpper = text.toUpperCase();
        // System.out.println(textUpper);

        // //  ----- Перевод в нижний регистр - .toLowerCase();
        // String textLower = text.toLowerCase();
        // System.out.println(textLower);

        // //  ----- Длина строки - .length();
        // int textLength = text.length();
        // System.out.println(textLength);

        // //  ----- Есть ли в тексте другой текст - .contains("OnlineJava.Hello");
        // boolean textContains = text.contains("OnlineJava.Hello");
        // System.out.println(textContains);

        // //  ----- Замена всех кусков текста (подстроки) на другой текст - text.replaceAll("W", "r");
        // // -------  W меняется на r
        // String textReplaceAll = text.replaceAll("W", "r");
        // System.out.println(textReplaceAll);

        // //  ----- Повторить текст n раз - text.repeat(10); , где n - это 10
        // String textRepeat = text.repeat(10);
        // System.out.println(textRepeat);

        // //  ----- Разбить текст на массив String - names.split(";"); где ; - это знак разделения строки на элементы массива
        // String names = "Bogdan;Denis;Dmitriy;Artem";
        // String[] namesSplit = names.split(";");
        // System.out.println(Arrays.toString(namesSplit));
        // System.out.println(namesSplit[0]);

        // //  ----- Объединение строк (конкатенация) - word_1 + word_2;
        // String word_1 = "hi";
        // String word_2 = "friend";
        // String res = word_1 + word_2;
        // System.out.println(res);

        // //  ----- Начинается на подстроку - проверка на true / false - если начинается строка на Hel, то true
        // boolean textStartsWith = text.startsWith("Hel");
        // System.out.println(textStartsWith);

        // //  ----- Заканчивается на подстроку - проверка на true / false - если заканчивается строка на World!, то true
        // boolean textEndsWith = text.endsWith("World!");
        // System.out.println(textEndsWith);

        // // ----- Обрезка строки - .substring(0, 5); - вывод строки от первого символа до пятого 
        // // ----- Если указать одно значение в скобках, то обрезка начнется с это числа до конца объекта
        // String textFirstFiveLetters = text.substring(0, 5);
        // System.out.println(textFirstFiveLetters);

        // String wordFirstFiveLetters = "word".substring(0, 2);
        // System.out.println(wordFirstFiveLetters);

        // //  ----- Можно использовать несколько методов подряд на одном объекте 
        // String text_2 = text.toUpperCase().substring(0, 5).replaceAll("E", "e");
        // System.out.println(text_2);

        // //  ----- если методы с разными типами данных, то выводится тип данных int, который надо указать в конце (например, .length) 
        // int text_3 = text.toUpperCase().substring(0, 5).replaceAll("E", "o").length();
        // System.out.println(text_3);

        // ----------------------17.1. Методы класса String - Практика ------------------------------------

        // String text = "My name is Bogdan Belev";
        // String textLower = text.substring(11).toLowerCase();
        // String fullTextLower = text.substring(0, 11) + textLower;
        // String[] fullTextLowerArray = fullTextLower.split(" ");
        // System.out.println(Arrays.toString(fullTextLowerArray) + "\n");

        // for(String elFullTextLowerArray : fullTextLowerArray){
        //     System.out.println(elFullTextLowerArray + " - " + elFullTextLowerArray.length());
        // }

        // ----------------------17.2 String.format------------------------------------

        // String name = "Bogdan";
        // String lastName = "Belev";
        // int age_1 = 2;
        // int age_2 = 1;

        // // ---- Как не надо составлять фразы ->
        // // String phrase = "My name is " + name + ". I am " + age + " years old. ";

        // // ---- Как надо составлять фразы ->
        // // ---- %s - вставляется String, %d - int 
        // String phrase = String.format("My name is %s %s. I am %d%d years old. ", name, lastName, age_1, age_2);
        // System.out.println(phrase);

        // // ---- а ещё лучше так -> System.out.printf() объединяет String.format и System.out.println
        // System.out.printf("My name is %s %s. I am %d%d years old. \n", name, lastName, age_1, age_2);

        // ----------------------17.3 String.format - Практика + Текстовый блок------------------------------------

        // String carMark = "Audi";
        // String carModel = "Q3";
        // double price = 15_000.00;
        // boolean hasAutomaticTransmission = false;
        // String whatTransmission = hasAutomaticTransmission ? "has" : "hasn't"; 

        // System.out.printf(
        //     "Hi, I'm a manager of the salon '%s'. We have the model - %s, is %f dollars. This model %s an automatic transmission!", carMark, carModel, price, whatTransmission
        //     );

        // ---- Practice (Но в на этом сайте не работают текстовые блоки)
        // String text = """
        //     Hi!
        //     Hi!
        //     My name is Bogdan.
        //     And my name is Denis.
        //     """;

        // ---------------------- 18. оооооооооооооООП ------------------------------------
        //----- Как это работает: создаем отдельный файл с // public class ИМЯ ФАЙЛА{} // и вписываем туда все атрибуты
        //---- То есть мы создаем новый конкретный объект (нового кота)
        //----- Через // ИМЯ ФАЙЛА имя переменной = new ИМЯ ФАЙЛА(Атрибут1, Атрибут2); // обращаемся к файлу (так называемому шаблону) и указывает свои значение под атрибуты
        //----- После можно обращаться к конкретнрым атрибутам // ИМЯ ФАЙЛА.Атрибут1 в файле; //

        // Cat cat_1 = new Cat("Black", 10, "Bogdan");
        // System.out.println(cat_1.color);
        // System.out.println(cat_1.ownerName);
        // System.out.println(cat_1.weight);

        // Cat cat_2 = new Cat("White", 8, "Denis");
        // System.out.println("\n" + cat_2.color);
        // System.out.println(cat_2.ownerName);
        // System.out.println(cat_2.weight);

        // cat_1.color = "Red";
        // System.out.println("\n" + cat_1.color);

        //---- через название переменной обращаемся к методу, который написали в отдельном файле, в классе, и выполняется код
        // cat_1.destroySofa(cat_1.ownerName);

        //---- теперь можно использовать значение метода с типом данных String, и сохранять его в переменную
        // String animal = cat_1.hunt(true, true);
        // System.out.println(animal);

        // ---------------------- 18.1. оооооооооооооООП - Практика ------------------------------------

        // Book bookDenis = new Book("The Time machine", "Herbert Wells", 238, false);

        // bookDenis.numberLinesBook();
        // int numberLinesBookDenis = bookDenis.numberLinesBook(bookDenis.numberPages, 40);
        // System.out.printf("Number of all lines in the book: %s\n", numberLinesBookDenis);
        // bookDenis.infoBook();

        // System.out.println();

        // Book myBook = new Book("The Divine Comedy", "Dante Alighieri", 456, false);

        // myBook.numberLinesBook();
        // int numberLinesMyBook = myBook.numberLinesBook(myBook.numberPages, 40);
        // System.out.printf("Number of all lines in the book: %s\n", numberLinesMyBook);
        // myBook.infoBook();

        // ---------------------- 18.1. Рекурсия (описание в файле Recursion.java) ------------------------------------

        // Recursion sortTen = new Recursion ();
        // sortTen.sum(10);
        // // System.out.println(sortTen.);

        // Recursion sortOne = new Recursion();
        // sortOne.numbers(1);


        // ---------------------- 19. varArgs ------------------------------------

        // Cat cat_1 = new Cat("Black", 10, "Bogdan");
        // cat_1.feed(cat_1.ownerName, "fish", "water");

        // ---------------------- 20. Инкапсуляция. Модификаторы доступа. Геттеры и Сеттеры ------------------------------------
//---- public - доступен во всех пакетах
//---- private - только в том классе, в котором создан
//---- default (ничего не пишется перед объектом) - доступен только в том пакете, в котором был создан 
//---- все всегда по умолчанию указывают private, только если не требуется другой модификатор

        // Dog myDog = new Dog("Fog", -10, "Bogdan");
        // System.out.println(myDog.getOwner());

//---- тут-то моя проверка на отрицательный вес пошла к черту, и для этого надо запретить пересоздавать атрибуты (private)
        // myDog.weight = -10;
        // System.out.println(myDog.weight);

        // ---------------------- 21. Dependency injection ------------------------------------


































































































    }
}
