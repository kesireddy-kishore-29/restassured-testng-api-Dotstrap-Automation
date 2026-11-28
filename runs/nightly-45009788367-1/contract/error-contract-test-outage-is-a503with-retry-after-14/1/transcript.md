# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-0322c265-0b7d-4518-9f54-26f1de1f5e2d` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-5f51f4a5-dfb3-4e7c-9561-05fe4b2cc272` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-e8542514-236e-440d-a688-56647180f760` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-f47804dd-b628-4bcd-932e-2b79e7bac6f2` |
| 5 | `GET /v1/credits/ledger` | 503 | 5 | `qa-925b0ea7-287c-4329-a13f-00195b097ca4` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-7ccf2f7a-90b8-4c08-9cac-07ff4de7223c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-48bc198d-2a55-4a95-8ce2-4bc67e2bed7d` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-1de95e32-75b9-4ae3-b637-8ca7cce9f33e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-c68c2454-b3e4-4417-9e16-45557d75ccf9` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-eb1afcd5-4428-4d27-8980-452b70ea1704` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0322c265-0b7d-4518-9f54-26f1de1f5e2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0322c265-0b7d-4518-9f54-26f1de1f5e2d
Content-Type: application/json

--- request body ---
{"handle":"qa-af6846d72ea5","displayName":"QA af6846d72ea5","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-0322c265-0b7d-4518-9f54-26f1de1f5e2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 8
Location: /v1/accounts/qa-af6846d72ea5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3cd16b29-2147-4493-8e20-c712fc56d04c","handle":"qa-af6846d72ea5","displayName":"QA af6846d72ea5","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.024484452Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5f51f4a5-dfb3-4e7c-9561-05fe4b2cc272

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f51f4a5-dfb3-4e7c-9561-05fe4b2cc272
Content-Type: application/json

--- request body ---
{"handle":"qa-dd5f194515e6","displayName":"QA dd5f194515e6","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f51f4a5-dfb3-4e7c-9561-05fe4b2cc272
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 8
Location: /v1/accounts/qa-dd5f194515e6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4b9b94bc-3086-45d2-8c4a-c1c94fdf5389","handle":"qa-dd5f194515e6","displayName":"QA dd5f194515e6","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.101379987Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e8542514-236e-440d-a688-56647180f760

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8542514-236e-440d-a688-56647180f760
Content-Type: application/json

--- request body ---
{"handle":"qa-af6846d72ea5","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8542514-236e-440d-a688-56647180f760
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3cd16b29-2147-4493-8e20-c712fc56d04c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f47804dd-b628-4bcd-932e-2b79e7bac6f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f47804dd-b628-4bcd-932e-2b79e7bac6f2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dd5f194515e6","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-f47804dd-b628-4bcd-932e-2b79e7bac6f2
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
Location: /v1/conversations/cnv_7863ebaa-51f4-46d4-a453-c5ae81c43b63
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7863ebaa-51f4-46d4-a453-c5ae81c43b63","subject":"Error contract","status":"open","region":"eu","participants":["qa-af6846d72ea5","qa-dd5f194515e6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:42.160512610Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-925b0ea7-287c-4329-a13f-00195b097ca4

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c793bd21-9afc-438f-a143-c154191e8ad6
X-Correlation-Id: qa-925b0ea7-287c-4329-a13f-00195b097ca4
Content-Type: application/json

--- response: 503 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-925b0ea7-287c-4329-a13f-00195b097ca4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-925b0ea7-287c-4329-a13f-00195b097ca4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7ccf2f7a-90b8-4c08-9cac-07ff4de7223c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ccf2f7a-90b8-4c08-9cac-07ff4de7223c
Content-Type: application/json

--- request body ---
{"handle":"qa-dd5f194515e6","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ccf2f7a-90b8-4c08-9cac-07ff4de7223c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4b9b94bc-3086-45d2-8c4a-c1c94fdf5389"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-48bc198d-2a55-4a95-8ce2-4bc67e2bed7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48bc198d-2a55-4a95-8ce2-4bc67e2bed7d
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-48bc198d-2a55-4a95-8ce2-4bc67e2bed7d
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
correlation: qa-1de95e32-75b9-4ae3-b637-8ca7cce9f33e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1de95e32-75b9-4ae3-b637-8ca7cce9f33e
Content-Type: application/json

--- request body ---
{"handle":"qa-dd5f194515e6","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1de95e32-75b9-4ae3-b637-8ca7cce9f33e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1de95e32-75b9-4ae3-b637-8ca7cce9f33e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c68c2454-b3e4-4417-9e16-45557d75ccf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c68c2454-b3e4-4417-9e16-45557d75ccf9
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c68c2454-b3e4-4417-9e16-45557d75ccf9
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
correlation: qa-eb1afcd5-4428-4d27-8980-452b70ea1704

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb1afcd5-4428-4d27-8980-452b70ea1704
Content-Type: application/json

--- request body ---
{"handle":"qa-af6846d72ea5","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb1afcd5-4428-4d27-8980-452b70ea1704
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eb1afcd5-4428-4d27-8980-452b70ea1704"}
```
