# Download the helper library from https://www.twilio.com/docs/python/install
import os
from twilio.rest import Client


# Find your Account SID and Auth Token at twilio.com/console
# and set the environment variables. See http://twil.io/secure
while True:

    account_sid ='accountsid' 
    auth_token = 'auth_token'
    client = Client(account_sid, auth_token)



    text = "Sami loves you the most and always will , my wife my everything ❤️ "
    message = client.messages \
                    .create(
                         body= f"{text}",
                         from_='fromnumber',
                         to='tonumber'
                 )

    print(message.sid)

