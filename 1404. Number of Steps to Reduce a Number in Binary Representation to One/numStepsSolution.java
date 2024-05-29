
public class numStepsSolution {
    public int numSteps(String s) {
        int steps = 0;
        StringBuilder curr = new StringBuilder(s);
        while (curr.length() != 1) {
            if (curr.charAt(curr.length() - 1) == '0') {
                curr.deleteCharAt(curr.length() - 1);
            } else if (curr.charAt(curr.length() - 1) == '1') {
                // add curr by 1
                curr.setCharAt(curr.length() - 1, '0');
                int index = curr.length() - 1;
                boolean overflow = true;
                while (index != 0) {
                    index--;
                    char temp = curr.charAt(index);
                    if (temp == '0') {
                        curr.setCharAt(index, '1');
                        overflow = false;
                        break;
                    } else {
                        curr.setCharAt(index, '0');
                    }
                    System.out.println("index: " + index + " char: " + temp);
                }
                if (overflow) {
                    curr.insert(0, "1");
                }
            }
            steps++;
        }
        return steps;
    }
}
