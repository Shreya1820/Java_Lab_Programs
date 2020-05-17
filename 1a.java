import java.util.Scanner;

class Student {
  String usn, name, branch, phone;

  void read() {
    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter Student USN");
    usn = sobj.next();
    System.out.println("Enter Student Name:");
    name = sobj.next();
    System.out.println("Enter Student branch:");
    branch = sobj.next();
    System.out.println("Enter Student phone no:");
    phone = sobj.next();
  }

  void display() {
    System.out.println(usn + "..." + name + "..." + branch + "..." + phone);
  }
}

class Main {
  public static void main(String[] args) {
    int n;
    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter the Number of Students");
    n = sobj.nextInt();
    // array of objects
    Student[] st = new Student[n];
    System.out.println("Please enter the student details");
    // creation of n objects
    for (int i = 0; i < st.length; i++) {
      st[i] = new Student();
    }
    // read student data
    for (int i = 0; i < st.length; i++) {
      st[i].read();
    }
    // print student data
    System.out.println("USN | Name || USN | Name");
    for (int i = 0; i < st.length; i++) {
      st[i].display();
    }
  }
}
