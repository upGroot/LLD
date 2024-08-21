package LLD.HotelManagementSystem.Room;

import java.util.*;

public class RoomManager {
    private List<Room> roomList;
    private static RoomManager instance;
    private RoomManager() {
        roomList = new ArrayList<>();
    }
    public static RoomManager getInstance() {
        if (instance == null) {
            synchronized (RoomManager.class) {
                if (instance == null) instance = new RoomManager();
            }
        }
        return instance;
    }
    public void addRoom(Room room) {
        roomList.add(room);
    }
    public void removeRoom(Room room) {
        roomList.remove(room);
    }
    public void updateRoomStatus(Room room, RoomStatus status) {
        room.setRoomStatus(status);
    }
    public List<Room> getAllAvailableRoom() {
        return roomList;
    }
}
