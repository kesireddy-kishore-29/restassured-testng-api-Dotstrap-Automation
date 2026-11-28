# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 94 | `qa-22d738b3-d5a1-4c53-9d9b-9e73bba02cc0` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-d8b1d1b2-9102-442e-883f-a95e44efdf5f` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-9f27a82b-c3b1-43d4-8ba5-4069b46c0011` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-c2dc099f-9c03-4946-b2f0-4e11fcb4a67b` |
| 5 | `GET /v1/conversations` | 503 | 16 | `qa-71e9fd3f-2412-44c2-b4af-c965b16db27a` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-3c2fc284-d4f7-4851-8105-6c08a7b127d8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-b00260a7-662c-422e-aeab-86da3d8accf0` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-7bdac20a-5332-482f-8141-080d6408db8f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-bf74af27-c604-4eda-9c66-148994c1425b` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-f57bc077-96f8-4214-b236-df9fc3d8dc85` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-22d738b3-d5a1-4c53-9d9b-9e73bba02cc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22d738b3-d5a1-4c53-9d9b-9e73bba02cc0
Content-Type: application/json

--- request body ---
{"handle":"qa-f4cbc58632f0","displayName":"QA f4cbc58632f0","password":"****","region":"eu"}

--- response: 201 in 94 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-22d738b3-d5a1-4c53-9d9b-9e73bba02cc0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 8
Location: /v1/accounts/qa-f4cbc58632f0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_05409cae-c89c-4c0c-aa9b-de58496e7fa9","handle":"qa-f4cbc58632f0","displayName":"QA f4cbc58632f0","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.322262221Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d8b1d1b2-9102-442e-883f-a95e44efdf5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8b1d1b2-9102-442e-883f-a95e44efdf5f
Content-Type: application/json

--- request body ---
{"handle":"qa-9c96e4c9dc4e","displayName":"QA 9c96e4c9dc4e","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8b1d1b2-9102-442e-883f-a95e44efdf5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 7
Location: /v1/accounts/qa-9c96e4c9dc4e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3d6bd211-465f-4470-9e83-a69cf1676c0a","handle":"qa-9c96e4c9dc4e","displayName":"QA 9c96e4c9dc4e","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.377733181Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9f27a82b-c3b1-43d4-8ba5-4069b46c0011

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f27a82b-c3b1-43d4-8ba5-4069b46c0011
Content-Type: application/json

--- request body ---
{"handle":"qa-f4cbc58632f0","password":"****"}

--- response: 200 in 41 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f27a82b-c3b1-43d4-8ba5-4069b46c0011
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_05409cae-c89c-4c0c-aa9b-de58496e7fa9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c2dc099f-9c03-4946-b2f0-4e11fcb4a67b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2dc099f-9c03-4946-b2f0-4e11fcb4a67b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9c96e4c9dc4e","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2dc099f-9c03-4946-b2f0-4e11fcb4a67b
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
Location: /v1/conversations/cnv_a62a208e-758a-44df-a1fe-d75cc57867f4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a62a208e-758a-44df-a1fe-d75cc57867f4","subject":"Error contract","status":"open","region":"eu","participants":["qa-f4cbc58632f0","qa-9c96e4c9dc4e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:45.507093772Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-71e9fd3f-2412-44c2-b4af-c965b16db27a

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: fab2c64d-c966-4ece-b0d9-7610655def59
X-Correlation-Id: qa-71e9fd3f-2412-44c2-b4af-c965b16db27a
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71e9fd3f-2412-44c2-b4af-c965b16db27a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-71e9fd3f-2412-44c2-b4af-c965b16db27a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3c2fc284-d4f7-4851-8105-6c08a7b127d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c2fc284-d4f7-4851-8105-6c08a7b127d8
Content-Type: application/json

--- request body ---
{"handle":"qa-9c96e4c9dc4e","password":"****"}

--- response: 200 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c2fc284-d4f7-4851-8105-6c08a7b127d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3d6bd211-465f-4470-9e83-a69cf1676c0a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b00260a7-662c-422e-aeab-86da3d8accf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b00260a7-662c-422e-aeab-86da3d8accf0
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b00260a7-662c-422e-aeab-86da3d8accf0
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
correlation: qa-7bdac20a-5332-482f-8141-080d6408db8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bdac20a-5332-482f-8141-080d6408db8f
Content-Type: application/json

--- request body ---
{"handle":"qa-9c96e4c9dc4e","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7bdac20a-5332-482f-8141-080d6408db8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7bdac20a-5332-482f-8141-080d6408db8f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bf74af27-c604-4eda-9c66-148994c1425b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf74af27-c604-4eda-9c66-148994c1425b
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bf74af27-c604-4eda-9c66-148994c1425b
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
correlation: qa-f57bc077-96f8-4214-b236-df9fc3d8dc85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f57bc077-96f8-4214-b236-df9fc3d8dc85
Content-Type: application/json

--- request body ---
{"handle":"qa-f4cbc58632f0","password":"****"}

--- response: 401 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f57bc077-96f8-4214-b236-df9fc3d8dc85
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f57bc077-96f8-4214-b236-df9fc3d8dc85"}
```
