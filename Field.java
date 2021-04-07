import java.io.DataOutputStream;
import java.io.Serializable;

public interface Field extends Serializable{
	
	void serialize(DataOutputStream dos);

}
