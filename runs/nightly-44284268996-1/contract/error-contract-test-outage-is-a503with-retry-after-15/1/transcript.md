# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-04d3315a-466f-4505-9422-84b2b9a110fb` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-1272d68e-769d-4fb1-a900-a1f719183442` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-50d6d9a5-dc80-4fd5-9b4f-3133da77374e` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-daece79b-b5af-49af-8578-6e73a3c48724` |
| 5 | `POST /v1/credits/purchases` | 503 | 26 | `qa-16ec6127-d557-436a-9b25-c16c7835aff5` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-8cb59c46-33d5-43e6-aea7-88432a6503c1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-4cec43a5-1906-43e1-8a15-f021f0e60bfa` |
| 8 | `POST /v1/auth/token` | 401 | 30 | `qa-594f2003-3d40-420d-b579-6cc7ecc8ec29` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-9bb52d67-2767-4fde-b42f-595614992a68` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-6078949b-005f-4fd2-b945-25855d70a2af` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-04d3315a-466f-4505-9422-84b2b9a110fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04d3315a-466f-4505-9422-84b2b9a110fb
Content-Type: application/json

--- request body ---
{"handle":"qa-8bc0a6afa10d","displayName":"QA 8bc0a6afa10d","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-04d3315a-466f-4505-9422-84b2b9a110fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 7
Location: /v1/accounts/qa-8bc0a6afa10d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b414363a-91a8-4a71-bf37-bba5f82bbbab","handle":"qa-8bc0a6afa10d","displayName":"QA 8bc0a6afa10d","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.621900191Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1272d68e-769d-4fb1-a900-a1f719183442

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1272d68e-769d-4fb1-a900-a1f719183442
Content-Type: application/json

--- request body ---
{"handle":"qa-91d17ee517ca","displayName":"QA 91d17ee517ca","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-1272d68e-769d-4fb1-a900-a1f719183442
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 7
Location: /v1/accounts/qa-91d17ee517ca
X-Served-Region: eu
Content-Length: 181

{"id":"acc_058ab85b-deee-4f76-9ace-c82dc8d7470c","handle":"qa-91d17ee517ca","displayName":"QA 91d17ee517ca","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.678037403Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-50d6d9a5-dc80-4fd5-9b4f-3133da77374e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50d6d9a5-dc80-4fd5-9b4f-3133da77374e
Content-Type: application/json

--- request body ---
{"handle":"qa-8bc0a6afa10d","password":"****"}

--- response: 200 in 31 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-50d6d9a5-dc80-4fd5-9b4f-3133da77374e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b414363a-91a8-4a71-bf37-bba5f82bbbab"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-daece79b-b5af-49af-8578-6e73a3c48724

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-daece79b-b5af-49af-8578-6e73a3c48724
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-91d17ee517ca","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-daece79b-b5af-49af-8578-6e73a3c48724
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
Location: /v1/conversations/cnv_4a0dc4fe-77cb-47d4-8ea2-b5c886e4066d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4a0dc4fe-77cb-47d4-8ea2-b5c886e4066d","subject":"Error contract","status":"open","region":"eu","participants":["qa-8bc0a6afa10d","qa-91d17ee517ca"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.758917201Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-16ec6127-d557-436a-9b25-c16c7835aff5

--- request headers ---
Accept: application/json
X-Fault-Key: a4cd664a-1d19-4c19-b67e-249a05ccf5c9
Idempotency-Key: qa-30edfb7778254ac1949a7cc014b4ddbb
X-Fault: unavailable-once
X-Correlation-Id: qa-16ec6127-d557-436a-9b25-c16c7835aff5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-16ec6127-d557-436a-9b25-c16c7835aff5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-16ec6127-d557-436a-9b25-c16c7835aff5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8cb59c46-33d5-43e6-aea7-88432a6503c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cb59c46-33d5-43e6-aea7-88432a6503c1
Content-Type: application/json

--- request body ---
{"handle":"qa-91d17ee517ca","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cb59c46-33d5-43e6-aea7-88432a6503c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_058ab85b-deee-4f76-9ace-c82dc8d7470c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4cec43a5-1906-43e1-8a15-f021f0e60bfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cec43a5-1906-43e1-8a15-f021f0e60bfa
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4cec43a5-1906-43e1-8a15-f021f0e60bfa
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
correlation: qa-594f2003-3d40-420d-b579-6cc7ecc8ec29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-594f2003-3d40-420d-b579-6cc7ecc8ec29
Content-Type: application/json

--- request body ---
{"handle":"qa-91d17ee517ca","password":"****"}

--- response: 401 in 30 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-594f2003-3d40-420d-b579-6cc7ecc8ec29
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-594f2003-3d40-420d-b579-6cc7ecc8ec29"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9bb52d67-2767-4fde-b42f-595614992a68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bb52d67-2767-4fde-b42f-595614992a68
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9bb52d67-2767-4fde-b42f-595614992a68
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
correlation: qa-6078949b-005f-4fd2-b945-25855d70a2af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6078949b-005f-4fd2-b945-25855d70a2af
Content-Type: application/json

--- request body ---
{"handle":"qa-8bc0a6afa10d","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6078949b-005f-4fd2-b945-25855d70a2af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6078949b-005f-4fd2-b945-25855d70a2af"}
```
