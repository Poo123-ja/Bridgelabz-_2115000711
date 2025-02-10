import java.util.*;
public class VowelCount{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String:");
String s=sc.nextLine();
countVowelConsonant(s);
}
public static void countVowelConsonant(String s){
int vowel=0;
int consonant=0;
s=s.toLowerCase();
for(int i=0;i<s.length();i++){
if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
vowel++;
else
consonant++;
}
System.out.println("Number of vowels in String "+s+" are "+vowel);
System.out.println("Number of consonants in String "+s+" are "+consonant);
}
}
