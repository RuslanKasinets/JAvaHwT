package HW1;

public class HW1 {
    public static void main(String[] args) {



                String[][] students = {
                        {"John", "Alice", "Bob", "Eve"},
                        {"A", "B", "C", "A"}
                };

                for (int i = 0; i < students[0].length; i++) {
                    if (students[1][i].equals("A") || students[1][i].equals("B")) {
                        System.out.println(students[0][i] + " has grade " + students[1][i]);
                    }
                }
            }
        }




