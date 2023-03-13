package appointmentsystem

class Receptionist {

    String recepName
    String recepEmail
    String recepUsername
    String recepPassword
    String recepPhone

    String toString() {
        return recepName
    }

    static constraints = {
        recepName size: 1..40, blank: false
        recepUsername size: 1..30, blank: false, unique: true
        recepPassword size: 4..30, blank: false, unique: true
    }

    static hasOne = [surgery: Surgery]
}
