package thirteen_encapsulation;

public class Demo {

    public class PublicInner {
        public void show() {
            System.out.println("Public Inner Class");
        }
    }

    private class PrivateInner {
        public void show() {
            System.out.println("Private Inner Class");
        }
    }

    protected class ProtectedInner {
        public void show() {
            System.out.println("Protected Inner Class");
        }
    }

    class DefaultInner {
        public void show() {
            System.out.println("Protected Inner Class");
        }
    }

}