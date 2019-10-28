import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Contect contect=new Contect();
     while(true) {
         menu();
         int a=scanner.nextInt();
         scanner.nextLine();
         switch (a){
             case 1:add(contect,scanner);break;
             case 2:search(contect,scanner);break;
             case 3:remove(scanner,contect);break;
             case 4:updata(scanner,contect);break;
             case 5:display(contect);break;
             default:
                 System.out.println("输入有误，重新选择");
         }
     }
    }

    private static void display(Contect contect) {
        contect.display();
    }

    private static void updata(Scanner scanner,Contect contect) {
        System.out.println("1.修改手机号码和办公室号码");
        System.out.println("2.修改姓名");
        int a=scanner.nextInt();
        scanner.nextLine();
        switch (a){
            case 1:
                System.out.println("请输入要修改的人的姓名");
                String name=scanner.nextLine();
                System.out.println("请输入要修改的电话");
                String mobilphone=scanner.nextLine();
                System.out.println("请输入要修改的办公室电话");
                String officephone=scanner.nextLine();
                User q=new User(name,mobilphone,officephone);

                try {
                    contect.updata1(name,q);
                    System.out.println("修改成功");
                }catch (usernotException e){
                    System.out.println("用户不存在");
                }finally {
                    System.out.println("===========");
                }
                break;
            case 2:
                System.out.println("请输入要修改的人的姓名");
                String nm=scanner.nextLine();
                System.out.println("要将名字修改为：");
                String xm=scanner.nextLine();

                User p=contect.search2(nm);
                p.name=xm;


                try {
                    contect.updata2(nm,xm,p);
                    System.out.println("修改成功");
                }catch (usernotException e){
                    System.out.println("用户不存在");
                }catch (nameException v){
                    System.out.println("用户已存在");
                }
                finally {
                    System.out.println("===========");
                }

                break;
            default:
                System.out.println("输入有误");
        }
    }

    private static void remove(Scanner scanner,Contect contect) {
        System.out.println("请输入姓名");
        String a=scanner.nextLine();
        try {
            contect.remove(a);
            System.out.println("删除成功");
        }catch (usernotException e){
            System.out.println("用户不存在");
        }finally {
            System.out.println("===========");
        }
    }

    private static void search(Contect contect,Scanner scanner) {
        System.out.println("请输入姓名");
        String name=scanner.nextLine();
//        User  a =  contect.seaarch(name);
//        System.out.println(a);
        try {
            contect.search(name);
            System.out.println("查找成功");
        }catch (usernotException a){
            System.out.println("用户不存在");
        }finally {
            System.out.println("===========");
        }

    }

    private static void add(Contect contect,Scanner scanner){
        System.out.println("请输入姓名");
        String name=scanner.nextLine();
        System.out.println("请输入电话");
        String mobilphone=scanner.nextLine();
        System.out.println("请输入办公室电话");
        String officephone=scanner.nextLine();
        try {
            contect.add(name,mobilphone,officephone);
            System.out.println("添加成功");
        }catch (nameException e){
            System.out.println("用户已存在");
        }finally {
            System.out.println("============");
        }
    }
    private static void menu() {
        System.out.println("1.添加");
        System.out.println("2.查找");
        System.out.println("3.删除");
        System.out.println("4.更新");
        System.out.println("5.显示");
    }

}
