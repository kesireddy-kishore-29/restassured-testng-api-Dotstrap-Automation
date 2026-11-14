# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-150cc22e-2ff8-4f8d-9d71-c832810f57e5` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-d0466ba7-fceb-4def-a53e-79d88e6e6f1b` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-3841a866-dc0c-4968-bf20-9d9bc2900a16` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-c557f991-f875-46ba-8d2f-76fe580ceccc` |
| 5 | `GET /v1/accounts/me` | 503 | 54 | `qa-a63ff967-3bc0-4216-9983-7086fbe48053` |
| 6 | `POST /v1/auth/token` | 200 | 48 | `qa-e5bea586-c285-49d5-a0cb-dfb935d9ee0f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-eb7a7b5b-d586-4df0-80d4-68ded5cbe2a2` |
| 8 | `POST /v1/auth/token` | 401 | 45 | `qa-fa6f1213-ab75-49e4-9158-99ca8c5bc45c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 56 | `qa-b301e3d0-e6b0-496b-8e53-96ee15d13750` |
| 10 | `POST /v1/auth/token` | 401 | 38 | `qa-be18ab78-c7f8-42c5-b993-59a13e2a35cd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-150cc22e-2ff8-4f8d-9d71-c832810f57e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-150cc22e-2ff8-4f8d-9d71-c832810f57e5
Content-Type: application/json

--- request body ---
{"handle":"qa-4fd71ff183b9","displayName":"QA 4fd71ff183b9","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-150cc22e-2ff8-4f8d-9d71-c832810f57e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Location: /v1/accounts/qa-4fd71ff183b9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0a993e1d-bf8f-4d32-9967-b812518d96f1","handle":"qa-4fd71ff183b9","displayName":"QA 4fd71ff183b9","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.211417208Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d0466ba7-fceb-4def-a53e-79d88e6e6f1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0466ba7-fceb-4def-a53e-79d88e6e6f1b
Content-Type: application/json

--- request body ---
{"handle":"qa-7e190bbf0207","displayName":"QA 7e190bbf0207","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0466ba7-fceb-4def-a53e-79d88e6e6f1b
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
Location: /v1/accounts/qa-7e190bbf0207
X-Served-Region: eu
Content-Length: 181

{"id":"acc_30af66bb-1869-4ddb-8838-6d6bb150899e","handle":"qa-7e190bbf0207","displayName":"QA 7e190bbf0207","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.259123611Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3841a866-dc0c-4968-bf20-9d9bc2900a16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3841a866-dc0c-4968-bf20-9d9bc2900a16
Content-Type: application/json

--- request body ---
{"handle":"qa-4fd71ff183b9","password":"****"}

--- response: 200 in 40 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-3841a866-dc0c-4968-bf20-9d9bc2900a16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0a993e1d-bf8f-4d32-9967-b812518d96f1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c557f991-f875-46ba-8d2f-76fe580ceccc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c557f991-f875-46ba-8d2f-76fe580ceccc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7e190bbf0207","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c557f991-f875-46ba-8d2f-76fe580ceccc
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
Location: /v1/conversations/cnv_c1f800c2-e866-42c0-933c-9ddc0c7b4e9c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c1f800c2-e866-42c0-933c-9ddc0c7b4e9c","subject":"Error contract","status":"open","region":"eu","participants":["qa-4fd71ff183b9","qa-7e190bbf0207"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:31.372095375Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-a63ff967-3bc0-4216-9983-7086fbe48053

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: d3f5b5f5-3de7-4590-90e6-769f03fdf3dc
X-Correlation-Id: qa-a63ff967-3bc0-4216-9983-7086fbe48053
Content-Type: application/json

--- response: 503 in 54 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a63ff967-3bc0-4216-9983-7086fbe48053
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-a63ff967-3bc0-4216-9983-7086fbe48053"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e5bea586-c285-49d5-a0cb-dfb935d9ee0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5bea586-c285-49d5-a0cb-dfb935d9ee0f
Content-Type: application/json

--- request body ---
{"handle":"qa-7e190bbf0207","password":"****"}

--- response: 200 in 48 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5bea586-c285-49d5-a0cb-dfb935d9ee0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30af66bb-1869-4ddb-8838-6d6bb150899e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eb7a7b5b-d586-4df0-80d4-68ded5cbe2a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb7a7b5b-d586-4df0-80d4-68ded5cbe2a2
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eb7a7b5b-d586-4df0-80d4-68ded5cbe2a2
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
correlation: qa-fa6f1213-ab75-49e4-9158-99ca8c5bc45c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa6f1213-ab75-49e4-9158-99ca8c5bc45c
Content-Type: application/json

--- request body ---
{"handle":"qa-7e190bbf0207","password":"****"}

--- response: 401 in 45 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa6f1213-ab75-49e4-9158-99ca8c5bc45c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fa6f1213-ab75-49e4-9158-99ca8c5bc45c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b301e3d0-e6b0-496b-8e53-96ee15d13750

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b301e3d0-e6b0-496b-8e53-96ee15d13750
Content-Type: application/json

--- response: 204 in 56 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b301e3d0-e6b0-496b-8e53-96ee15d13750
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
correlation: qa-be18ab78-c7f8-42c5-b993-59a13e2a35cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be18ab78-c7f8-42c5-b993-59a13e2a35cd
Content-Type: application/json

--- request body ---
{"handle":"qa-4fd71ff183b9","password":"****"}

--- response: 401 in 38 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be18ab78-c7f8-42c5-b993-59a13e2a35cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-be18ab78-c7f8-42c5-b993-59a13e2a35cd"}
```
