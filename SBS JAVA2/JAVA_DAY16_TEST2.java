// ȸ�� �𵨸� : �̸�, ����, �ּ�

public class JAVA_DAY16_TEST2 {
	public static void main(String[] args) {

	    Customer c1 = new Customer();
	    c1.name = "��¯��";
	    c1.age = 35;
	    c1.address = "����";

	    Customer c2 = new Customer();
	    c2.name = "�����";
	    c2.age = 29;
	    c2.address = "����";

	    Customer c3 = new Customer();
	    c3.name = "ȫ�浿";
	    c3.age = 26;
	    c3.address = "����";

	    Customer c4 = new Customer();
	    c4.name = "�輭��";
	    c4.age = 44;
	    c4.address = "����";

//	    Customer[] cus = new Customer[4];
//	    
//	    cus[0] = c1;
//	    cus[1] = c2;
//	    cus[2] = c3;
//	    cus[3] = c4;
	    
	    Customer[] cus = {c1, c2, c3, c4};
	    
	    
	    //1. ��ü ȸ�� ���̿� �̸� ���
	    for(int i = 0; i < cus.length; i++)
	    {
	    	cus[i].age();
	    	cus[i].name();
	    }
	    //2. ���̰� 30�� �̸��� ����� �̸� ���
	    for(int i = 0; i < cus.length; i++)
	    {
	    	if(cus[i].age < 30)
	    	{
	    	cus[i].name();
	    	}
	    }
	    //3. ���� ��� ������� �̸��� ���� ���
	    for(int i = 0; i < cus.length; i++)
	    {
	    	if(cus[i].address == "����")
	    	{
	    	cus[i].name();
	    	cus[i].age();
	    	}
	    }
	    //4. �达 ���� ���� ��� �̸� ��� (��Ʈ : startsWith)
	    // �񱳴���ڿ�.startsWith("üũ�ҹ��ڿ�")
	    for(int i = 0; i < cus.length; i++)
	    {
	    	if(cus[i].name.startsWith("��"))
	    	{
	    	cus[i].name();
	    	}
	    }


	  }
}

class Customer{
	
	String name;
	int age;
	String address;
	
	public void name() {
		System.out.printf("�̸� : %s\n",name);	
	}
	public void age() {
		System.out.printf("���� : %d\n",age);	
	}
	public void address() {
		System.out.printf("�ּ� : %s\n",address);	
	}
	
}