FROM ubuntu/nginx
COPY nginx-webapp.conf /etc/nginx/sites-enabled/nginx.conf
COPY nginx.conf /etc/nginx/nginx.conf
COPY default /etc/nginx/sites-enabled

COPY /html/* /usr/share/nginx/html
COPY api /usr/share/nginx/api/
