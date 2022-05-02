# pip install sinchsms
import time
from time import sleep
from sinchsms import SinchSMS

#   Function for sending SMS
def sendSMS():
    #   Enter all the details , get app_key and app_secret by registering, A app on sinchSMS
    number = 'your_mobile_number'
    app_key = 'your_app_key'
    app_secret = 'your_app_secret'


    # Enter the message to be sent
    message = 'This is Message send from python :)'
    
    client = SinchSMS(app_key, app_secret)
    print("Send '%s' to %s" % (message, number))
    
    response = client.send_message(number, message)
    message_id = response['messageId']
    response = client.check_status(message_id)
    
    # Keep trying unless the status returned is Successful
    while response['status'] != 'Successful':
        print(response['status'])
        time.sleep(1)
        response = client.check_status(message_id)
    
    print(response['status'])
    
if __name__ == "__main__":
    sendSMS()


'''
Note
You will need a Sinch account for getting your application key and secret. Visit www.sinch.com to get started


Using as command line script:
./sinchsms.py
usage: sinchsms.py <application key> <application secret> send <number> <message> <from_number>
       sinchsms.py <application key> <application secret> status <message_id>
'''