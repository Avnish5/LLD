package t_20_lld_splitwise.Group;

import t_20_lld_splitwise.User.User;

import java.util.ArrayList;
import java.util.List;

public class GroupController {
    List<Group> groupList;

    public GroupController() {
        groupList = new ArrayList<>();
    }

    public void createNewGroup(String groupId, String groupName, User createdNyUser) {
        Group group = new Group();
        group.setGroupID(groupId);
        group.setGroupName(groupName);
        group.addMember(createdNyUser);

        groupList.add(group);
    }

    public Group getGroup(String groupId) {
        return groupList.stream().filter(group -> group.getGroupID().equals(groupId))
                .findFirst().orElse(null);
    }
}
