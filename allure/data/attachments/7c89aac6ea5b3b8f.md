# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 55 | `qa-1929c26c-1f3a-4b35-8b40-55357e0ac5ef` |
| 2 | `POST /v1/accounts` | 201 | 63 | `qa-9d597abd-7914-434c-984b-4f0090075ddd` |
| 3 | `POST /v1/auth/token` | 200 | 63 | `qa-7db01614-bcb4-4df6-948c-fa76dac82f3d` |
| 4 | `POST /v1/conversations` | 201 | 48 | `qa-3fbdbdce-962a-4e27-a816-62d79a52c1f3` |
| 5 | `DELETE /v1/accounts/me` | 503 | 33 | `qa-37284d3f-7ec7-48f8-b51e-94cc60838cb1` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-1d2a36bc-d47a-46d5-b2d9-460f1cfc3498` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-a263509a-328e-487d-91b0-6e431f15f282` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-dde4a139-5ac8-4f1f-b38c-e1b8ca47854e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-e1e56c70-f6a2-4eca-917b-87a14a40a8fc` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-4dc0449b-4df2-491c-90e3-05f5b7044c40` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1929c26c-1f3a-4b35-8b40-55357e0ac5ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1929c26c-1f3a-4b35-8b40-55357e0ac5ef
Content-Type: application/json

--- request body ---
{"handle":"qa-01150a822295","displayName":"QA 01150a822295","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-1929c26c-1f3a-4b35-8b40-55357e0ac5ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 8
Location: /v1/accounts/qa-01150a822295
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2bda3145-1c00-49b9-a155-ecced6faceac","handle":"qa-01150a822295","displayName":"QA 01150a822295","region":"eu","role":"user","createdAt":"2026-10-31T08:31:34.949099453Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9d597abd-7914-434c-984b-4f0090075ddd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d597abd-7914-434c-984b-4f0090075ddd
Content-Type: application/json

--- request body ---
{"handle":"qa-8875312abab7","displayName":"QA 8875312abab7","password":"****","region":"eu"}

--- response: 201 in 63 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d597abd-7914-434c-984b-4f0090075ddd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 8
Location: /v1/accounts/qa-8875312abab7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1b3a144a-d04b-4c39-a34b-dc3ea9ce1012","handle":"qa-8875312abab7","displayName":"QA 8875312abab7","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.038682560Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7db01614-bcb4-4df6-948c-fa76dac82f3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7db01614-bcb4-4df6-948c-fa76dac82f3d
Content-Type: application/json

--- request body ---
{"handle":"qa-01150a822295","password":"****"}

--- response: 200 in 63 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-7db01614-bcb4-4df6-948c-fa76dac82f3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2bda3145-1c00-49b9-a155-ecced6faceac"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3fbdbdce-962a-4e27-a816-62d79a52c1f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fbdbdce-962a-4e27-a816-62d79a52c1f3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8875312abab7","subject":"Error contract","message":"Hi"}

--- response: 201 in 48 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fbdbdce-962a-4e27-a816-62d79a52c1f3
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
Location: /v1/conversations/cnv_2a93a860-abaf-4237-ad2e-a3ad8d21d789
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2a93a860-abaf-4237-ad2e-a3ad8d21d789","subject":"Error contract","status":"open","region":"eu","participants":["qa-01150a822295","qa-8875312abab7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:35.197720016Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-37284d3f-7ec7-48f8-b51e-94cc60838cb1

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 882b89bd-0adb-4ac7-b937-2c0e326687a1
X-Correlation-Id: qa-37284d3f-7ec7-48f8-b51e-94cc60838cb1
Content-Type: application/json

--- response: 503 in 33 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37284d3f-7ec7-48f8-b51e-94cc60838cb1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-37284d3f-7ec7-48f8-b51e-94cc60838cb1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1d2a36bc-d47a-46d5-b2d9-460f1cfc3498

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d2a36bc-d47a-46d5-b2d9-460f1cfc3498
Content-Type: application/json

--- request body ---
{"handle":"qa-8875312abab7","password":"****"}

--- response: 200 in 38 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d2a36bc-d47a-46d5-b2d9-460f1cfc3498
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1b3a144a-d04b-4c39-a34b-dc3ea9ce1012"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a263509a-328e-487d-91b0-6e431f15f282

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a263509a-328e-487d-91b0-6e431f15f282
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a263509a-328e-487d-91b0-6e431f15f282
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
correlation: qa-dde4a139-5ac8-4f1f-b38c-e1b8ca47854e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dde4a139-5ac8-4f1f-b38c-e1b8ca47854e
Content-Type: application/json

--- request body ---
{"handle":"qa-8875312abab7","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dde4a139-5ac8-4f1f-b38c-e1b8ca47854e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dde4a139-5ac8-4f1f-b38c-e1b8ca47854e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e1e56c70-f6a2-4eca-917b-87a14a40a8fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1e56c70-f6a2-4eca-917b-87a14a40a8fc
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e1e56c70-f6a2-4eca-917b-87a14a40a8fc
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
correlation: qa-4dc0449b-4df2-491c-90e3-05f5b7044c40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dc0449b-4df2-491c-90e3-05f5b7044c40
Content-Type: application/json

--- request body ---
{"handle":"qa-01150a822295","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4dc0449b-4df2-491c-90e3-05f5b7044c40
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4dc0449b-4df2-491c-90e3-05f5b7044c40"}
```
