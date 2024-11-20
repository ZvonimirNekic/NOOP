package pckg_class_param;

import java.util.ArrayList;

public class Package <T> {

    private final ArrayList<T> pckgContent; //referenca ostaje ista na ovaj arraylist napravljen u konstruktoru - ne možeš napravit novi preko settersa -> final reference (da je primitivni tip podataka, bio bi final VALUE)

    private Class<T> classType;

    public Package(Class<T> type) {
        this.classType = type;
        this.pckgContent = new ArrayList<>();
        System.out.println("Created a new package: " + classType);
    }

//    public void setPckgContent(ArrayList<T> contentNew){
//        this.pckgContent = contentNew;  //neće raditi zbog final (usmeni)
//    }


    public void addNewElement(T el) {
        if (pckgContent.contains(el)){
            System.out.println("This element is already in the package!");
        } else {
            pckgContent.add(el);
            System.out.println("Added a new element to the package.");
        }
    }


    public void listPackageContent(){
        System.out.println("----------------------");
        if (this.pckgContent.isEmpty()){
            System.out.println("The package is empty!");
        } else {
            for (T element: pckgContent){
                System.out.println(element);
            }
        }
        System.out.println("----------------------");
    }

}
