# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 64 | `qa-494083b2-a92c-492d-8fa9-8d99ea71214f` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-eaf0cc31-0467-4516-a291-ab07696acb76` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-5ec3ffd1-2c04-48b6-a8d0-591367f69b03` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-566e8681-ffae-4770-96c7-5561009c71fb` |
| 5 | `POST /v1/accounts` | 503 | 21 | `qa-1fd957cb-5117-4b50-ba03-5149d78b0942` |
| 6 | `POST /v1/auth/token` | 200 | 53 | `qa-718f75c7-3ef8-40f0-a20d-e7096eda1620` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-8732f7d8-8e3f-43bb-a224-1b17baade36a` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-3e87ec68-1278-4edb-a47b-eae1964c3ecd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-19a4753f-d480-4e0c-b8d8-b68d4a9ead29` |
| 10 | `POST /v1/auth/token` | 401 | 36 | `qa-1cd615bd-3c51-4cbd-a0fc-8658bcd6d0c7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-494083b2-a92c-492d-8fa9-8d99ea71214f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-494083b2-a92c-492d-8fa9-8d99ea71214f
Content-Type: application/json

--- request body ---
{"handle":"qa-8cb69cec1007","displayName":"QA 8cb69cec1007","password":"****","region":"eu"}

--- response: 201 in 64 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-494083b2-a92c-492d-8fa9-8d99ea71214f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Location: /v1/accounts/qa-8cb69cec1007
X-Served-Region: eu
Content-Length: 181

{"id":"acc_68d50faa-9710-4961-92c0-0238b6077041","handle":"qa-8cb69cec1007","displayName":"QA 8cb69cec1007","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.641324450Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-eaf0cc31-0467-4516-a291-ab07696acb76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaf0cc31-0467-4516-a291-ab07696acb76
Content-Type: application/json

--- request body ---
{"handle":"qa-c0288ced3375","displayName":"QA c0288ced3375","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-eaf0cc31-0467-4516-a291-ab07696acb76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 9
Location: /v1/accounts/qa-c0288ced3375
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cb2edef3-6085-4cbe-9f14-52b73b5c8c29","handle":"qa-c0288ced3375","displayName":"QA c0288ced3375","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.695603394Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5ec3ffd1-2c04-48b6-a8d0-591367f69b03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ec3ffd1-2c04-48b6-a8d0-591367f69b03
Content-Type: application/json

--- request body ---
{"handle":"qa-8cb69cec1007","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ec3ffd1-2c04-48b6-a8d0-591367f69b03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68d50faa-9710-4961-92c0-0238b6077041"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-566e8681-ffae-4770-96c7-5561009c71fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-566e8681-ffae-4770-96c7-5561009c71fb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c0288ced3375","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-566e8681-ffae-4770-96c7-5561009c71fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_7a57ded4-eaad-46a3-9813-f59e465c438e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7a57ded4-eaad-46a3-9813-f59e465c438e","subject":"Error contract","status":"open","region":"eu","participants":["qa-8cb69cec1007","qa-c0288ced3375"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:22.800853916Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-1fd957cb-5117-4b50-ba03-5149d78b0942

--- request headers ---
Accept: application/json
X-Fault-Key: 284c2540-c8f1-4b26-b61b-59a7b7b11ced
X-Fault: unavailable-once
X-Correlation-Id: qa-1fd957cb-5117-4b50-ba03-5149d78b0942
Content-Type: application/json

--- request body ---
{"handle":"qa-93136bafe641","displayName":"QA 93136bafe641","password":"****","region":"eu"}

--- response: 503 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1fd957cb-5117-4b50-ba03-5149d78b0942
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-1fd957cb-5117-4b50-ba03-5149d78b0942"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-718f75c7-3ef8-40f0-a20d-e7096eda1620

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-718f75c7-3ef8-40f0-a20d-e7096eda1620
Content-Type: application/json

--- request body ---
{"handle":"qa-c0288ced3375","password":"****"}

--- response: 200 in 53 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-718f75c7-3ef8-40f0-a20d-e7096eda1620
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cb2edef3-6085-4cbe-9f14-52b73b5c8c29"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8732f7d8-8e3f-43bb-a224-1b17baade36a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8732f7d8-8e3f-43bb-a224-1b17baade36a
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8732f7d8-8e3f-43bb-a224-1b17baade36a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-3e87ec68-1278-4edb-a47b-eae1964c3ecd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e87ec68-1278-4edb-a47b-eae1964c3ecd
Content-Type: application/json

--- request body ---
{"handle":"qa-c0288ced3375","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e87ec68-1278-4edb-a47b-eae1964c3ecd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3e87ec68-1278-4edb-a47b-eae1964c3ecd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-19a4753f-d480-4e0c-b8d8-b68d4a9ead29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19a4753f-d480-4e0c-b8d8-b68d4a9ead29
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-19a4753f-d480-4e0c-b8d8-b68d4a9ead29
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-1cd615bd-3c51-4cbd-a0fc-8658bcd6d0c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cd615bd-3c51-4cbd-a0fc-8658bcd6d0c7
Content-Type: application/json

--- request body ---
{"handle":"qa-8cb69cec1007","password":"****"}

--- response: 401 in 36 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1cd615bd-3c51-4cbd-a0fc-8658bcd6d0c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1cd615bd-3c51-4cbd-a0fc-8658bcd6d0c7"}
```
