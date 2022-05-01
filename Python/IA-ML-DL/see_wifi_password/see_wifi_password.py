import subprocess

# Getting meta data
meta_data = subprocess.check_output(['netsh', 'wlan', 'show', 'profiles'])

# Decoding meta data
data = meta_data.decode('utf-8', errors= "backslashreplace")

# Splitting data by line by line
data = data.split('\n')

# Creating a list of profile, Array Empty
profiles = []

# Traverse the data 
for i in data:
    
    # Find "The Message" in each item
    if "All User profile" in i :
        
        # If found, split the item
        i = i.split(":")
        
        # Item at index 1, will be the Wi-Fi name
        i = i[1]

        # Formatting the name , First and last character is use less
        i = i[1:-1]

        # Appending the Wi-Fi name in the list
        profiles.append(i)
        
        
#   Printing heading
print("{:<30} | {:<}".format("Wi-Fi Nmae ", "Password "))
print("____________________________________________________")


#   Traversing the profiles
for i in profiles:
    
    # Try catch block begins,   Try blocks
    try:
        # Getting meta data with password using Wi-Fi name
        results = subprocess.check_output(['netsh', 'wlan', 'show', 'profile', i, 'key = clear'])
        
        # Decoding and splitting data line by line
        results = results.decode('utf-8', errors = "backslashreplace")
        results = results.split('\n')

        # Finding password from the result list 
        results = [b.split(":")[1][1:-1] for b in results if "Key Content" in b]

        # If there is password it will print the password
        try:
            print("{:<30} | {:<}".format(i, results[0]))
            
            # else , It will print blank in front of password
        except IndexError:
            print("{:<30} | {:<}".format(i, ""))
            
            
    # Called when this process get failed
    except subprocess.CalledProcessError:
        print("Encoding Error Occured")