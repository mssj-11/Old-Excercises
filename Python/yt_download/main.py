from pytube import YouTube


url = 'https://www.youtube.com/watch?v=9Hbd1QeI1Og'
my_video = YouTube(url)


print("*********************  TITLE  *********************")
print(my_video.title)

print("*********************  IMAGE  *********************")
print(my_video.thumbnail_url)

print("*********************  VIDEO  *********************")


#   Video Resolution
my_video = my_video.streams.get_highest_resolution()

#   OR 
#   my_video = my_video.streams.first()


#   Download Video
my_video.download()