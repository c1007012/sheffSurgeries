package appointmentsystem

class BootStrap {

    def init = { servletContext ->
        /*def surgery = new Surgery(
	 name: 'Sheffield Medical Centre',
         address: '21 Spital Street, Sheffield',
         postcode: 'S3 9LB',
         telephone: '0114 272 7042',
         numberOfPatients: 80,
         description: 'Lorem ipsum',
         openingTime: '09:00 - 19:00',
         registeringNewPatients: true
        ).save()
	
        def doctor = new Doctor(
         doctorName: 'Fred Smith',
         qualification: 'MBBS',
         position: 'Surgeon',
         doctorEmail: 'fredsmith@gmail.com',
         password: 'password',
         doctorOffice: 'D-21',
         doctorPhone: '07654896322',
         bio: 'Lorem Ipsum',
         surgery: surgery  
        ).save()

        def patient = new Patient(
         patientName: 'John Doe',
         patientAddress: '23 Prospect Avenue',
         patientResidence: 'Sheffield',
         patientDob: '2002-06-23',
         patientID: 'P3245',
         dateRegistered: '2022-04-12',
         patientPhone: '07224576523',
         surgery: surgery
        ).save()

        def receptionist = new Receptionist(
         recepName: 'Daniel Jones',
         recepEmail: 'danieljones@outlook.com',
         recepUsername: 'username',
         recepPassword: 'password',
         recepPhone: '07665123988',
         surgery: surgery
        ).save()

        def nurse = new Nurse(
	 nurseName: 'Sarah Peterson',
         qualifications: 'Registered General Nurse',
         nurseEmail: 'sarahpeterson@yahoo.com',
         nurseOffice: 'N-34',
         nursePhone: '07834451989',
         surgery: surgery
        ).save()

        def appointment = new Appointment(
	 appDate: '2023/02/12',
         appTime: '17:00',
	 appDuration: 30,
	 roomNumber: 'A-45',
	 surgery: surgery,
	 doctor: doctor,
	 patient: patient
	).save()

	def prescription = new Prescription(
	 pharmacyName: 'Well Pharmacy',
	 prescriptionNumber: 4657,
	 medicine: 'Ibuprofen',
	 daysSupply: 15,
	 totalCost: 2.5,
	 dateIssued: new Date(2023 - 1900, 3, 21),
	 patientPaying: true,
	 doctor: doctor,
         patient: patient
	).save()*/
    }
    def destroy = {
    }
}
