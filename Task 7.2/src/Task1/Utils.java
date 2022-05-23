package Task1;

public class Utils {

    public static IEmployee getEmplName(IEmployee[] arr, String name) {

        IEmployee result = null;
        for (int i = 0; i < arr.length; i++) {
            if (result == null || arr[i].getName() == name) {
                result = arr[i];
            }
        }
        return result;
    }

    public static IManager getMaxNumberSubordinates(IManager[] arr) {

        IManager result = null;
        int maxNumberSubordinates = Integer.MIN_VALUE;
        for (IManager el : arr) {
            if (result == null || el.getNumberOfSubordinates() > maxNumberSubordinates) {
                maxNumberSubordinates=el.getNumberOfSubordinates();
                result = el;
            }
        }
        return result;
    }
}
