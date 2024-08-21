package LLD.SplitwiseLLD.Group;

import LLD.SplitwiseLLD.User.*;

import java.util.*;

public class GroupController {
    List<Group> groupList;
    public GroupController() {
        groupList = new ArrayList<>();
    }
    public void createNewGroup(String groupId, String groupName, User createdByUser) {

        //create a new group
        Group group = new Group();
        group.setGroupId(groupId);
        group.setGroupName(groupName);

        //add the user into the group, as it is created by the USER
        group.addMember(createdByUser);

        //add the group in the list of overall groups
        groupList.add(group);
    }

    public Group getGroup(String groupId){

        for(Group group: groupList) {

            if(group.getGroupId().equals(groupId)){
                return group;
            }
        }
        return null;
    }


}
