import java.util.Scanner;

class Staff {
  int staffid, salary;
  String name, phone;

  Staff(int staffid, int salary, String name, String phone) {
    this.staffid = staffid;
    this.salary = salary;
    this.name = name;
    this.phone = phone;
  }

  void display() {
    System.out.println("Staff ID:" + staffid);
    System.out.println("Salary:" + salary);
    System.out.println("Name:" + name);
    System.out.println("Phone:" + phone);
  }
}

class Teaching extends Staff {
  String domain, publication;

  Teaching(int staffid, int salary, String name, String phone, String dom, String pub) {
    super(staffid, salary, name, phone);
    domain = dom;
    publication = pub;
  }

  void displayTeach() {
    System.out.println("Domain:" + domain);
    System.out.println("Publication:" + publication);
    System.out.println("-----------------------------");
  }

}

class Technical extends Staff {
  String skills;

  Technical(int staffid, int salary, String name, String phone, String skill) {
    super(staffid, salary, name, phone);
    skills = skill;
  }

  void displayTechnical() {
    System.out.println("Skils:" + skills);
    System.out.println("-----------------------------");
  }
}

class Contract extends Staff {
  int period;

  Contract(int staffid, int salary, String name, String phone, int per) {
    super(staffid, salary, name, phone);
    period = per;
  }

  public void displayCont() {
    System.out.println("Period:" + period);
    System.out.println("-----------------------------");
  }
}

class Main {
  public static void main(String[] args) {
    int ch, sid, salary, period;
    String name, phone, domain, publication, skill;
    System.out.println("Enter your category:1. Teaching, 2. Technical. 3.Contract");
    Scanner sobj = new Scanner(System.in);
    ch = sobj.nextInt();
    switch (ch) {
    case 1:
      Teaching[] te = new Teaching[3];

      for (int i = 0; i < te.length; i++) {
        System.out.println("Enter SID,Salary,Name,Phone,domain and Publications");
        sid = sobj.nextInt();
        salary = sobj.nextInt();
        name = sobj.next();
        phone = sobj.next();
        domain = sobj.next();
        publication = sobj.next();
        te[i] = new Teaching(sid, salary, phone, name, domain, publication);
      }
      for (int i = 0; i < te.length; i++) {
        te[i].display();
        te[i].displayTeach();
      }
      break;
    case 2:
      Technical[] tech = new Technical[3];
      for (int i = 0; i < tech.length; i++) {
        System.out.println("Enter SID,Salary,Name,Phone and Skills");
        sid = sobj.nextInt();
        salary = sobj.nextInt();
        name = sobj.next();
        phone = sobj.next();
        skill = sobj.next();
        tech[i] = new Technical(sid, salary, phone, name, skill);
      }
      for (int i = 0; i < tech.length; i++) {
        tech[i].display();
        tech[i].displayTechnical();
      }
      break;
    case 3:
      Contract[] con = new Contract[3];
      for (int i = 0; i < con.length; i++)

      {
        System.out.println("Enter SID,Salary,Name,Phone and period");
        sid = sobj.nextInt();
        salary = sobj.nextInt();
        name = sobj.next();
        phone = sobj.next();
        period = sobj.nextInt();
        con[i] = new Contract(sid, salary, phone, name, period);
      }
      for (int i = 0; i < con.length; i++) {
        con[i].display();
        con[i].displayCont();
      }
      break;
    default:
      System.out.println("Invalid option");
    }
  }
}

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
