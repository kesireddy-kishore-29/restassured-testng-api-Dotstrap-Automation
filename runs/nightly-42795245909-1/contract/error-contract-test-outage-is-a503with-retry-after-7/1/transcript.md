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
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-23caa72a-8122-45d7-8818-77772eff670c` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-a47d4dd4-f32b-4e0f-8288-d7325ecd97b0` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-1c89dc89-abd1-449e-acbc-dfb123a56040` |
| 4 | `POST /v1/conversations` | 201 | 3 | `qa-81b287e3-5734-48c0-ab13-579ed24be9b8` |
| 5 | `GET /v1/conversations` | 503 | 14 | `qa-ec7ef098-5930-4c12-81a0-2cc6873546f5` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-884eb93e-783f-4929-b469-7362bf0ecdf6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-d10863ae-5c15-47b5-a689-5d7a6485515f` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-0a9a0410-022d-4bc9-84fa-6c594f2addaa` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-a4c12f8b-bdf5-462b-81e3-4209b8fb01d0` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-bcdf2298-dc40-44b6-bb01-3ccbfc660718` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-23caa72a-8122-45d7-8818-77772eff670c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23caa72a-8122-45d7-8818-77772eff670c
Content-Type: application/json

--- request body ---
{"handle":"qa-18dce5054ba9","displayName":"QA 18dce5054ba9","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-23caa72a-8122-45d7-8818-77772eff670c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Location: /v1/accounts/qa-18dce5054ba9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b5e25815-3cc2-42e9-99c9-481f3ae24fb8","handle":"qa-18dce5054ba9","displayName":"QA 18dce5054ba9","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.393548185Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a47d4dd4-f32b-4e0f-8288-d7325ecd97b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a47d4dd4-f32b-4e0f-8288-d7325ecd97b0
Content-Type: application/json

--- request body ---
{"handle":"qa-9ba4f02ef056","displayName":"QA 9ba4f02ef056","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-a47d4dd4-f32b-4e0f-8288-d7325ecd97b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 8
Location: /v1/accounts/qa-9ba4f02ef056
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7d2e0176-bb40-48ac-8350-342e495d5168","handle":"qa-9ba4f02ef056","displayName":"QA 9ba4f02ef056","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.439235210Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1c89dc89-abd1-449e-acbc-dfb123a56040

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c89dc89-abd1-449e-acbc-dfb123a56040
Content-Type: application/json

--- request body ---
{"handle":"qa-18dce5054ba9","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c89dc89-abd1-449e-acbc-dfb123a56040
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b5e25815-3cc2-42e9-99c9-481f3ae24fb8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-81b287e3-5734-48c0-ab13-579ed24be9b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81b287e3-5734-48c0-ab13-579ed24be9b8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9ba4f02ef056","subject":"Error contract","message":"Hi"}

--- response: 201 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-81b287e3-5734-48c0-ab13-579ed24be9b8
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
Location: /v1/conversations/cnv_86eb9dba-bd56-497f-84dc-97b74ff81c86
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_86eb9dba-bd56-497f-84dc-97b74ff81c86","subject":"Error contract","status":"open","region":"eu","participants":["qa-18dce5054ba9","qa-9ba4f02ef056"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:36.498523323Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-ec7ef098-5930-4c12-81a0-2cc6873546f5

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 02c2d965-68eb-4953-a213-98ee04594c67
X-Correlation-Id: qa-ec7ef098-5930-4c12-81a0-2cc6873546f5
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ec7ef098-5930-4c12-81a0-2cc6873546f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-ec7ef098-5930-4c12-81a0-2cc6873546f5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-884eb93e-783f-4929-b469-7362bf0ecdf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-884eb93e-783f-4929-b469-7362bf0ecdf6
Content-Type: application/json

--- request body ---
{"handle":"qa-9ba4f02ef056","password":"****"}

--- response: 200 in 24 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-884eb93e-783f-4929-b469-7362bf0ecdf6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d2e0176-bb40-48ac-8350-342e495d5168"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d10863ae-5c15-47b5-a689-5d7a6485515f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d10863ae-5c15-47b5-a689-5d7a6485515f
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d10863ae-5c15-47b5-a689-5d7a6485515f
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
correlation: qa-0a9a0410-022d-4bc9-84fa-6c594f2addaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a9a0410-022d-4bc9-84fa-6c594f2addaa
Content-Type: application/json

--- request body ---
{"handle":"qa-9ba4f02ef056","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0a9a0410-022d-4bc9-84fa-6c594f2addaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0a9a0410-022d-4bc9-84fa-6c594f2addaa"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a4c12f8b-bdf5-462b-81e3-4209b8fb01d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4c12f8b-bdf5-462b-81e3-4209b8fb01d0
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a4c12f8b-bdf5-462b-81e3-4209b8fb01d0
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
correlation: qa-bcdf2298-dc40-44b6-bb01-3ccbfc660718

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcdf2298-dc40-44b6-bb01-3ccbfc660718
Content-Type: application/json

--- request body ---
{"handle":"qa-18dce5054ba9","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bcdf2298-dc40-44b6-bb01-3ccbfc660718
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bcdf2298-dc40-44b6-bb01-3ccbfc660718"}
```
