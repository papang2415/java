package inheritance;

public class PieceWorkerEmployee extends Employee {

    private int totalPiecesFinished;
    private double ratePerPiece;
    private float salary;

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public float getSalary() {
        return salary;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public double computeSalary() {
        float temp;
        if (this.totalPiecesFinished % 100 == 0) {
            temp = this.totalPiecesFinished / 100;
            this.salary = (float) ((this.totalPiecesFinished * this.ratePerPiece) + temp * (this.ratePerPiece * 10));
            return this.salary;
        } else {
            this.salary = (float) (this.totalPiecesFinished * this.ratePerPiece);
            return this.salary;
        }
    }

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece, int empID, MyName empName) {
        super(empID, empName);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece, int empID, MyName empName, Date dateHired) {
        super(empID, empName, dateHired);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public void displayPieceWorkerEmployee() {
        System.out.print("=========================================");
        System.out.print("\nPiece Worker Employee");
        super.displayEmployee();
        System.out.printf("\nTotal Total Pieces Finished: %d piece(s) \nRate Per Piece: %.2f/piece \nTotal Salary: Php %.2f\n", this.totalPiecesFinished, this.ratePerPiece, this.salary);
    }

    @Override
    public String toString() {
        return String.format("\nTotal Total Pieces Finished: %d piece(s) \nRate Per Piece: %.2f/piece \nTotal Salary: Php %.2f\n", this.totalPiecesFinished, this.ratePerPiece, this.salary);
    }

}
