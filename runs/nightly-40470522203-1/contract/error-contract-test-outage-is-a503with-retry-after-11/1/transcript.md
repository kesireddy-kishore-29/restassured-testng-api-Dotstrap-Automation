# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-89d68e4c-952b-4e2d-8788-4373fc327949` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-f47198f5-7f4b-4ccf-bf71-714ca1eb84f2` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-dc546108-cc9a-49af-ab8e-2e8730ed853e` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-47b19c73-63aa-4fb6-afb8-177efb529244` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 7 | `qa-9ad9406f-8cb8-4790-9ac7-95a0d5c80d64` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-764d9b31-0745-44de-a49a-fd8245d02c8a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-aedfd4bd-5310-440e-b34f-e69583a26b84` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-7fd78b2f-5b83-4a27-bed2-3b1d2eaaf063` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-2ca4e36d-1834-4e63-a273-2ade59351b1f` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-eab08849-ce79-44e8-860f-78c9fdbd3aa6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-89d68e4c-952b-4e2d-8788-4373fc327949

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89d68e4c-952b-4e2d-8788-4373fc327949
Content-Type: application/json

--- request body ---
{"handle":"qa-cf388014c967","displayName":"QA cf388014c967","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-89d68e4c-952b-4e2d-8788-4373fc327949
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
Location: /v1/accounts/qa-cf388014c967
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3d20ce02-65ac-43f3-bef2-3c58b9b1886b","handle":"qa-cf388014c967","displayName":"QA cf388014c967","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.787478147Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f47198f5-7f4b-4ccf-bf71-714ca1eb84f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f47198f5-7f4b-4ccf-bf71-714ca1eb84f2
Content-Type: application/json

--- request body ---
{"handle":"qa-ae1e0728d744","displayName":"QA ae1e0728d744","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-f47198f5-7f4b-4ccf-bf71-714ca1eb84f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 7
Location: /v1/accounts/qa-ae1e0728d744
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dc629aaa-bac4-431b-9182-02dc1703376e","handle":"qa-ae1e0728d744","displayName":"QA ae1e0728d744","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.827617748Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dc546108-cc9a-49af-ab8e-2e8730ed853e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc546108-cc9a-49af-ab8e-2e8730ed853e
Content-Type: application/json

--- request body ---
{"handle":"qa-cf388014c967","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc546108-cc9a-49af-ab8e-2e8730ed853e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3d20ce02-65ac-43f3-bef2-3c58b9b1886b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-47b19c73-63aa-4fb6-afb8-177efb529244

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47b19c73-63aa-4fb6-afb8-177efb529244
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ae1e0728d744","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-47b19c73-63aa-4fb6-afb8-177efb529244
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
Location: /v1/conversations/cnv_d7509992-2bad-4fec-9b4b-c9fdcc5117d4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d7509992-2bad-4fec-9b4b-c9fdcc5117d4","subject":"Error contract","status":"open","region":"eu","participants":["qa-cf388014c967","qa-ae1e0728d744"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.884390172Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_d7509992-2bad-4fec-9b4b-c9fdcc5117d4/read
correlation: qa-9ad9406f-8cb8-4790-9ac7-95a0d5c80d64

--- request headers ---
Accept: application/json
X-Fault-Key: 631236b8-0d93-4709-bce1-e4415a7dd67b
X-Fault: unavailable-once
X-Correlation-Id: qa-9ad9406f-8cb8-4790-9ac7-95a0d5c80d64
Content-Type: application/json

--- response: 503 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ad9406f-8cb8-4790-9ac7-95a0d5c80d64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_d7509992-2bad-4fec-9b4b-c9fdcc5117d4/read","correlationId":"qa-9ad9406f-8cb8-4790-9ac7-95a0d5c80d64"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-764d9b31-0745-44de-a49a-fd8245d02c8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-764d9b31-0745-44de-a49a-fd8245d02c8a
Content-Type: application/json

--- request body ---
{"handle":"qa-ae1e0728d744","password":"****"}

--- response: 200 in 28 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-764d9b31-0745-44de-a49a-fd8245d02c8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dc629aaa-bac4-431b-9182-02dc1703376e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aedfd4bd-5310-440e-b34f-e69583a26b84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aedfd4bd-5310-440e-b34f-e69583a26b84
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aedfd4bd-5310-440e-b34f-e69583a26b84
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
correlation: qa-7fd78b2f-5b83-4a27-bed2-3b1d2eaaf063

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fd78b2f-5b83-4a27-bed2-3b1d2eaaf063
Content-Type: application/json

--- request body ---
{"handle":"qa-ae1e0728d744","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7fd78b2f-5b83-4a27-bed2-3b1d2eaaf063
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7fd78b2f-5b83-4a27-bed2-3b1d2eaaf063"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2ca4e36d-1834-4e63-a273-2ade59351b1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ca4e36d-1834-4e63-a273-2ade59351b1f
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2ca4e36d-1834-4e63-a273-2ade59351b1f
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
correlation: qa-eab08849-ce79-44e8-860f-78c9fdbd3aa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eab08849-ce79-44e8-860f-78c9fdbd3aa6
Content-Type: application/json

--- request body ---
{"handle":"qa-cf388014c967","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eab08849-ce79-44e8-860f-78c9fdbd3aa6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eab08849-ce79-44e8-860f-78c9fdbd3aa6"}
```
