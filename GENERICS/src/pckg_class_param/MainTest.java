package pckg_class_param;

public class MainTest {
    public static void main(String[] args) {
        Package<String> stringPackage = new Package<>(String.class);
        stringPackage.addNewElement("Novi");
        stringPackage.addNewElement("Novi");
        stringPackage.listPackageContent();
    }
}
