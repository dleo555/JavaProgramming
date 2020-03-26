package day32_custom_methods;

public class EtsySearch {
    public static void main(String[] args) {
        openBrowser();
        navigateToEtsy();
        searchForWoodenSpoon();
        printResults();
    }

    public static void openBrowser () {
        String str = "Click on Chrome icon";
    }

    public static void navigateToEtsy () {
        String str = "Type etsy.com to address bar";
        String str2 =  "Click on Enter";
    }

    public static void searchForWoodenSpoon () {
        String str = "Type wooden spoon into search field";
        String str2 =  "Click on search icon";
    }

    public static void printResults () {
        String str =  "Total results: wooden spoon (14,581 Results)";
    }
}
