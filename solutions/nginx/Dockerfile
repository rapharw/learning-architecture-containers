FROM ubuntu/nginx
COPY nginx.conf /etc/nginx/sites-enabled
COPY default /etc/nginx/sites-enabled

COPY /html/* /usr/share/nginx/html
COPY api /usr/share/nginx/api/
