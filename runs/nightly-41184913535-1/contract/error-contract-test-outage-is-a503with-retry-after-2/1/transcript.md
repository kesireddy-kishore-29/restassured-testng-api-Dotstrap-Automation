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
| 1 | `POST /v1/accounts` | 201 | 688 | `qa-3e3b4dab-f397-45ee-a403-73872f0806db` |
| 2 | `POST /v1/accounts` | 201 | 65 | `qa-2fef5363-ecaa-430d-9a82-6b2e951e2da0` |
| 3 | `POST /v1/auth/token` | 200 | 66 | `qa-4ff68cd0-55c4-4785-954a-e94cf1a4a66d` |
| 4 | `POST /v1/conversations` | 201 | 73 | `qa-3e8a5599-103c-4d83-bb5a-b422aeb3495e` |
| 5 | `GET /v1/accounts/me` | 503 | 44 | `qa-e7df3b0c-44af-4e94-bc2e-8bda056c520c` |
| 6 | `POST /v1/auth/token` | 200 | 61 | `qa-027db486-47e3-4e91-83dc-5b856f2a4930` |
| 7 | `DELETE /v1/accounts/me` | 204 | 38 | `qa-0410efc3-c1af-4939-93ba-f7e0491b832a` |
| 8 | `POST /v1/auth/token` | 401 | 48 | `qa-caa64288-5e7b-49f2-8e16-cecc963ee885` |
| 9 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-c8c639bc-ef8a-4f71-8ee3-c2e6aa47edc3` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-6bf41090-7614-4354-a9e7-9cbb3df17cdb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3e3b4dab-f397-45ee-a403-73872f0806db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e3b4dab-f397-45ee-a403-73872f0806db
Content-Type: application/json

--- request body ---
{"handle":"qa-394f556538f1","displayName":"QA 394f556538f1","password":"****","region":"eu"}

--- response: 201 in 688 ms ---
Date: Sat, 31 Oct 2026 08:31:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e3b4dab-f397-45ee-a403-73872f0806db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-394f556538f1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eac2c621-a846-4c57-b9cd-888102d27615","handle":"qa-394f556538f1","displayName":"QA 394f556538f1","region":"eu","role":"user","createdAt":"2026-10-31T08:31:32.895242512Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2fef5363-ecaa-430d-9a82-6b2e951e2da0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fef5363-ecaa-430d-9a82-6b2e951e2da0
Content-Type: application/json

--- request body ---
{"handle":"qa-88cf016a84f7","displayName":"QA 88cf016a84f7","password":"****","region":"eu"}

--- response: 201 in 65 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fef5363-ecaa-430d-9a82-6b2e951e2da0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Location: /v1/accounts/qa-88cf016a84f7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c7a7e3b6-0c2a-4aab-9ba0-b559b7de1c8a","handle":"qa-88cf016a84f7","displayName":"QA 88cf016a84f7","region":"eu","role":"user","createdAt":"2026-10-31T08:31:33.276812086Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4ff68cd0-55c4-4785-954a-e94cf1a4a66d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ff68cd0-55c4-4785-954a-e94cf1a4a66d
Content-Type: application/json

--- request body ---
{"handle":"qa-394f556538f1","password":"****"}

--- response: 200 in 66 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ff68cd0-55c4-4785-954a-e94cf1a4a66d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eac2c621-a846-4c57-b9cd-888102d27615"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3e8a5599-103c-4d83-bb5a-b422aeb3495e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e8a5599-103c-4d83-bb5a-b422aeb3495e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-88cf016a84f7","subject":"Error contract","message":"Hi"}

--- response: 201 in 73 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e8a5599-103c-4d83-bb5a-b422aeb3495e
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
Location: /v1/conversations/cnv_976221b3-2f41-4111-9841-24f23929d9b2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_976221b3-2f41-4111-9841-24f23929d9b2","subject":"Error contract","status":"open","region":"eu","participants":["qa-394f556538f1","qa-88cf016a84f7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:33.552875751Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-e7df3b0c-44af-4e94-bc2e-8bda056c520c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: b4367d28-58ac-4d8a-b387-cfe9b57d67e8
X-Correlation-Id: qa-e7df3b0c-44af-4e94-bc2e-8bda056c520c
Content-Type: application/json

--- response: 503 in 44 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e7df3b0c-44af-4e94-bc2e-8bda056c520c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-e7df3b0c-44af-4e94-bc2e-8bda056c520c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-027db486-47e3-4e91-83dc-5b856f2a4930

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-027db486-47e3-4e91-83dc-5b856f2a4930
Content-Type: application/json

--- request body ---
{"handle":"qa-88cf016a84f7","password":"****"}

--- response: 200 in 61 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-027db486-47e3-4e91-83dc-5b856f2a4930
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c7a7e3b6-0c2a-4aab-9ba0-b559b7de1c8a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0410efc3-c1af-4939-93ba-f7e0491b832a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0410efc3-c1af-4939-93ba-f7e0491b832a
Content-Type: application/json

--- response: 204 in 38 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0410efc3-c1af-4939-93ba-f7e0491b832a
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
correlation: qa-caa64288-5e7b-49f2-8e16-cecc963ee885

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-caa64288-5e7b-49f2-8e16-cecc963ee885
Content-Type: application/json

--- request body ---
{"handle":"qa-88cf016a84f7","password":"****"}

--- response: 401 in 48 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-caa64288-5e7b-49f2-8e16-cecc963ee885
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-caa64288-5e7b-49f2-8e16-cecc963ee885"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c8c639bc-ef8a-4f71-8ee3-c2e6aa47edc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8c639bc-ef8a-4f71-8ee3-c2e6aa47edc3
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c8c639bc-ef8a-4f71-8ee3-c2e6aa47edc3
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
correlation: qa-6bf41090-7614-4354-a9e7-9cbb3df17cdb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bf41090-7614-4354-a9e7-9cbb3df17cdb
Content-Type: application/json

--- request body ---
{"handle":"qa-394f556538f1","password":"****"}

--- response: 401 in 26 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6bf41090-7614-4354-a9e7-9cbb3df17cdb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6bf41090-7614-4354-a9e7-9cbb3df17cdb"}
```
