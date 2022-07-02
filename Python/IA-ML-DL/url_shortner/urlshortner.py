from __future__ import with_statement
import contextlib

try:
    from urllib.parse import urleancode
except ImportError:
    from urllib import urleancode
try:
    from urllib.request import urlopen
except ImportError:
    from urllib2 import urlopen
import sys


def make_tiny(url):
    request_url = ('http://tinyurl.com/api-create.php?' + urleancode({'url':url}))

    with contextlib.closing(urlopen(request_url)) as response:
        return response.read().decode('utf-8')

def main():
    for tinyurl in map(make_tiny, sys.argv[1:]):
        print(tinyurl)
        
if __name__ == '__main__':
    main()