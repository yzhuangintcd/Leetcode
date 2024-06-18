import java.util.ArrayList;

public class calPointsSolution {
        public int calPoints(String[] operations) {
        int points = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            switch(operations[i]){
                case "+":
                    list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
                    break;
                case "D":
                    list.add(list.get(list.size() - 1) * 2);
                    break;
                case "C":
                    list.remove(list.size() - 1);
                    break;
                default:
                    list.add(Integer.parseInt(operations[i]));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            points += list.get(i);
        }
        return points;
    }
}
