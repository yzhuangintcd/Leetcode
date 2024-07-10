
public class minOperationsSolution {
    public int minOperations(String[] logs) {
        int pointer = 0;

        // use a pointer to track how far we are from the main directionary
        // "../" move to parent folder, if there is no parent folder remain in the same
        // folder
        // "./" remain in the same folder
        // "x/" move to a child folder x

        for (int i = 0; i < logs.length; i++) {
            switch (logs[i]) {
                case "../":
                    if (pointer == 0) {
                        continue;
                    } else {
                        pointer--;
                    }
                    break;

                case "./":

                    break;

                default:
                    pointer++;
                    break;
            }
        }
        return pointer;
    }
}
