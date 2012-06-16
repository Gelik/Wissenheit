This project contains 3 example diagrams:
 
 The Patient-Receptionist-Doctor Choreography example
 The Examination example
 The Provisioning Choreography example
 
 

The Patient-Receptionist-Doctor Choreography example
This example is based on a use case being developed by the W3C Web Service Choreography Working Group.
"3 Party Choreography with distributed activities and explicit Messages"
 
The following is a text description of the example:
 
1) A Patient sends an "I want to see doctor" message to a Receptionist.
2) The Receptionist sends a "Are you available?" message to a list of Doctors.
3) One doctor sends an "I'm available" message to the Receptionist.
4) The Receptionist sends a "I'll book you" message to the Doctor.
5) The Receptionist sends a "Go see doctor" message to the Patient.
6) The Patient sends an "I feel sick" message to the Doctor.
7) The Doctor sends a "Prepare this medicine" message to the Receptionist.
8) The Doctor sends a "Pickup your medicine and you can leave" message to the Patient.
9) The Patient sends an "I need my medicine" message to the Receptionist.
10) The Receptionist sends a "Here is your medicine" message to the Patient.
 
 
The Provisioning Choreography example
This example is based on a use case being developed by the W3C Web Service Choreography Working Group.
 
The following is a text description of the example:
 
The theme behind this use case is provisioning. Company A is an acquisitive company and/or has rapid turnover of personnel. Thus, provisioning and integrating new personnel into the enterprise is an important and expensive business process involving soft provisioning (assigning phone numbers, email addresses, passwords, etc.) and hard provisioning (junior executive level desk, bookshelf, PC, company cell phone of a certain type with junior level executive cell plan, etc.). The example called for a new employee to receive the usual junior executive faux-oak desk. After checking internal resources that are outside of this use case (perhaps empty offices or warehouses within the company), no suitable desk is found. So, a choreography is "initiated" in which an order is placed with one of the approved suppliers (Company B) registered in the private UDDI registry of Company A.
 
A -> B
 
Company B does not have faux-oak desks, but instead of reporting zero faux-oak desks (the usual choreography being to respond with quantity available), company B responds with a counter-offer consisting of a lovely faux-walnut desk for less money. This is clearly a form of negotiation.
 
A <- B
 
This could go back and forth for awhile, but alternately if company A says no and insists of faux-oak (faux-walnut is for middle level executives), then Company B may offer to refer company A to company C perhaps for a fee or perhaps as part of a carefully monitored reciprocal relationship. Company A may agree to be referred, and dynamically include company C in the process.
 
A -> C
 
To keep this short, let's assume that C says yes, and the transaction between A and C is completed after a number of message exchanges.
 
A <- C 
