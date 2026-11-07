# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 51 | `qa-9184ef15-7aad-4c4d-8bdc-424393e9c741` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-82e3abf4-5c31-4ea5-89af-187fb444d636` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-ab446c06-0998-4ae6-a793-318fffa94b50` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-420b696c-a495-4fd1-9524-36cf0c0961ea` |
| 5 | `PATCH /v1/accounts/me` | 415 | 8 | `qa-4c6d750e-bbd5-4699-95eb-d69678c1563a` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-0d29d6d5-743d-4806-b524-780aa81424a6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-315b5a08-ac39-4a09-91c0-49207272adc6` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-bc919778-8cd1-4b65-a18b-c9e18bcc3b26` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-88c7c239-4520-44a6-a296-35069fb4f057` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-cd368e02-38c8-497a-a263-a5b87df8df9d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9184ef15-7aad-4c4d-8bdc-424393e9c741

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9184ef15-7aad-4c4d-8bdc-424393e9c741
Content-Type: application/json

--- request body ---
{"handle":"qa-c3cbfe485fd6","displayName":"QA c3cbfe485fd6","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9184ef15-7aad-4c4d-8bdc-424393e9c741
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
Location: /v1/accounts/qa-c3cbfe485fd6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cd15312b-de3e-4970-a71d-b7669dff1bf8","handle":"qa-c3cbfe485fd6","displayName":"QA c3cbfe485fd6","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.580838323Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-82e3abf4-5c31-4ea5-89af-187fb444d636

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82e3abf4-5c31-4ea5-89af-187fb444d636
Content-Type: application/json

--- request body ---
{"handle":"qa-702c06577dbd","displayName":"QA 702c06577dbd","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-82e3abf4-5c31-4ea5-89af-187fb444d636
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 8
Location: /v1/accounts/qa-702c06577dbd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5b62ce8d-a13c-4f70-a36f-377ff8e4de03","handle":"qa-702c06577dbd","displayName":"QA 702c06577dbd","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.644822661Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ab446c06-0998-4ae6-a793-318fffa94b50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab446c06-0998-4ae6-a793-318fffa94b50
Content-Type: application/json

--- request body ---
{"handle":"qa-c3cbfe485fd6","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab446c06-0998-4ae6-a793-318fffa94b50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cd15312b-de3e-4970-a71d-b7669dff1bf8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-420b696c-a495-4fd1-9524-36cf0c0961ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-420b696c-a495-4fd1-9524-36cf0c0961ea
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-702c06577dbd","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-420b696c-a495-4fd1-9524-36cf0c0961ea
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
Location: /v1/conversations/cnv_f1537676-60a8-48f1-aa85-7b4138a187b0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f1537676-60a8-48f1-aa85-7b4138a187b0","subject":"Error contract","status":"open","region":"eu","participants":["qa-c3cbfe485fd6","qa-702c06577dbd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:58.694902319Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-4c6d750e-bbd5-4699-95eb-d69678c1563a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c6d750e-bbd5-4699-95eb-d69678c1563a
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c6d750e-bbd5-4699-95eb-d69678c1563a
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-4c6d750e-bbd5-4699-95eb-d69678c1563a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0d29d6d5-743d-4806-b524-780aa81424a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d29d6d5-743d-4806-b524-780aa81424a6
Content-Type: application/json

--- request body ---
{"handle":"qa-702c06577dbd","password":"****"}

--- response: 200 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d29d6d5-743d-4806-b524-780aa81424a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5b62ce8d-a13c-4f70-a36f-377ff8e4de03"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-315b5a08-ac39-4a09-91c0-49207272adc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-315b5a08-ac39-4a09-91c0-49207272adc6
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-315b5a08-ac39-4a09-91c0-49207272adc6
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
correlation: qa-bc919778-8cd1-4b65-a18b-c9e18bcc3b26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc919778-8cd1-4b65-a18b-c9e18bcc3b26
Content-Type: application/json

--- request body ---
{"handle":"qa-702c06577dbd","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc919778-8cd1-4b65-a18b-c9e18bcc3b26
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bc919778-8cd1-4b65-a18b-c9e18bcc3b26"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-88c7c239-4520-44a6-a296-35069fb4f057

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88c7c239-4520-44a6-a296-35069fb4f057
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-88c7c239-4520-44a6-a296-35069fb4f057
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-cd368e02-38c8-497a-a263-a5b87df8df9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd368e02-38c8-497a-a263-a5b87df8df9d
Content-Type: application/json

--- request body ---
{"handle":"qa-c3cbfe485fd6","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd368e02-38c8-497a-a263-a5b87df8df9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cd368e02-38c8-497a-a263-a5b87df8df9d"}
```
