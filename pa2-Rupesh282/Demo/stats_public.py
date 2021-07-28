from googleapiclient.discovery import build
import pprint as pp

# change your api key here
api_key = 'AIzaSyDeCxjEDHhyBvdzTGHHUMBxqwBjR_a11pM'

youtube = build('youtube', 'v3', developerKey=api_key)

# get channel stats 
reqeust = youtube.channels().list(
                part='statistics',
                # id='UCsTcErHg8oDvUnTzoqsYeNw'
                forUsername='Davie504'
)

# this will give only public vid count (no access to my account)
# request = youtube.playlistItems().list(
                # part='contentDetails',
                # playlistId='UUFLSYTkm3QJNeVygYg5krqw'
# )

response = reqeust.execute()
print("Channel stats : ")
pp.pprint(response)
print()
