package appointmentsystem

class Prescription {

    String pharmacyName
    int prescripNumber
    String medicine
    String totalCost
    Date dateIssued
    String patientPaying

    String toString() {
        return pharmacyName
    }

    static constraints = {
        pharmacyName size: 5..40, blank: false
        medicine size: 1..30, blank: false
    }

    static hasOne = [doctor: Doctor, patient: Patient]
}
