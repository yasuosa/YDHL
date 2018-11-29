package bean;

public class Road {
    int  RoadId;
    int Status;

    public int getRoadId() {
        return RoadId;
    }

    public void setRoadId(int roadId) {
        RoadId = roadId;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public Road(int roadId, int status) {
        RoadId = roadId;
        Status = status;
    }
}
