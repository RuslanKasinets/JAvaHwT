package HW1;

public class HW3 {
    public static void main(String[] args) {
        String [][] list={{"Broccoli","Carrots","Sweet Potatoes","Spinach"},
                          {"Blueberries","Apples","Kiwifruit"           },
                            {"Milk","Kefir","Cheese","Yogurt"},
                             {"Dark Chocolate","Fruit Salad","Oatmeal Cookies"}};

        for (int i = 0; i <list.length ; i++) {
            String []grocery=list[i];
            for (int j =0; j < grocery.length; j++) {
                System.out.println(list[i][j]);

            }

        }


    }
}
