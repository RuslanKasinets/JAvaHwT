package HW1;

public class HW7 {
    public static void main(String[] args) {
        String[][] countries = {
                {"North America", "Canada", "United States", "Mexico"},
                {"South America", "Brazil", "Argentina", "Colombia", "Peru"},
                {"Europe", "France", "Germany", "Italy", "Spain", "United Kingdom"},
                {"Asia", "China", "Japan", "India", "South Korea", "Indonesia"},
                {"Africa", "Nigeria", "Egypt", "South Africa", "Kenya"}
    };
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.println(countries[i][j]);



            }

        }
}}
