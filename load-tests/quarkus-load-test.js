import http from 'k6/http';
import { sleep, check } from 'k6';


export default function () {
  const http_response = http.get(`http://localhost:8081/load`);
  check(http_response, {
    'is status 200': (response) => response.status === 200,
  });
	sleep(0.1)
}