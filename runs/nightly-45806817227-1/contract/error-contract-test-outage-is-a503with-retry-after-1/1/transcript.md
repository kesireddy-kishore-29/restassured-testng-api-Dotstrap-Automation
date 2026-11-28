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
| 1 | `POST /v1/accounts` | 201 | 57 | `qa-d4972d68-e4a7-40c8-af2c-c56d6e431aee` |
| 2 | `POST /v1/accounts` | 201 | 48 | `qa-7742f9f3-e5dd-4821-86b2-424102ffe219` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-0f7705ed-103b-424b-9199-d94b8b202a05` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-c115dc9d-9274-42d9-8be5-8694aa471d7f` |
| 5 | `POST /v1/accounts` | 503 | 16 | `qa-c64ec4dd-16e0-4d1a-910e-155901cf6982` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-0d1fbcfa-2f6b-4ab6-a1e5-50e4a12a1876` |
| 7 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-ef77da0c-7750-49f5-87c2-9d538f39dd8d` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-708d1734-6043-420f-911b-8c68892275cc` |
| 9 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-48322086-dd80-4076-88e1-aa9a9d90d6d2` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-9e996b7b-0020-4ae1-a6a1-d9ad12178922` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d4972d68-e4a7-40c8-af2c-c56d6e431aee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4972d68-e4a7-40c8-af2c-c56d6e431aee
Content-Type: application/json

--- request body ---
{"handle":"qa-f3fcfeb8d568","displayName":"QA f3fcfeb8d568","password":"****","region":"eu"}

--- response: 201 in 57 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4972d68-e4a7-40c8-af2c-c56d6e431aee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Location: /v1/accounts/qa-f3fcfeb8d568
X-Served-Region: eu
Content-Length: 181

{"id":"acc_df1a9c78-f5ea-4768-a31a-71a2a7842343","handle":"qa-f3fcfeb8d568","displayName":"QA f3fcfeb8d568","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.609831650Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7742f9f3-e5dd-4821-86b2-424102ffe219

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7742f9f3-e5dd-4821-86b2-424102ffe219
Content-Type: application/json

--- request body ---
{"handle":"qa-a2292d426d16","displayName":"QA a2292d426d16","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-7742f9f3-e5dd-4821-86b2-424102ffe219
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Location: /v1/accounts/qa-a2292d426d16
X-Served-Region: eu
Content-Length: 181

{"id":"acc_59f731fb-28ee-42c4-b1db-4884e26f9e3f","handle":"qa-a2292d426d16","displayName":"QA a2292d426d16","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.678134782Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0f7705ed-103b-424b-9199-d94b8b202a05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f7705ed-103b-424b-9199-d94b8b202a05
Content-Type: application/json

--- request body ---
{"handle":"qa-f3fcfeb8d568","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f7705ed-103b-424b-9199-d94b8b202a05
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_df1a9c78-f5ea-4768-a31a-71a2a7842343"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c115dc9d-9274-42d9-8be5-8694aa471d7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c115dc9d-9274-42d9-8be5-8694aa471d7f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a2292d426d16","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-c115dc9d-9274-42d9-8be5-8694aa471d7f
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
Location: /v1/conversations/cnv_923739f8-865e-4148-ac5d-f3d4143a1d44
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_923739f8-865e-4148-ac5d-f3d4143a1d44","subject":"Error contract","status":"open","region":"eu","participants":["qa-f3fcfeb8d568","qa-a2292d426d16"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:43.783981301Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-c64ec4dd-16e0-4d1a-910e-155901cf6982

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f4c20a5d-4ace-44be-80ac-c208f1efd238
X-Correlation-Id: qa-c64ec4dd-16e0-4d1a-910e-155901cf6982
Content-Type: application/json

--- request body ---
{"handle":"qa-d1c7a39eda8c","displayName":"QA d1c7a39eda8c","password":"****","region":"eu"}

--- response: 503 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c64ec4dd-16e0-4d1a-910e-155901cf6982
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-c64ec4dd-16e0-4d1a-910e-155901cf6982"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0d1fbcfa-2f6b-4ab6-a1e5-50e4a12a1876

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d1fbcfa-2f6b-4ab6-a1e5-50e4a12a1876
Content-Type: application/json

--- request body ---
{"handle":"qa-a2292d426d16","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d1fbcfa-2f6b-4ab6-a1e5-50e4a12a1876
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_59f731fb-28ee-42c4-b1db-4884e26f9e3f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ef77da0c-7750-49f5-87c2-9d538f39dd8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef77da0c-7750-49f5-87c2-9d538f39dd8d
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ef77da0c-7750-49f5-87c2-9d538f39dd8d
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
correlation: qa-708d1734-6043-420f-911b-8c68892275cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-708d1734-6043-420f-911b-8c68892275cc
Content-Type: application/json

--- request body ---
{"handle":"qa-a2292d426d16","password":"****"}

--- response: 401 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-708d1734-6043-420f-911b-8c68892275cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-708d1734-6043-420f-911b-8c68892275cc"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-48322086-dd80-4076-88e1-aa9a9d90d6d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48322086-dd80-4076-88e1-aa9a9d90d6d2
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-48322086-dd80-4076-88e1-aa9a9d90d6d2
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
correlation: qa-9e996b7b-0020-4ae1-a6a1-d9ad12178922

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e996b7b-0020-4ae1-a6a1-d9ad12178922
Content-Type: application/json

--- request body ---
{"handle":"qa-f3fcfeb8d568","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9e996b7b-0020-4ae1-a6a1-d9ad12178922
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9e996b7b-0020-4ae1-a6a1-d9ad12178922"}
```
