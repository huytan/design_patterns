import java.net.MalformedURLException;
import java.rmi.MarshalledObject;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.activation.Activatable;
import java.rmi.activation.ActivationDesc;
import java.rmi.activation.ActivationException;
import java.rmi.activation.ActivationGroup;
import java.rmi.activation.ActivationGroupDesc;
import java.rmi.activation.ActivationGroupID;
import java.util.Properties;

//http://nqdung.com/chia-se/java/java-vi-du-don-gian-ve-rmi-va-activation#.UsI6gfRdXTo
public class Server {

	/**
	 * @param args
	 * @throws ActivationException
	 * @throws RemoteException
	 * @throws MalformedURLException
	 */
	public static void main(String[] args) throws RemoteException,
			ActivationException, MalformedURLException {
		// Bước 1: Thiết lập bảo mật(bắt buộc)
		System.setSecurityManager(new RMISecurityManager());
		Properties pros = new Properties();
		pros.put("java.security.policy", "rmi.policy");
		// Bước 2:Tạo mô tả cho nhóm chứa các object
		ActivationGroupDesc.CommandEnvironment ae = null;
		ActivationGroupDesc group = new ActivationGroupDesc(pros, ae);
		// Bước 3: Đăng ký nhóm vào hệ thống và lấy id của nhóm
		ActivationGroupID groupId = ActivationGroup.getSystem().registerGroup(
				group);
		// Bước 4: Khai báo đường dẩn đến các đối tượng dùng giao thức file hoặc
		// http
		String location = "file:.\\";

		// Bước 5: Tạo thông tin về đối tượng :id của group,tên của đối
		// tượng,đường dẩn đến đối tượng,dữ liệu đầu vào
		MarshalledObject data = null;// Ở đây ta chưa làm gì nên để null
		ActivationDesc desc = new ActivationDesc(groupId, "CalcutatorImpl",
				location, data);
		// Bước 6: Đăng ký đối tượng implementation cho RMIDeamon
		CalculatorServices calcu = (CalculatorServices) Activatable
				.register(desc);
		// Bước 7: Đăng ký đối tượng cho rmiregistry
		// Ở đây khác so với rmi sử dụng UnicastRemoteObject là khi đăng ký xong
		// đối tượng sẽ vào trạng thái sleep
		Naming.rebind("rmi://localhost:1099/CalculatorServices", calcu);
		System.out.print("Object is hosting");
		System.exit(0);
	}

}
