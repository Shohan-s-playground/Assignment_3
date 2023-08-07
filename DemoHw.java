import java.util.Scanner;
public class DemoHw {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
    myBlock:
    {

        System.out.print("Enter your name: ");
        String name = scanner.nextLine().strip().toUpperCase();
        if (name.length() == 0) {
            System.out.println("\033[31mInvalid Name"); 
            break myBlock;}


        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (age<10 | age>18) {
            System.out.println("\033[31mInvalid Age");
            break myBlock;}

        System.out.print("Enter your subject 1: ");
        String subject1 = scanner.nextLine().strip();
            
        if (!(subject1.startsWith("SE-"))|| (subject1.length()!=4)) {
            System.out.println("\033[31mInvalid Subject");
            break myBlock;}

        String last1=subject1.substring(3);
        int conNum1=Integer.valueOf(last1);

        System.out.print("Enter your subject 1 marks: ");
        float subjectMark1 = scanner.nextFloat();
        scanner.nextLine();
        

        
        if (subjectMark1<0 | subjectMark1>100) {
            System.out.println("\033[31mInvalid Marks");
            break myBlock;}

        String status1="";

        if (subjectMark1 >=75){status1="\033[34mDistinguished Pass";}
        else if (subjectMark1>=65){status1="\033[32mCredit pass";}
        else if (subjectMark1>=55){status1="\033[33mPass";}
        else if (subjectMark1<55){status1="\033[31mFail";}

        

        System.out.print("Enter your subject 2: ");
        String subject2 = scanner.nextLine().strip();
        String last2=subject2.substring(3);
        if (!(last1!=last2)||!(subject2.startsWith("SE-"))|| (subject2.length()!=4)) {
            System.out.println("\033[31mInvalid Subject"); 
            break myBlock;}
        
        int conNum2=Integer.valueOf(last2);

        System.out.print("Enter your subject 2 marks: ");
        float subjectMark2 = scanner.nextFloat();
        scanner.nextLine();
        
        if (subjectMark2<0 | subjectMark2>100) {
            System.out.println("\033[31mInvalid Marks");
            break myBlock;}

        String status2="";

        if (subjectMark2 >=75){status2="\033[34mDistinguished Pass";}
        else if (subjectMark2>=65){status2="\033[32mCredit pass";}
        else if (subjectMark2>=55){status2="\033[33mPass";}
        else if (subjectMark2<55){status2="\033[31mFail";}

        System.out.print("Enter your subject 3: ");
        String subject3 = scanner.nextLine().strip();
        String last3=subject3.substring(3);
        if (!(last3!=last2)||!(last3!=last1)||!(subject3.startsWith("SE-"))|| (subject3.length()!=4)) {
            System.out.println("\033[31mInvalid Subject");
            break myBlock;}
        
        int conNum3=Integer.valueOf(last3);

        System.out.print("Enter your subject 3 marks: ");
        float subjectMark3 = scanner.nextFloat();
        scanner.nextLine();

        
        if (subjectMark3<0 | subjectMark3>100) {
            System.out.println("\033[31mInvalid Marks");
            break myBlock;}

        String status3="";

        if (subjectMark3 >=75){status3="\033[34mDistinguished Pass";}
        else if (subjectMark3>=65){status3="\033[32mCredit pass";}
        else if (subjectMark3>=55){status3="\033[33mPass";}
        else if (subjectMark3<55){status3="\033[31mFail";}

        float total=subjectMark1+subjectMark2+subjectMark3;
        float avg=total/3;

        String overallStatus="";

        if (avg >=75){overallStatus="\033[34mDistinguished Pass";}
        else if (avg>=65 ){overallStatus="\033[32mCredit pass";}
        else if (avg>=55){overallStatus="\033[33mPass";}
        else if (avg<55){overallStatus="\033[31mFail";}

        final String COLOURB="\033[34;1m";
        final String COLOURY="\033[33m";
        final String reset ="\033[0m";
        System.out.printf("\033[33m-".repeat(50),COLOURY);
        System.out.println();
        System.out.printf("|%s%s%-7s%-38s%1$s%5$s|\n",reset,COLOURB,"Name    : ",name,COLOURY);
        System.out.printf("|%s%-7s%s%-36s%s|\n",reset,"Age     : ",age," years old",COLOURY);
        System.out.printf("|%s%-7s%-43s%s|\n",reset,"Status  : ",overallStatus,COLOURY);
        System.out.printf("|%s%-7s%-16.2f%s%-4.2f%s%7s%s|\n",reset,"Total   : ",total,"Average :",avg,"%","",COLOURY);
        System.out.printf("\033[33m-".repeat(50),COLOURY);
        System.out.println();
        System.out.printf("|%s%-10s%s|%1$s%4$-10s%3$s|%1$s%6$9s%5$-17s%3$s|\n",reset," Subject",COLOURY,"  Marks","Status","");
        System.out.printf("\033[33m-".repeat(50),COLOURY);
        System.out.println();
        System.out.printf("| %s%-3s%03d%3s%s|  %1$s%6$-8.2f%5$s|%1$s%4$2s%7$-29s%5$s|\n",reset,"SE-",conNum1,"",COLOURY,subjectMark1,status1);
        System.out.printf("| %s%-3s%03d%3s%s|  %1$s%6$-8.2f%5$s|%1$s%4$2s%7$-29s%5$s|\n",reset,"SE-",conNum2,"",COLOURY,subjectMark2,status2);
        System.out.printf("| %s%-3s%03d%3s%s|  %1$s%6$-8.2f%5$s|%1$s%4$2s%7$-29s%5$s|\n",reset,"SE-",conNum3,"",COLOURY,subjectMark3,status3);
        System.out.printf("\033[33m-".repeat(50),COLOURY);
        System.out.println();
    }

        
    }
    
}

