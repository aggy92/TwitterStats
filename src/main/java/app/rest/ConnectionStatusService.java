package app.rest;

import app.utils.ConnectionStatus;
import app.utils.TwitterConnectionStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Agi.
 */

@RestController
public class ConnectionStatusService extends RESTService{
    @RequestMapping("/status")
    public @ResponseBody ConnectionStatus getTwitterConnectionStatus() {
        return TwitterConnectionStatus.getInstance().getConnectionStatus();
    }
}
