package app.rest;

import app.dto.UserDTO;
import app.dto.UserDetailedDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Agi.
 */

@RestController
@RequestMapping("/stats/")
public class UserDataService extends RESTService {
    @RequestMapping("/user")
    public @ResponseBody UserDTO getUserData(@RequestParam(name = "name") String name) {
        return getResponseController().getUserData(name);
    }

    @RequestMapping("/user/all")
    public @ResponseBody List<UserDTO> getAllUsersData() {
        return getResponseController().getAllUsersData();
    }

    @RequestMapping("/userDetailed")
    public @ResponseBody UserDetailedDTO getDetailedUserData(@RequestParam(name = "name") String name) {
        return getResponseController().getDetailedUserData(name);
    }

    @RequestMapping("/userDetailed/all")
    public @ResponseBody List<UserDetailedDTO> getAllDetailedUsersData() {
        return  getResponseController().getAllDetailedUsersData();
    }
}
