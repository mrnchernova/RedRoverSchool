package slack.googleDocTasks;
/*
        Создайте метод, который отвечает на вопрос «Вы играете на банджо?».
        Если ваше имя начинается на букву «Р» или строчную «р», вы играете на банджо!

        Функция принимает имя в качестве единственного аргумента и возвращает одну из следующих строк:

        name + "" plays banjo""
        name + "" does not play banjo""
        Приведенные имена всегда являются допустимыми строками.
        */
public class t7_Bandgo {
    public static void main(String[] args) {
//        String name = "Marina";
        String name = "Paulo";
        game(name);
    }

    public static void game(String name){
        String str = name;

        System.out.println(name);
        if (str.charAt(0) == 'P' || str.charAt(0) == 'p'){
            System.out.println("Play");
        }else{
            System.out.println("Not");
        }
    }
}
