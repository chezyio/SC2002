
public class Plane {

    private PlaneSeat[] seat = new PlaneSeat[12];
    private int numEmptySeats;

    public Plane() {
        for (int i = 0; i < 12; i++) {
            seat[i] = new PlaneSeat(i+1);
            this.numEmptySeats = 12;
        }
    }

    private PlaneSeat[] sortSeats() {

        PlaneSeat[] temp = new PlaneSeat[12];
        PlaneSeat hold;

        for (int i = 0; i < 12; i++) {
            temp[i] = seat[i];
        }

        for (int i = 1; i < 12; i++) {
            for (int j = i; j > 0; j--) {
                if (temp[j].getCustomerId() < temp[j-1].getCustomerId()) {
                    hold = temp[j];
                    temp[j] = temp[j-1];
                    temp[j-1] = hold;
                } else {
                    break;
                }
            }
        }

        return temp;
    }

    public void showNumEmptySeats() {

        System.out.println("There are " + this.numEmptySeats + " empty seats");

    }

    public void showEmptySeats() {
        System.out.println("The following seats are empty: ");

        for (int i = 0; i < 12; i++) {
            if (this.seat[i].isOccupied() == false) {
                System.out.println("SeatID " + (i+1));
            }
        }
    }

    public void showAssignedSeats(boolean bySeatId) {
        System.out.println("The seat assignments are as follow:");
        PlaneSeat[] temp = bySeatId ? this.seat : sortSeats();

        for (int i = 0; i < 12; i++) {
            if (temp[i].isOccupied()) {
                System.out.printf("SeatID " + temp[i].getSeatId() + " assigned to CustomerID " + temp[i].getCustomerId() + ".\n");
            }
        }
    }

    public void assignSeat(int seatId, int cust_id) {
        if (this.seat[seatId-1].isOccupied()) {
            System.out.println("Seat already assigned to a customer!");
        } else {
            this.seat[seatId-1].assign(cust_id);
            --this.numEmptySeats;
            System.out.println("Seat Assigned!");
        }

    }


    public void unAssignSeat(int seatId) {
        if (this.seat[seatId-1].isOccupied()) {
            this.seat[seatId-1].unAssign();
            ++this.numEmptySeats;
        }
        System.out.println("Seat unassigned!");

    }


}
