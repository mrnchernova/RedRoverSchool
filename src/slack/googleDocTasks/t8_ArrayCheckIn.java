package slack.googleDocTasks;

/*
        Вам будет предоставлен массив arr и значение x. Всё, что вам нужно сделать, — это проверить,
        содержит ли предоставленный массив это значение.
        arr может содержать числа или строки. x может быть любым.
        Возвращает, true если массив содержит значение, false если нет.
*/
public class t8_ArrayCheckIn {
    public static void main(String[] args) {

        Object[] array = {"qaz", "qwe", "asd"};
//        Object[] array = {11, 22, 33};
        Object x = "p";

        if (x.getClass().getSimpleName() == array[0].getClass().getSimpleName()){
            System.out.println("equals");

            if (x instanceof String){
                System.out.println("x str");
            }

            if (x instanceof Integer){
                System.out.println("x int");
            }

            if (x instanceof Double){
                System.out.println("x double");
            }

        }
        else{
            System.out.println("not equal");
        }

//        int b = (int)  '4';    System.out.print(b); //978 номер символа
    }
}
