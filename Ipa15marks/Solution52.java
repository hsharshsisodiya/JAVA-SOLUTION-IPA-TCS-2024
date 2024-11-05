/*Books are identified by International Standard Book Number(ISBN). ISBNs contain 
13 digits, arranged in five groups such as 978-0-13-110362-8. The first group
(GSI prefix) is currently either 978 or 979. The group identifier specifies the 
language or country of origin (for example 0 and 1 are used for English speaking 
countries). The publisher code identifies the publisher (13 is the code for 
Prentice Hall, New Jersey). The item number is assigned by the publisher to 
identify a specific book (110362 is the code for the book "The C Programming 
Language" by Kernighan and Ritchie) and ISBN ends with a check digit that's used 
to verify the accuracy of preceding digits. Write a program that breaks down the 
ISBN entered by the user.:

Sample Input:
-----------------------
Enter ISBN: 978-0-13-110362-8

Sample Output:
-----------------------
GSI Prefix: 978
Group Identifier: 0
Publisher Code: 13
Item Number: 110362
Check Digit: 8

Note: The number of digits in each group may vary. You can't assume that the 
groups have the length shown in the sample output. You can test your program 
with actual ISBN values (usually found on the back cover of a book and on the 
copyright page */

import java.util.*;
public class Solution52 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ISBN: ");
        String str = sc.nextLine();
        String []arr = str.split("-");
        if(arr.length == 5){
            System.out.println("GSI Prefiix: "+arr[0]);
            System.out.println("Group Identifier: "+arr[1]);
            System.out.println("Publisher Code: "+arr[2]);
            System.out.println("Item Number: "+arr[3]);
            System.out.println("Check Digit: "+arr[4]);

        }
        else
        System.out.println("Length is less.");

    }
}
