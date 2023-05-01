package appointmentsystem /* com.ngarnett.Prescription */

class Prescription {

    String pharmacyName
    String prescriptionNumber
    String medicine
    int daysSupply
    String totalCost
    Date dateIssued
    boolean patientPaying

    String toString() {
        return prescriptionNumber
    }

    static constraints = {
        pharmacyName size: 5..40, blank: false
        medicine size: 1..30, blank: false
    }

    static hasOne = [doctor: Doctor, patient: Patient]
}
