package softuni.mobilele.user;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
@SessionScope
public class CurrentUser {
    private String name;
    private boolean loggedIn;
    private String username;

    public boolean isAnonymous() {
        return !isLoggedIn();
    }

    public void clear() {
        username = null;
        loggedIn = false;
        name = null;
    }
}
