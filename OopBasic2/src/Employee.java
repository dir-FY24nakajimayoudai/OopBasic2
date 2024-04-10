
public class Employee {
    //フィールド
    public String name;
    public String department;
    public String position;
    public int employeeId;
    
    //コンストラクター
    public Employee(String name,String department, String position, int employeeId) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.employeeId = employeeId;
    }
    
    //メソッド
    public void report() {
        System.out.println("報告します。" + name + department);
    }
    
}
