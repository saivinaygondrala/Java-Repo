public class Strings {
    public static void main(String[] args) {
        String str=new String("hello world");
        //if new key word is used to store a string then it is stored twice in pool area and heap area
        System.out.println(str.length());//returns the length of the string
        System.out.println(str.toLowerCase());//returns the string in lowercase
        System.out.println(str.toUpperCase());//returns string in upper case
        System.out.println(str.trim());
        System.out.println(str.charAt(1));//returns the character present at the index 1
        System.out.println(str.substring(1,5));//returns string from 1 to 5
        System.out.println(str.contains("hello"));//check for the given value is present or not and returns a boolean value 
        String str1=new String("hello");
        System.out.println(str.equals(str1));//this check whether the both strings same or not and returns the boolean value
        System.out.println(str.isEmpty());//it checks is the string is empty and returns boolean value
        System.out.println(str.concat(str1));//concat function is to add two strings
        System.out.println(str.replace('l', 'a'));//it replaces the old char with new char
        String arr="BMW,AUDI,FERRARI,MINICOOPER,LANDROVER,SKODA";
        String strarr[]=arr.split(",");
        for(String a : strarr){
            System.out.println(a);
        }
        String name="  welcome   ";
        System.out.println(name.trim());//trim function removes the before and after spaces for a string
    }
    
}
