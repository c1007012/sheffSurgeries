package appointmentsystem

class Appointment {

    Date appDate
    String appTime
    int appDuration
    String roomNumber

    String toString() {
        return roomNumber
    }

    static constraints = {
        appTime size: 1..10, blank: false
        roomNumber size: 1..30, blank: false, unique: true
        appDuration min: 10
    }

    static hasOne = [doctor: Doctor]

    static hasMany = [patient: Patient]
 
}
