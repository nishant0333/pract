package multihreadigs;

public class Jtc3 {
public static void main(String[] args) {
	JtcThread11 jth1 = new JtcThread11();
	JtcThread22 jth2 = new JtcThread22();
	jth1.start();
	jth2.start();
}
}

class JtcThread11 extends Thread {
	public void run() {
		Service serv=new Service();
		serv.downloadFile();
	}
}
class JtcThread22 extends Thread{
	public void run() {
	Service serv=new Service();
	serv.readJtcStudentInfo();
}
}
class Service{
	void downloadFile() {
		for(int i=0;i<=100;i+=5) {
			System.out.println("Download\t"+i+"%");
		}
	}
	void readJtcStudentInfo() {
		for(int i=0;i<51;i++) {
			System.out.println("JtcStudent with id\t"+i+"\tInformation");
		}
	}
}