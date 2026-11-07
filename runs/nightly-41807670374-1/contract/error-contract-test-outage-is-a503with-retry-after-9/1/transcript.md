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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-ed8f3904-ab54-410e-915b-eb790c1fe59d` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-0a6ecf6c-1f60-46f4-8829-632e675e04e0` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-8d3b04c4-55c8-4e9d-ba33-e8c35852a4b2` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-c3a6be03-a082-4d9f-aa93-f6aa200835a8` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 24 | `qa-9595886e-5e68-4f5e-9941-92c95db14b14` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-ba7b6f85-b209-465e-b9e4-2b540beddd0b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-01a50d43-7675-4425-ab76-97bceaaa97a9` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-7bc988c1-b4a5-459d-bb5c-8fc35f4041d6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-1f1272fa-faed-4c53-82e0-d91a9da05b45` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-6f6da672-8b6e-4183-ae3c-8122cadbe722` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ed8f3904-ab54-410e-915b-eb790c1fe59d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed8f3904-ab54-410e-915b-eb790c1fe59d
Content-Type: application/json

--- request body ---
{"handle":"qa-d45e85e93b9b","displayName":"QA d45e85e93b9b","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed8f3904-ab54-410e-915b-eb790c1fe59d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 9
Location: /v1/accounts/qa-d45e85e93b9b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ffb904b6-8657-44fe-8f6c-573c2911530d","handle":"qa-d45e85e93b9b","displayName":"QA d45e85e93b9b","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.830772335Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0a6ecf6c-1f60-46f4-8829-632e675e04e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a6ecf6c-1f60-46f4-8829-632e675e04e0
Content-Type: application/json

--- request body ---
{"handle":"qa-510e00d3b061","displayName":"QA 510e00d3b061","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a6ecf6c-1f60-46f4-8829-632e675e04e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 9
Location: /v1/accounts/qa-510e00d3b061
X-Served-Region: eu
Content-Length: 181

{"id":"acc_df0b807b-c080-423d-a45f-8bfbb38be786","handle":"qa-510e00d3b061","displayName":"QA 510e00d3b061","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.857575570Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8d3b04c4-55c8-4e9d-ba33-e8c35852a4b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d3b04c4-55c8-4e9d-ba33-e8c35852a4b2
Content-Type: application/json

--- request body ---
{"handle":"qa-d45e85e93b9b","password":"****"}

--- response: 200 in 20 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d3b04c4-55c8-4e9d-ba33-e8c35852a4b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ffb904b6-8657-44fe-8f6c-573c2911530d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c3a6be03-a082-4d9f-aa93-f6aa200835a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3a6be03-a082-4d9f-aa93-f6aa200835a8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-510e00d3b061","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3a6be03-a082-4d9f-aa93-f6aa200835a8
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
Location: /v1/conversations/cnv_aa60d517-b335-417e-9a3d-40462cd08eb9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_aa60d517-b335-417e-9a3d-40462cd08eb9","subject":"Error contract","status":"open","region":"eu","participants":["qa-d45e85e93b9b","qa-510e00d3b061"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:02.915010463Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_aa60d517-b335-417e-9a3d-40462cd08eb9/messages
correlation: qa-9595886e-5e68-4f5e-9941-92c95db14b14

--- request headers ---
Accept: application/json
X-Fault-Key: 801eea5d-3d72-48a2-88e5-df1945021a57
X-Fault: unavailable-once
X-Correlation-Id: qa-9595886e-5e68-4f5e-9941-92c95db14b14
Content-Type: application/json

--- response: 503 in 24 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9595886e-5e68-4f5e-9941-92c95db14b14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_aa60d517-b335-417e-9a3d-40462cd08eb9/messages","correlationId":"qa-9595886e-5e68-4f5e-9941-92c95db14b14"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ba7b6f85-b209-465e-b9e4-2b540beddd0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba7b6f85-b209-465e-b9e4-2b540beddd0b
Content-Type: application/json

--- request body ---
{"handle":"qa-510e00d3b061","password":"****"}

--- response: 200 in 32 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba7b6f85-b209-465e-b9e4-2b540beddd0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_df0b807b-c080-423d-a45f-8bfbb38be786"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-01a50d43-7675-4425-ab76-97bceaaa97a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01a50d43-7675-4425-ab76-97bceaaa97a9
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-01a50d43-7675-4425-ab76-97bceaaa97a9
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
correlation: qa-7bc988c1-b4a5-459d-bb5c-8fc35f4041d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bc988c1-b4a5-459d-bb5c-8fc35f4041d6
Content-Type: application/json

--- request body ---
{"handle":"qa-510e00d3b061","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7bc988c1-b4a5-459d-bb5c-8fc35f4041d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7bc988c1-b4a5-459d-bb5c-8fc35f4041d6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1f1272fa-faed-4c53-82e0-d91a9da05b45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f1272fa-faed-4c53-82e0-d91a9da05b45
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1f1272fa-faed-4c53-82e0-d91a9da05b45
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
correlation: qa-6f6da672-8b6e-4183-ae3c-8122cadbe722

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f6da672-8b6e-4183-ae3c-8122cadbe722
Content-Type: application/json

--- request body ---
{"handle":"qa-d45e85e93b9b","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f6da672-8b6e-4183-ae3c-8122cadbe722
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6f6da672-8b6e-4183-ae3c-8122cadbe722"}
```
