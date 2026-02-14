class Exceptionalhandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(" Division by zero is not allowed.");
        }
        System.out.println("Program continues after handling the exception.");
    }
}

class Exception2 {
    public static void main(String[] args) {
    String str = null;
    try {
        System.out.println(str.length());
    } catch (NullPointerException e) {
        System.out.println("Error: Attempted to access a method on a null object.");
    }

    System.out.println("Program continues after handling the exception.");
    }
}

class Exception3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an index that is out of bounds.");
        }

        System.out.println("Program continues after handling the exception.");
    }
}

class Exception4{
    public static void main(String[]args){
        String str="abc";
        try{
            int num=Integer.parseInt(str);
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println("Cannot convert string"+e.getMessage());
        }
        System.out.println("Program continous after handling the exception");
    }
}

class Exception5{
     public static void main(String[]args){
        try{
            int result=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Caught an airthmetic exception:"+e.getMessage());
        }
        finally{
            System.out.println("This block will always execute:");
        }
        System.out.println("Program continous after handling the exception:");
     }
} 