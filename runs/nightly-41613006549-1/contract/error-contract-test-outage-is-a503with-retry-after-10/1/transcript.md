# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-0dc7067a-1fa8-4c61-a11b-a614a9a12f77` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-ecc66881-ff51-4979-9e6b-340180beae30` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-0e93c566-e896-4ed9-87b8-e6f4b0aa2150` |
| 4 | `POST /v1/conversations` | 201 | 33 | `qa-beb5f48c-23f7-490f-b172-1dc56f7f9554` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 17 | `qa-7086182f-90fa-423d-8599-b2b270dba018` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-bf5c032b-4589-4fc3-a681-443a6b5f27f7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-b380afce-5d84-4214-8fc8-f10c60830a16` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-8cfdc7ae-9344-4b62-bdb5-99f6e0d48a4a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-9b110696-48b9-4ab9-9d0f-6b6a8aa96534` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-7e52ad4b-b8e9-4da0-85cc-a70ce92a1e15` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0dc7067a-1fa8-4c61-a11b-a614a9a12f77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dc7067a-1fa8-4c61-a11b-a614a9a12f77
Content-Type: application/json

--- request body ---
{"handle":"qa-db1209d8d29f","displayName":"QA db1209d8d29f","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dc7067a-1fa8-4c61-a11b-a614a9a12f77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 9
Location: /v1/accounts/qa-db1209d8d29f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6fcc7d94-c73e-4315-b53f-1deb5ab9b27f","handle":"qa-db1209d8d29f","displayName":"QA db1209d8d29f","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.774824805Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ecc66881-ff51-4979-9e6b-340180beae30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecc66881-ff51-4979-9e6b-340180beae30
Content-Type: application/json

--- request body ---
{"handle":"qa-01e5032a9b53","displayName":"QA 01e5032a9b53","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecc66881-ff51-4979-9e6b-340180beae30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 8
Location: /v1/accounts/qa-01e5032a9b53
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e74a1c06-08dc-43de-9feb-558a1f2ec473","handle":"qa-01e5032a9b53","displayName":"QA 01e5032a9b53","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.815548745Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0e93c566-e896-4ed9-87b8-e6f4b0aa2150

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e93c566-e896-4ed9-87b8-e6f4b0aa2150
Content-Type: application/json

--- request body ---
{"handle":"qa-db1209d8d29f","password":"****"}

--- response: 200 in 28 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e93c566-e896-4ed9-87b8-e6f4b0aa2150
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6fcc7d94-c73e-4315-b53f-1deb5ab9b27f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-beb5f48c-23f7-490f-b172-1dc56f7f9554

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-beb5f48c-23f7-490f-b172-1dc56f7f9554
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-01e5032a9b53","subject":"Error contract","message":"Hi"}

--- response: 201 in 33 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-beb5f48c-23f7-490f-b172-1dc56f7f9554
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
Location: /v1/conversations/cnv_d0b14132-ba9f-46d7-a7a4-b90c759af248
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d0b14132-ba9f-46d7-a7a4-b90c759af248","subject":"Error contract","status":"open","region":"eu","participants":["qa-db1209d8d29f","qa-01e5032a9b53"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:32.898250574Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_d0b14132-ba9f-46d7-a7a4-b90c759af248/messages
correlation: qa-7086182f-90fa-423d-8599-b2b270dba018

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: af22a9b1-feb0-4143-88dc-b9baebc088f1
X-Correlation-Id: qa-7086182f-90fa-423d-8599-b2b270dba018
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7086182f-90fa-423d-8599-b2b270dba018
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_d0b14132-ba9f-46d7-a7a4-b90c759af248/messages","correlationId":"qa-7086182f-90fa-423d-8599-b2b270dba018"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bf5c032b-4589-4fc3-a681-443a6b5f27f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf5c032b-4589-4fc3-a681-443a6b5f27f7
Content-Type: application/json

--- request body ---
{"handle":"qa-01e5032a9b53","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf5c032b-4589-4fc3-a681-443a6b5f27f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e74a1c06-08dc-43de-9feb-558a1f2ec473"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b380afce-5d84-4214-8fc8-f10c60830a16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b380afce-5d84-4214-8fc8-f10c60830a16
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b380afce-5d84-4214-8fc8-f10c60830a16
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
correlation: qa-8cfdc7ae-9344-4b62-bdb5-99f6e0d48a4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cfdc7ae-9344-4b62-bdb5-99f6e0d48a4a
Content-Type: application/json

--- request body ---
{"handle":"qa-01e5032a9b53","password":"****"}

--- response: 401 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8cfdc7ae-9344-4b62-bdb5-99f6e0d48a4a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8cfdc7ae-9344-4b62-bdb5-99f6e0d48a4a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9b110696-48b9-4ab9-9d0f-6b6a8aa96534

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b110696-48b9-4ab9-9d0f-6b6a8aa96534
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9b110696-48b9-4ab9-9d0f-6b6a8aa96534
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-7e52ad4b-b8e9-4da0-85cc-a70ce92a1e15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e52ad4b-b8e9-4da0-85cc-a70ce92a1e15
Content-Type: application/json

--- request body ---
{"handle":"qa-db1209d8d29f","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e52ad4b-b8e9-4da0-85cc-a70ce92a1e15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7e52ad4b-b8e9-4da0-85cc-a70ce92a1e15"}
```
