package tw.com.fcb.mimosa.examples.gettingstarted;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {
	Long memberId;
	String userName;
	int age;
}
