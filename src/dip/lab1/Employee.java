package dip.lab1;

/**
 * The concrete super class of all employee types. What's wrong with this class?
 * Find and fix all encapsulation, DIP and best practice problems learned
 * so far.
 *
 * @author Brian Schrader
 */
public interface Employee {
    // You gotta question if these are appropriate for ALL employees?
//    private double hourlyRate;
//    private double totalHrsForYear;
//    private double annualSalary;
//    private double annualBonus;
    /* Employee should be an interface due to abstraction 
     * and the classes that need to extend (implement) from this.
     *
    */

    /**
     * Returns annual wages for hourly workers. Is this polymorphic?
     * Could it be? Does it belong here? -- No, This is not polymorphic
     * and should not be done here. Also, hourly workers will have its own 
     * instantiation of hourlyRate and totalHrsForYear
     * @return annual wages for hourly workers using the formula
     * annualWages = hourlyRate * totalHrsForYear
     */
//    public double getAnnualWages() {
//        return hourlyRate * totalHrsForYear;
//    }

    /**
     * Returns annual bonus for salaried workers. Is this polymorphic?
     * Could it be? Does it belong here? -- No, this also does not belong here.
     * The Employee class should be an interface. Also, only SalariedEmployee
     * receives an annualBonus and should only be in the SalariedEmployee
     * class.
     * @return annual bonus or zero if none.
     */
//    public double getAnnualBonus() {
//        return annualBonus;
//    }

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @param annualBonus -- think carefully about this
     */
//    public void setAnnualBonus(double annualBonus) {
//        this.annualBonus = annualBonus;
//    }     
    /** This setter follows the same principle as stated above
     * for the getter.
     */
    

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @return
     */
//    public double getAnnualSalary() {
//        return annualSalary;
//    }

    /** annualSalary only applies to SalariedEmployee
     * Is this polymorphic? Should it be? Does it belong here?
     * @param annualSalary - think carefully about this
     */
//    public void setAnnualSalary(double annualSalary) {
//        this.annualSalary = annualSalary;
//    }

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @return
     */
//    public double getHourlyRate() {
//        return hourlyRate;
//    }

    /** hourlyRate only applies to HourlyEmployee
     * Is this polymorphic? Should it be? Does it belong here?
     * @param hourlyRate -- think carefully about this
     */
//    public void setHourlyRate(double hourlyRate) {
//        this.hourlyRate = hourlyRate;
//    }

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @return
     */
//    public double getTotalHrsForYear() {
//        return totalHrsForYear;
//    }

    /** hourlyRate only applies to HourlyEmployee
     * Is this polymorphic? Should it be? Does it belong here?
     * @param totalHrsForYear -- think carefully about this
     */
//    public void setTotalHrsForYear(double totalHrsForYear) {
//        this.totalHrsForYear = totalHrsForYear;
//    }
    /**
     * this should be the only constructor in the Employee Interface.
     * @return 
     */
    public abstract double getAnnualWages();


}
