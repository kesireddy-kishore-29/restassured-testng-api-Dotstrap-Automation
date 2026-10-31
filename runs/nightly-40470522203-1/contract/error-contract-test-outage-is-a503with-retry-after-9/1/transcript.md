# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 53 | `qa-fcb4946e-7dbd-4916-a62a-443e8a2b2518` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-51b67768-4ad5-4dfc-a9b3-3e31a11a9507` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-60435d13-940f-402c-8e42-f37cd8a99723` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-90ce9a66-f9e7-4fd1-8966-75430e9c5e6e` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 22 | `qa-b6bbdcce-cc4a-45b7-9c79-a4cd10abfd27` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-21c24bf6-8b6a-465a-bf5c-b7f3205ea7d1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-a774ede8-3ddf-45a1-9945-59c7a54d933c` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-5837df2e-2440-4d4e-858c-47d156c4cfb9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-e59b74c0-dcbe-44e5-9a71-437002eaee8f` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-1bf9e721-30bb-4957-b34e-17832c9d75d9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fcb4946e-7dbd-4916-a62a-443e8a2b2518

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcb4946e-7dbd-4916-a62a-443e8a2b2518
Content-Type: application/json

--- request body ---
{"handle":"qa-9b84efbe1cb2","displayName":"QA 9b84efbe1cb2","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-fcb4946e-7dbd-4916-a62a-443e8a2b2518
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 7
Location: /v1/accounts/qa-9b84efbe1cb2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c43d41fd-34a3-4a1b-aba1-74615ce1d644","handle":"qa-9b84efbe1cb2","displayName":"QA 9b84efbe1cb2","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.771674850Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-51b67768-4ad5-4dfc-a9b3-3e31a11a9507

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51b67768-4ad5-4dfc-a9b3-3e31a11a9507
Content-Type: application/json

--- request body ---
{"handle":"qa-3a2f772dd24a","displayName":"QA 3a2f772dd24a","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-51b67768-4ad5-4dfc-a9b3-3e31a11a9507
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 7
Location: /v1/accounts/qa-3a2f772dd24a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72978b42-9059-4955-a7b3-eebff86d9981","handle":"qa-3a2f772dd24a","displayName":"QA 3a2f772dd24a","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.821502423Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-60435d13-940f-402c-8e42-f37cd8a99723

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60435d13-940f-402c-8e42-f37cd8a99723
Content-Type: application/json

--- request body ---
{"handle":"qa-9b84efbe1cb2","password":"****"}

--- response: 200 in 38 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-60435d13-940f-402c-8e42-f37cd8a99723
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c43d41fd-34a3-4a1b-aba1-74615ce1d644"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-90ce9a66-f9e7-4fd1-8966-75430e9c5e6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90ce9a66-f9e7-4fd1-8966-75430e9c5e6e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3a2f772dd24a","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-90ce9a66-f9e7-4fd1-8966-75430e9c5e6e
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
Location: /v1/conversations/cnv_64681ddb-ef16-4381-ab9a-edfce4b8bdc3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_64681ddb-ef16-4381-ab9a-edfce4b8bdc3","subject":"Error contract","status":"open","region":"eu","participants":["qa-9b84efbe1cb2","qa-3a2f772dd24a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.923378029Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_64681ddb-ef16-4381-ab9a-edfce4b8bdc3/messages
correlation: qa-b6bbdcce-cc4a-45b7-9c79-a4cd10abfd27

--- request headers ---
Accept: application/json
X-Fault-Key: 7a427afd-6a66-4dec-8d8e-82a332369eaf
X-Fault: unavailable-once
X-Correlation-Id: qa-b6bbdcce-cc4a-45b7-9c79-a4cd10abfd27
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b6bbdcce-cc4a-45b7-9c79-a4cd10abfd27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_64681ddb-ef16-4381-ab9a-edfce4b8bdc3/messages","correlationId":"qa-b6bbdcce-cc4a-45b7-9c79-a4cd10abfd27"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-21c24bf6-8b6a-465a-bf5c-b7f3205ea7d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21c24bf6-8b6a-465a-bf5c-b7f3205ea7d1
Content-Type: application/json

--- request body ---
{"handle":"qa-3a2f772dd24a","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-21c24bf6-8b6a-465a-bf5c-b7f3205ea7d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72978b42-9059-4955-a7b3-eebff86d9981"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a774ede8-3ddf-45a1-9945-59c7a54d933c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a774ede8-3ddf-45a1-9945-59c7a54d933c
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a774ede8-3ddf-45a1-9945-59c7a54d933c
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
correlation: qa-5837df2e-2440-4d4e-858c-47d156c4cfb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5837df2e-2440-4d4e-858c-47d156c4cfb9
Content-Type: application/json

--- request body ---
{"handle":"qa-3a2f772dd24a","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5837df2e-2440-4d4e-858c-47d156c4cfb9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5837df2e-2440-4d4e-858c-47d156c4cfb9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e59b74c0-dcbe-44e5-9a71-437002eaee8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e59b74c0-dcbe-44e5-9a71-437002eaee8f
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e59b74c0-dcbe-44e5-9a71-437002eaee8f
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
correlation: qa-1bf9e721-30bb-4957-b34e-17832c9d75d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bf9e721-30bb-4957-b34e-17832c9d75d9
Content-Type: application/json

--- request body ---
{"handle":"qa-9b84efbe1cb2","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1bf9e721-30bb-4957-b34e-17832c9d75d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1bf9e721-30bb-4957-b34e-17832c9d75d9"}
```
