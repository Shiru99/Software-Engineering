import os
import pickle
from googleapiclient.discovery import build
from google_auth_oauthlib.flow import InstalledAppFlow
from google.auth.transport.requests import Request
import pprint as pp

credentials = None

# token.pickle stores the user's credentials from previously successful logins
if os.path.exists('token.pickle'):
    print('Loading Credentials From File...')
    with open('token.pickle', 'rb') as token:
        credentials = pickle.load(token)

# If there are no valid credentials available, then either refresh the token or log in.
if not credentials or not credentials.valid:
    if credentials and credentials.expired and credentials.refresh_token:
        print('Refreshing Access Token...')
        credentials.refresh(Request())
    else:
        print('Fetching New Tokens...')
        flow = InstalledAppFlow.from_client_secrets_file(
            'client_secrets.json',
            scopes=[
                # 'https://www.googleapis.com/auth/youtube.readonly',
                'https://www.googleapis.com/auth/youtube.force-ssl'

            ]
        )

        flow.run_local_server(port=8080, prompt='consent',
                              authorization_prompt_message='')
        credentials = flow.credentials

        # Save the credentials for the next run
        with open('token.pickle', 'wb') as f:
            print('Saving Credentials for Future Use...')
            pickle.dump(credentials, f)

youtube = build('youtube', 'v3', credentials=credentials)

# get no of likes/dislikes by giving videoId
request = youtube.videos().list(part='statistics', id='gzPGmR6R67Y')

# get comments of a video with given videoId
# request = youtube.commentThreads().list(
        # part='snippet',
        # videoId='gzPGmR6R67Y'
# )


# like / dislike a video
# request = youtube.videos().rate(
        # id='rePVuuejPy4',
        # rating='like'
# )

# for searching 
# request = youtube.search().list(q='avengers', part='snippet', type='video')
# request = youtube.search().list(q='Davie504', part='snippet', type='channel', maxResults=1)

# this gives the private + public vid count (as i have given access to it)
# request = youtube.playlistItems().list(
                # part='status',
                # playlistId='UUFLSYTkm3QJNeVygYg5krqw'
# )

#get own channel details
# request = youtube.channels().list(
        # part='statistics',
        # mine=True
# )

response = request.execute()

# for item in response['items']:
    # print(item['snippet'])

#get links for videos 
# for cd in response['items']:
    # print(cd['contentDetails']['videoId'])

pp.pprint(response)


